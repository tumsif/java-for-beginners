/**Data types in java are declared into two groups
 * Primitive data types - includes byte, short, int, long, float, double, boolean, char
 * Non primitive data types such as String, Arrays and Classes.
 * 
 * Primitive data type
 * byte - 1 byte stores whole number data ranging from -127 to 128
 * short - 2 bytes stores whole number ranging from -32768 to 32767
 * int - 4 bytes stores whole number ranging from -2,147,483,648 to 2,147,483,647
 * long - 8 bytes stores whole no ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * float - 4 bytes stores fractional numbers storing 6 to 7 decimal places
 * double - 8 bytes fractional numbers storing 15 decimal digits
 * boolean - i bit stores true or false
 * char - 2 bytes stores character letter or ASCII values
 */

class DataType
{
    // note that we can use types such as byte if we are sure it doess not exceed the limit
    // example marks can not exceed 127
    private byte marks = 90;

    // int is the most prefarrable data type
    private int intValue = 10000;

    // long values must end with an 'L'
    private long longValue = 1000000L;

    // float ends with an 'f'
    private float pi = 3.14f;

    // double ends with a 'd'
    private double meanAmount =  9.82848484d;

    /**
     * Should I Use float or double?
     * The precision of a floating point value indicates how many digits 
     * the value can have after the decimal point. 
     * The precision of float is only six or seven decimal digits, 
     * while double variables have a precision of about 15 digits. 
     * Therefore it is safer to use double for most calculations.
     */

    // floating numbers can also be a scientific number with an 'e' to indicte the power of ten

    private float meltingPoint = 23e4f; // this means (23*10^4) with an ending of float

    private double extraLongDecimal = 12e8d;

    private boolean hasStudentPass = true;

    // char type must be surrounded by single quotes

    private char grade = 'A';

    // in case of ASCII values they are declared using a character keyword
    private char ascii = 80;

    /**
     * A String datatype stores sequence of characters
     * Surrounded with double quotes
     * A string is a non-primitive data type
     */
    private String fullName = "Tumsifu Praygod lema";

    public static void main(String[] args){
        DataType data = new DataType();
        System.out.println("Your marks is " + data.marks);
        System.out.println("Interger value is " + data.intValue);
        System.out.println(data.longValue);
        System.out.println(data.pi);
        System.out.println(data.meanAmount);
        System.out.println(data.meltingPoint);
        System.out.println(data.extraLongDecimal);
        System.out.println(data.hasStudentPass);
        System.out.println("You have scored " + data.grade + " in your examinations");
        System.out.println(data.ascii);
        System.out.println("My name is " + data.fullName);
    } 


}

/**
 * Difference between non-primitive data type and primitive
 * 1. Primitive are predefined (already defined) in java. Non primitive are created by programmer
 * and is not defined except for strings
 *
 * 2. Non-primitive types can be used to call methods to perform certain operations, while primitive can't.
 * 3. A primitive has always a value, while non-primitive can be null.
 * 4. Primitive starts with lowercase letter while non-primitive starts with uppercase.
 * 5. Size of primitive type depends on data type, while non-primitive types have all the same size.
 * The non primitive data types are Strings, Arrays, Classes, Interface.
 */