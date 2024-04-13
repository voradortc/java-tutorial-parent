package com.example.operators;

// Operators are special symbols that perform specific operations on one, two, 
// or three operands, and then return a result. Operator precedence in Java is
// evaluated in the following order: postfix, unary, multiplicative, additive,
// shift, relational, equality, bitwise AND, bitwise exclusive OR, bitwise
// inclusive OR, logical AND, logical OR, ternary and assignment.
public class Operators {
    public void assignmentArithmeticUnary() {
        // = Assignment Operator: it assigns the value on its right to the
        // operand on its left. The left operand must be a variable.
        int aVariable = 10;

        // + Additive operator: adds the left and right operands or
        // concatenates a string. Association is left-to-right, hence the
        // parenthesis.
        System.out.println( "aVariable plus 2 equals (without parenthesis): " + aVariable + 2 );
        System.out.println( "aVariable plus 2 equals (with parenthesis): " + ( aVariable + 2 ) );

        // - Subtraction operator: substracts the left and right operands.
        System.out.println( "aVariable minus 2 equals: " + ( aVariable - 2 ) );
        
        // * Multiplication operator: multiplies the left and right operands.
        System.out.println( "aVariable times 2 equals: " + aVariable * 2 );

        // / Division operator: divides the left operand by the right operand.
        // Division of two integers will net an integer, truncating the
        // mantissa. Division of any floating point number will net a floating
        // point number.
        System.out.println( "aVariable divided by 3 equals: " + aVariable / 3 );
        System.out.println( "aVariable divided by 3.0 equals: " + aVariable / 3.0 );

        // % Remainder operator: returns the remainder of the division of the
        // left operand by the right operand.
        System.out.println( "The remainder of aVariable divided by 3.0 equals: " + aVariable % 3 );

        // arithmetic operators can be compounded with the assignment operator:
        // +=, -=, *=, /= which becomes equivalent to left operand = left
        // operand (+, -, *, /) right operand. The left operand must be a variable.
        aVariable *= 3;
        System.out.println( "aVariable times 3 equals: " + aVariable );

        // + Unary plus operator; indicates positive value (numbers are
        // positive without this). Must be placed before an operand.
        int anotherVariable = +56;
        System.out.println( "anotherVariable: " + anotherVariable );

        // - Unary minus operator: negates an expression. Must be placed before
        // an operand.
        System.out.println( "-anotherVariable: " + -anotherVariable );
        
        // ++ Increment operator: increments a value by 1. If placed before the
        // operand increment is performed pre-evaluation, if placed on the
        // right increment is performed post-evaluation.
        System.out.println( "++anotherVariable: " + ++anotherVariable );
        System.out.println( "anotherVariable++: " + anotherVariable++ );

        // -- Decrement operator: decrements a value by 1. If placed before the
        // operand increment is performed pre-evaluation, if placed on the
        // right increment is performed post-evaluation.
        System.out.println( "--anotherVariable: " + ++anotherVariable );
        System.out.println( "anotherVariable--: " + anotherVariable++ );
        
        // ! Logical complement operator: inverts the value of a boolean.
        System.out.println( "!true is " + !true );
        System.out.println( "!false is " + !false );
    }

    public void equalityRelationalConditional() {}

    public void bitwiseBitShift() {}
}