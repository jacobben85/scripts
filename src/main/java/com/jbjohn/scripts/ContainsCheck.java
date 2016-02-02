package com.jbjohn.scripts;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 * CONTAINS
 */
public class ContainsCheck {

    public boolean check(int code) throws IOException, URISyntaxException {

        Integer[] allowedCodes = new Integer[]{200, 201, 304};
        System.out.println(Arrays.asList(allowedCodes).size());

        Integer receivedCode = new Integer(code);

        long startTime = System.currentTimeMillis();
        String host = "https://sqs.us-east-1.amazonaws.com/627758403665/sports-uvn-notification-push-api";

        URI uri = new URI(host);

        if (uri.getPort() > 0) {
            System.out.println(isReachable(uri.getHost(), uri.getPort(), 3000));
        } else {
            System.out.println(isReachable(uri.getHost(), uri.getScheme().equalsIgnoreCase("https") ? 443 : 80, 3000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took "+(endTime - startTime) + " ms");

        return Arrays.asList(allowedCodes).contains(receivedCode);
    }

    private static boolean isReachable(String host, int openPort, int timeOutMillis) {
        try {
            try (Socket soc = new Socket()) {
                soc.connect(new InetSocketAddress(host, openPort), timeOutMillis);
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
