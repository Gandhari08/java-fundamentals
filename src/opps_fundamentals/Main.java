package opps_fundamentals;

/*
HOW to build a software:
    1. lossy coupled: Encapsulation
    2. Maintainability: Encapsulation


Procedural programing can't do Overloading, Inheritance.
    * Variables that are needed to be changed and passed through different functions in Procedural programing are tightly coupled i.e, The variable is passed to another functions so-and-so making the data carried by the variable exposed.
    * No data hiding
    * No code reusability.

* OOPS: Object oriented programing
        always think in-terms of Object and there relation with other objects and properties of those objects.
        * Object: is real word entity with 2 things property, value, state, field and function, behavior.
        * Class: It is a blueprint/templet of an object.
            * From class, we can create multiple Objects.
            * class defines data variable and data methods.

* Pillars of OPPS:
    1. Data Abstraction: Hiding internal implementation and show only essential functionality.
            * Increase security and confidentiality
            Interface Car {
                applyBreak();
                increaseSpeed();
            }

            class BMW extends Car{
                public applyBreak(){
                    speed--;
                }
                public increaseSpeed(){
                    speed++;
                }
            }
            * User created object of Car interface and calling the methods, all the implementation is hided.
                Car user= new BMW();
            * It is achieved through Interface and Abstract class

      2. Data Encapsulation: Bundling of data and the code that works on the data into 1 single unit.
                * It is used to hide the data.
                Class Person {
                    private int age;

                    int getAge(){
                        return age;
                    }

                    setAge(int newAge){
                        if(newAge >=0){
                           this.age= newAge;
                        }
                        else{
                            throw exception;
                        }
                    }
                }
                * here age is private and no object or class can access this data.
                * encapsulating the private variable and the methods that work on this object into a single unit.

                WHY:
                * Make the code loosely coupled.
                    Child class can access the data via public getter and setter, but any modification can be done in the parent class only.
                * Code Maintainability:
                    If you want to do any preprocessing of the data that a user enters before inserting into the variable, it can be done in public setter()
                    lets say a variable age can be assigned +ve number and >0, if it is public any child can assess the data and modify the data. But we can make the variable private and can implement logic in public setter() making it more maintainable.
                 * Code flexibility:
                     By controlling the access to the variable, I can change the which age is allowed to create the class just by changing the code in public setter(). making it more flexible.

                 HOW:
                 * Using access modifiers: private, default, protected, public

      3. Inheritance:
                 * Capability of class to inherit properties and methods from parent class.
                 * Child class can override methods of parent class.
                 * Parent class don't have access to child class's fields and methods.

                 a. Single inheritance:
                                [ Class Animal ]
                                       |
                                  [ Class Dog ]

                 b. Multi level inheritance:
                                [ Class Animal ]
                                       |
                                  [ Class Dog ]
                                       |
                                 [ Class Puppy]

                 c. Hierarchical inheritance:
                                [ Class Animal ]
                                  /          \
                            [ Class Dog ]  [ Class Cat]

                 d. Multiple inheritance:
                    Diamond problem:
                              [ Class A ]       <-- Common Ancestor (defines method age())
                              /       \
                       [ Class B ]  [ Class C ] <-- Both override age() with different logic
                               \       /
                               [ Class D ]       <-- Inherits from both B and C (Ambiguity!)
                      * Through interface, we can achive the Multiple inhertance.
                      * we can make Class B and Class C interface and give the child D the power to define the logic of age()


                 WHY:
                 * Code reuseability
                 * method overriding
                 * polymorphism

                 HOW:
                 * Using extends keyword.

      4. Polymorphism:
                * A same methods behaves(different logic) in different situation.

                a. Method Overloading/ Complie time Polymorphism/ static Polymorphism
                    * The method is selected at the time of complilation based on inputs.
                    *** only on the bases of parameters overloading is done.

                        * Same method name with different number of parameters.

                    Class Sum{
                        int doSum(int a, int b){
                            return a + b;
                        }
                        int doSum(int a, int b, int c){
                            return a + b + c;
                        }

                                Same method signature problem.
                        // this is not overloading
                        // at the time of compilation it is seen as doSum(a,b,c)
                        // Which already exits.
                        String doSum(int a, int b, int c){
                            return a + b + c;
                        }

                        String doSum(String a, String b){
                            return a + b;
                        }
                    }

                b. Method Overriding/ Run time Polymorphism/ Dynamic Polymorphism
                    * Child class can overrided the behavior of parent class method.
                    * Should have
                            - Same method name
                            - Same arguments
                            - Same return type
                     * which method to call depends on runtime.

                        Class Sum{
                            int doSum(int a, int b){
                                return a + b;
                            }
                        }

                        Class B extends Sum{
                            int doSum(int a, int b){
                                for(i=1, i < a; i++){
                                    b= b + 1;
                                }
                            }
                            return b;
                        }

                        Sum x= new SUM();
                        x.doSum(2, 3); calls Sum class method.

                        B y= new B();
                        y.doSum(2, 3); calls B class method.

                       Sum z= new B();
                       z.doSum(2, 3); calls B class method.



                WHY:
                    * It allows you to write flexible, reusable, and extensible code that works with different types of objects
                HOW:
                    * Using inheritance


* */





public class Main {
}
