package com.company;

import java.util.Scanner;

public class HelloName {
    public static void main (String []args){
        Scanner t=new Scanner(System.in);
        System.out.println("Ввести имя");
        String r=t.nextLine();
        System.out.println( "Hello " + r);

    }
}