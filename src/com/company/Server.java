package com.company;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyHttpHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        OutputStream outputStream = httpExchange.getResponseBody();
        ;
        String j = "[\"1\",\"7\",\"a\",\"vv\",\"mq\",\"11\",\"99\",\"08\",\"76\",\"9gkjhgf\",\"fg\",\"fg\",\"1\"]";
        // this line is a must
        httpExchange.sendResponseHeaders(200,j.length() );

        outputStream.write(j.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
public class Server {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("192.168.0.14", 8001), 0);
        server.createContext("/", new MyHttpHandler());


        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);


        server.setExecutor(threadPoolExecutor);
        server.start();
       // logger.info(" Server started on port 8001");

    }
    
}

