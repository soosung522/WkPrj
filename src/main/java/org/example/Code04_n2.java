package org.example;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

public class Code04_n2 {
    public static void main(String[] args) {

         String log = "127.0.0.1 - frank [10/0ct/2000:13:55:36] \" GET / apache_pb.git HTTP/1.0\" 200 2";

        System.out.println( log.indexOf(" "));
        System.out.println(log.substring(0, log.indexOf(" ")));
        System.out.println(log.indexOf("-"));

        int a = log.indexOf("\"");
        int b = log.indexOf(" /",a);

        System.out.println(log.substring(a+1, b));
    }
}
