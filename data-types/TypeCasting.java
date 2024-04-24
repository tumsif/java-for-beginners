/**
 * type casting is when you assign a value of one primitive data type to another type
 */

/**In java there are two types of casting
 * Widening casting - converts a smaller data typ to larger data type
 * byte -> short -> char -> int -> long -> float -> double
 * 
 * Narrowing casting - converts the opposite
 */

// widening casting

// public class TypeCasting {
//     public static void main(String[] args) {
//         int sampleInt = 9;
//         double sampleDouble = sampleInt;  // automatic type casting from int to double

//         System.out.println(sampleInt);
//         System.out.println(sampleDouble);

//     }
// }

// Narrow casting

public class TypeCasting
{
    public static void main(String[] args)
    {
        double sampleDouble = 9.123d;
        int sampleInt = (int) sampleDouble;

        System.out.println(sampleDouble);
        System.out.println(sampleInt);
    }
}