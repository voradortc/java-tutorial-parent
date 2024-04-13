package com.example.variables;

// A variable defines something that can hold a value or a reference to
// something. Variable names are case-sensitive and have to begin with a letter,
// the dollar sign "$", or the underscore character "_". no spaces are allowed.
public class Variables {
    // An instance variable is the one defined inside a class and not delared
    // static. Its value is defined by each instance of the class.
    public String instanceVariable;

    // A class variable is the one defined inside a class and declared static.
    // Its value is global and not unique to each instance of the class.
    public static String classVariable;

    // A parameter is the name given to variables that can be specified when a
    // method is called.
    public void explainVariables( String parameter ) {
        // A local variable is the one declared inside a method, and can only
        // be accessed inside that method.
        String localVariable = "this thing";

        System.out.println( "Look at me!! I'm doing something with " + localVariable + " and " + parameter + "." );
    }
}