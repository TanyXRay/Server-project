package client;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final int PORT = 4004;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(HOST, PORT);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            out.println("Подключаюсь к серверу!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
