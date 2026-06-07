package opps_fundamentals.variables;

/*
1. Variable: container that hold a value.
        * DataType variableName= vale;
        * can start with $, _, letter. $var, _var, var
        * can't be keywords. like main, int, interface, new ....
        * Constant should be defined in CAPITAL_LETTERS.
            static final int MAX= 23;

2 Java is static and strong typed language
        * We need to specify DataType of the variable everytime.
        * Can only assing the value that is with in a DataType range making it strong.

3. Types of Data types:

** Default values are directly assinged to only class level variables.

a. Primitive types: char, byte, short, int, long,    float, double,                 boolean.
                  [             Integer         ] [     floting point type    ]

       INTEGER
        1. char:
            * 2 bytes, 16 bits
            * character representation of ASCII value.
            * Range: 0(2^0) to 65535(2^15)
            * Default value: 0 "\'u'oooo" to "\uffff"

        2. byte:
            * 1 byte, 8 bits
            * Range: -128 (-2^7) to 127 (-2^7 - 1)
            * default value: 0
            * stores values in signed 2's complement of a number.
            * If the value exceeds the range errors saying int can't be assinged.

        3. shot:
            * 2 byte, 16 bits
            * Range: -2^15 to 2^15 - 1
            * default value: 0
            * stores values in signed 2's complement of a number.
            * If the value exceeds the range errors integer number too large.

        4. int:
            * 4 byte, 32 bits
            * Range: -2^31 to 2^31 - 1
            * default value: 0
            * stores values in signed 2's complement of a number.
            * If the value exceeds the range errors integer number too large.

        5. long: L needed to be at the end of the value.
            * 8 byte, 64 bits
            * Range: -2^63 to 2^63 - 1
            * default value: 0
            * stores values in signed 2's complement of a number.

*/


import java.util.Arrays;

public class Main {

    byte a; //class level variable, value is 0
    public static void main(String[] args){

        byte a1; //local level variable must manually specify the value.
        //System.out.println(a1); //error.  variable a1 might not have been initialized


        char c= 'a';
        System.out.println(c); //a
        char c1= 97;
        System.out.println(c1); //a character representation on ASCII
        //    char c2= "97"; // can't accept String.
        char c3= '9';
        System.out.println(c3); // 9


        byte b= 1;
        System.out.println(b); //1
        byte b1= -2;
        System.out.println(b1); //-2
        //byte b_excess= 128; //directly converting to int.

        short s= 1;
        System.out.println(s); //1
        short s1= -2;
        System.out.println(s1); //-2
        //short s_excess= 3252352626; //error. integer number too large

        int i= 1;
        System.out.println(i); //1
        short i1= -2;
        System.out.println(i1); //-2
        //int i_excess= 3252352626; //error. integer number too large

        long l= 1009L;
        System.out.println(l); //1
        long l1= -298987L;
        System.out.println(l1); //-2


    }
}
