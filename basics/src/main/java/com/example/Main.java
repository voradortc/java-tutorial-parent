package com.example;

import com.example.arrays.Arrays;
import com.example.operators.Operators;
import com.example.primitives.Primitives;
import com.example.variables.Variables;

public class Main {
    String instanceVariable;

    static String classVariable;

    public static void main( String[] args ) {
        Variables variables1 = new Variables();
        variables1.instanceVariable = "thing #1";
        
        Variables variables2 = new Variables();
        variables2.instanceVariable = "thing #2";

        Variables.classVariable = "another thing";

        // Instance variables have unique values per instance, hence the name.
        variables1.explainVariables( variables1.instanceVariable );
        variables2.explainVariables( variables2.instanceVariable );

        // Class variables have unique values per class and are the same
        // whether accessed across instances or via class.
        variables2.explainVariables( Variables.classVariable );

        // You don't need to declare a variable to use an object.
        new Primitives().explainPrimitives();
        new Arrays().playWithArrays();
        new Operators().assignmentArithmeticUnary();
        new Operators().equalityRelationalConditional();
        new Operators().bitwiseBitShift();
    }
}