package com.example;

import com.example.inheritance.Base;
import com.example.interfaces.Interfaces;

// This is a class, it defines the blueprint for an object.
public class Main extends Base implements Interfaces {

    // This is the main method, it is the entry point for Java desktop
    // applications.
    public static void main( String[] args ) {
        // Main directly inherits from Base, so it's an instance of Base.
        final Main main = new Main();
        System.out.println( "Is Main a subclass of Base? " + ( main instanceof Base ) );

        // Base has no explicit parent, so it's an Object.
        final Base base = new Base();
        System.out.println( "Is Base a subclass of Object? " + ( base instanceof Object ) );

        // Since Main inherits from Base and Base inherits from Object, it's
        // safe to assume that Main is an Object as well.
        System.out.println( "Is Main a subclass of Object? " + ( main instanceof Object ) );

        // Main implements Interfaces, so it's an Interfaces instance as well.
        System.out.println( "Does Main implement Interfaces? " + ( main instanceof Interfaces ) );
    }

    // You must implement the methods defined in the interface, if you don't
    // you're violating the contract.
    public void doSomething() {
        System.out.println( "Look at me!! I'm doing something" );
    }
}