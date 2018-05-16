package com.whitehare;

import org.xbill.DNS.*;

import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Let get it started");

        try
        {
            InetAddress addr = Address.getByName("www.dnsjava.org");
            System.out.println("Address: " + addr.getHostAddress());
        } catch (Exception e) {

        }

    }
}
