package com.company;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.tree.TreeNode;
import javax.xml.soap.Node;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
       System.out.println( 47000.0*10000+" ");

    }


    public static int  addInt(int num){
        if(num  > 0){
             return num +  addInt(--num );
         }else{
            return  0;
        }
     }
}
