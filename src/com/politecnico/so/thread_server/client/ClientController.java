package com.politecnico.so.thread_server.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientController {

    public void sendClientMessage(String message, int port) throws IOException {
        Socket clientSocket = new Socket("192.168.20.20", port);
        DataOutputStream stream = new DataOutputStream(clientSocket.getOutputStream());
        stream.writeUTF(message);
        stream.close();
    }

}
