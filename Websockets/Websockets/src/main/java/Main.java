import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) {
        SocketServer socketServer = new SocketServer(new InetSocketAddress("0.0.0.0", 2000));
        socketServer.start();
    }
}
