package com.politecnico.so.thread_server.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerThread extends Thread {

    private final Thread thread;
    private final int port;

    public ServerThread(int port) {
        this.thread = new Thread(this);
        this.port = port;
        System.out.println("Inicia thread: " + this.thread.getName());
        this.start();
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(this.port);
            while (true) {
                Socket socket = serverSocket.accept();
                long time = new Date().getTime();
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                System.out.println("Se recibio el msg: '" + inputStream.readUTF() + "' en el hilo " + this.thread.getName());
                long time2 = new Date().getTime();
                System.out.println("Su proceso tardo " + (time2 - time) + "ms");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
