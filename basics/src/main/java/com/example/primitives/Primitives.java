package com.example.primitives;

import java.math.BigInteger;

// Java is statically-typed, all variables must be declared before being used.
public class Primitives {
    // A primitive type is one which holds a value only and not a reference
    // to an object; if a variable is not declared as a primitive it means
    // it's a reference type. The primitive types in Java are:
    // - byte: 8-bit signed two's complement integer.
    byte byteVar;
    // - short: 16-bit signed two's complement integer.
    short shortVar;
    // - int: 32-bit signed two's complement integer.
    int intVar;
    // - long: 64-bit two's complement integer.
    long longVar;
    // - float: single-precision 32-bit IEEE 754 floating point.
    float floatVar;
    // - double: double-precision 64-bit IEEE 754 floating point.
    double doubleVar;
    // - boolean: it has only two possible values: true and false. This data type represents one bit of information, but its "size" is platform dependant.
    boolean booleanVar;
    // - char: single 16-bit Unicode character;
    char charVar;

    public void doSomething() {
        // Class and instance primitives are initialized with default values.
        // Local primitives need to be initialized.
        System.out.println( "The default value of byte is: " + byteVar );
        System.out.println( "The default value of short is: " + shortVar );
        System.out.println( "The default value of int is: " + intVar );
        System.out.println( "The default value of long is: " + longVar );
        System.out.println( "The default value of float is: " + floatVar );
        System.out.println( "The default value of double is: " + doubleVar );
        System.out.println( "The default value of boolean is: " + booleanVar );
        System.out.println( "The default value of char is: '" + charVar + "'" );

        // Primitive types are initialized using literals (numbers, characters,
        // true or false, etc). Think of them as a fixed value that does not
        // require computation.
        char printMe = '愛';
        System.out.print( "The printMe variable was initialized to: '" + printMe + "'." );

        // Reference types are initialized using the keyword "new" or a String
        // literal (using double quotes, single quotes defines a char).
        String printMeToo = "is the kanji for love.";
        BigInteger printMeThree = new BigInteger( Integer.toHexString( printMe | 0x10000 ), 16 );
        System.out.println( " '" + printMe + "' " + printMeToo + " #" + printMeThree + " in unicode." );

        // Number literals that end with an l (or L) are longs, you can use
        // underscore for readability purposes.
        longVar = 100_000L;
        System.out.println( "100_000L is a long for: " + longVar );

        // You can declare hexadecimal (0x) or binary (0b) literals.
        System.out.println( "0x1a is an int for: " + 0x1a );

        // Floating literals are doubles unless they end with an f (or F), they
        // can be written in scientific notation. Underscore cannot go before
        // or after the decimal point.
        floatVar = 1.2e2f;
        System.out.println( "1.2e2f is a float for: " + floatVar );
    }
}