package tuan4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Bai123 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("www.google.com");
        String name = inet.getHostName();
        String ip = inet.getHostAddress();
        boolean isIP4 = inet instanceof java.net.Inet4Address;
        boolean isIP6 = inet instanceof java.net.Inet6Address;
        System.out.printf("NAME : %s\nIP : %s\nIP4 : %s\nIP6 : %s\n",name,ip,isIP4, isIP6);
    }
}
