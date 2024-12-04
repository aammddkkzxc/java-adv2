package network.tcp.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV2 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        Socket socket = serverSocket.accept();
        log("소켓 연결: " + socket);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        while (true) {
            String received = inputStream.readUTF();
            log("client -> server: " + received);

            if (received.equals("exit")) {
                break;
            }

            String toSend = received + " world~";
            outputStream.writeUTF(toSend);
            log("client <- server: " + toSend);
        }

        log("연결 종료: " + socket);
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();

    }

}