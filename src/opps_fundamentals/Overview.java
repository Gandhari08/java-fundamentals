package opps_fundamentals;

/*
* Java is Platform independent OPPs Language used to development of software.

Features of JAVA
* OPPS: Completely Object based language has features like data hiding, encapsulation, inheritance and polymorphism.
            using this features we can develop highly maintainable and flexible code.

* Platform independent:
* Portable [Write Once, Run Anywhere]: A Java program written on mobile can be runed on Windows or Mac platform.


* JVM ( JAVA Virtual Machine):
        * Is an abstract machine that is used to run byte code.
        *  Java program -> javac -> .class (byte code) -> JVM -> machine code.
        * When Java program is compiled we get byte code which is platform independent, but JVM is platform dependent.
        * JVM does
                a. Loads bytecode
                b. Verifies bytecode
                c. Converts bytecode to machine code
                d. Executes the program
                e. Manages memory (Garbage Collection)
         * How is JVM fast ?
            JVM is an interpreter, so if there is code block that is runed 100's of time it takes time, so JIT (just in time compiler) converts this byte code to machine code such that JVM need not to run multiple times to convert the byte code to machine code.

* JRE ( Java Runtime Environment ): Need to RUN.
        * JVM + Class libraries.
        * JRE is used to resolve the imported code we use using libraries.

* JDK ( Java Deleveopment Kit ):
        * JRE + Development tools
        * Tools:
          javac   → Compiler
          java    → Run program
          Javadoc → Generate documentation
          jar     → Create JAR files
          jdb     → Debugger
        * We need JDK to compile java code.

1. File name and public class name must be same.
2. JAVA single file can only have 1 public class.
        *
3. Class structure: Variables + Methods + Constructors + Inner classes.
4. Whole program should have 1 main method.
        * JVM runs the bytecode from the main() to start the program.
        * main() must be in public class because JVM need to access this method to invoke it.
        * public static void main(){}
            * main -> name of the method
            * void -> no return type
            * public -> can be called from anywhere, access specifier.
            * static -> static makes an object, method class independent.
                        if it static we don't need an object to invoke it, we can invoke static method using class.


*/


// present in the JRE.
import java.util.Arrays;

public class Overview {
    public static void main(String[] arg){
        int a= Math.abs(-1);
        int[] arr= {1, 5, 9};
        Arrays.sort(arr);
        System.out.println("value of a is: " + a);
    }
}


/*          Overview.java
                |
             javac
                |
            byte code(Overview.class) which is platform independent.

*/
