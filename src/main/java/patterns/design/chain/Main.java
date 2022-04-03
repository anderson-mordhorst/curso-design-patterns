package patterns.design.chain;

import patterns.design.chain.middlewares.CheckPermissionMiddleware;
import patterns.design.chain.middlewares.CheckUserMiddleware;
import patterns.design.chain.middlewares.Middleware;
import patterns.design.chain.server.Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static Server server;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void init() {
        server = new Server();
        server.registerUser("master@hcode.com.br", "65435jtgurij");
        server.registerUser("user@hcode.com.br", "admin123");

        Middleware middleware = new CheckUserMiddleware(server)
                .link(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws Exception {
        init();
        boolean done;
        do {
            System.out.println("Digite o e-mail");
            String email = reader.readLine();
            System.out.println("Digite sua senha");
            String password = reader.readLine();
            done = server.login(email, password);
        } while(!done);
    }
}
