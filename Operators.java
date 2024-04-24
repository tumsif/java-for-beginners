/**
 * Java divides the operators into the following groups:

    1.Arithmetic operators
    2.Assignment operators
    3.Comparison operators
    4.Logical operators
    5.Bitwise operators
    6.Unary operators

 */

// Arithmetic operators
// {+, -, *, /, %, ++, --}

// ASSIGNMENT operators
// {=, &=, |=, ^=, >>=, <<=}

/**BITWISE OPERATORS */
// & - BITWISE AND
// | - BITWISE OR
// ^ - BITWISE XOR
// ~ - BITWISE NOT - returns the 2nd complement

/**
 * 
 */



/**SHIFT OPERATORS */
// << shift to the left
// >> shift to the right

/**
 * << -- shifts bit pattern to the left
 *       For example let x = 4 = 0100
 *       so x<<=4 will yield 001000000 = 64 
 * 
 * >> -- shifts bit pattern to the right
 *       For example let x = 4 = 
 */

/**NEGATION OPERATORS */
// ~ negation of values for boolean or interger values
// 

class Operators
{
    public static void main(String[] args)
    {
        /**Example to demonstrate shift operators*/
        int x = 5; // 0101
        int y = -5;
        boolean d = true;       
        System.out.println(x<<4); // 01010000 expects 80
        System.out.println(x>>4); // 00000101 we are expecting 5 but we got 0
        System.out.println(x++); // expects 5
        // ++x = (x = x+2)
        // System.out.println(++x); // expects 7
        // System.out.println(x++ + ++x); // we are expecting 13 but we will get 16 this is because of ++x above
   
        System.out.println(x++ + x++); 
        /**It is to note that (x++ + x++) = (5++ + ++5) = 5+6 =11 */
        // we are expecting 11 but we got 19 because of the ++x above which gives the value of 7
        System.out.println(x);
        System.out.println(~x); // 2nd complement of 5 gives -6
        System.out.println(~y); // 2nd complement of -5 gives 4
    }
}
