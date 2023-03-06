package org.training.advanced.java;

public class Connection {
    private final String ip;
    private final int port;

    public Connection(String ipParam,
                      int portParam) {
        ip = ipParam;
        port = portParam;
    }


    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }

}
