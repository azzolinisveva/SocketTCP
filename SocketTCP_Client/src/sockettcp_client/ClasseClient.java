package sockettcp_client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClasseClient {

    String nomeServer = "localhost";
    int portaServer = 6789;
    Socket mioSocket = null;
    BufferedReader tastiera = null;
    BufferedReader inDalServer;
    DataOutputStream outVersoServer;
    String stringaUtente = "";
    String stringaRicevutaDalServer = "";

    protected void connetti() {
        System.out.println("CLIENT partito in esecuzione ...");
        try {

        } catch (UnknownHostException e) {

        } catch (IOException e) {

        }
    }

    protected void comunica() {
        try {

        } catch (IOException e) {

        }
    }
}
