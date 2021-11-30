package com.politecnico.so.thread_server.server;

public class ServerMain {

    public static void main(String[] args) {
	    // Create two server threads and start a listen socket
        ServerThread serverThread = new ServerThread(8090);
        ServerThread serverThread2 = new ServerThread(8091);
    }
}
