package br.com.router;

import br.com.handler.UserHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class ApiRouter {
    private final UserHandler userHandler = new UserHandler();

    public static void handler(HttpExchange exchange) {
        String method = exchange.getRequestMethod();

        if(method.equals(""))
    }
}
