package com.example.arrays;

public class Arrays {
    public void playWithArrays() {
        // Arrays are declared by adding square brackets to the variable
        // declaration after the type or name (this method is discouraged).
        int[] anArray;
        int anotherArray[] = { 1, 2, 3 };

        // Can be initialized with the new keyword and specifying length or
        // by using shortcut syntax (elements in curly braces as above and only
        // in the declaration).
        anArray = new int[3];

        // The length is fixed after creation and elements are accessed via a
        // numeric index (from 0 to n exclusive)
        anArray[0] = anotherArray[2];

        // They can be multidimensional i.e. arrays of arrays. 
        int[][] multidimensionalArray = new int[2][];

        // In internal arrays are not restricted to the same size.
        multidimensionalArray[0] = new int[3];
        multidimensionalArray[1] = new int[2];

        // Can be copied efficiently via System.arraycopy
        System.arraycopy( anotherArray, 0, multidimensionalArray[0], 0, 3 );

        // The Arrays class has useful methods to manipulate them like toString and copy.*/
        multidimensionalArray[1] = java.util.Arrays.copyOfRange( anArray, 0, 2 );
        String multidimensionalArrayString = java.util.Arrays.deepToString( multidimensionalArray );
        
        System.out.println( multidimensionalArrayString );
    }
}