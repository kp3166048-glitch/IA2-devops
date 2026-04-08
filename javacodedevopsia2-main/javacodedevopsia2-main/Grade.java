import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;

public class SimpleJavaServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(5020), 0);
        server.createContext("/", exchange -> {
            String response = "<h1>Hello from Docker Java Container</h1>";
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });
        server.start();
        System.out.println("Server running on port 5020...");
    }
}
