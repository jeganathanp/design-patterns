package dev.jegan.singleton;

import java.net.SocketImpl;

/**
 * Two steps involved in creating simple singleton
 * 1) Private constructor
 * 2) Public method to access the instance
 */
public class SimpleSingleton {

    private static  SimpleSingleton instance;
    private SimpleSingleton(){
        System.out.println("Single ton class");
    }

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }

        return  instance;
    }

    public void doSomething(){
        System.out.println("Some output");
    }
    public static void main(String args[]){
        SimpleSingleton.getInstance().doSomething();
    }
}
