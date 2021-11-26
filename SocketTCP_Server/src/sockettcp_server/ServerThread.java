package sockettcp_server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {

    ServerSocket server = null;
    Socket client = null;
    String striga_ricevuta = "";
    String striga_modificata = "";
    BufferedReader inDalClient = null;
    DataOutputStream outVersoClient = null;

    public ServerThread(Socket socket) {

    }

    @Override
    public void run() {
        try {
            comunica();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public void comunica() throws IOException {

    }
}
