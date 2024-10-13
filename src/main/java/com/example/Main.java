package com.example;

public class Main {
    public static void main(String[] args) {

        Par par = new Par<>();
        par.getLista().add(new Integer(1));
        par.getLista().add(new Double(2.5));
        System.out.println(par.getFirst());
        System.out.println(par.getSecond());
    }
}