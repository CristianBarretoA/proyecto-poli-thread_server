package com.politecnico.so.thread_server.client;

import java.io.IOException;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String msj = "";
        ClientController clientController = new ClientController();
        ClientController clientController2 = new ClientController();
        System.out.println("Inicia el cliente, si desea detener el proceso por favor acudir al ctrl+c");
        while (true) {
            System.out.println("Por favor digite el mensaje que desea enviar");
            msj = scanner.nextLine();
            System.out.println("Ingrese el puerto a atravez del cual desea ejecutar la tarea: 8090 - 8091");
            int thread = scanner.nextInt();
            scanner.nextLine();
            if (thread == 8090) {
                clientController.sendClientMessage(msj, 8090);
            } else {
                clientController2.sendClientMessage(msj, 8091);
            }
            System.out.println("------------------------------------------------------------------------------");
        }

    }
}
