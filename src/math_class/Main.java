package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI
        double myPI = Math.PI;

        // abs
        int num1 = -2;
        System.out.println(Math.abs(num1));
        // pow
        double num2 = Math.pow(3,5);
        System.out.println(num2);
        // sqrt
        double num3 = Math.sqrt(80);
        //System.out.println(Math.pow(num3)); //round off error

        //create a random number in the range [0,1)
        double random1 = Math.random();
        System.out.println(random1);



        //create a random number in the range [0, n)
        double random2 = (int)(Math.random()*6);
        System.out.println(random2);
        // create a random number in the range [0,n]
        double random3 = Math.random() *7;
        // create a random integer in the range [m,n]
        int random4 = (int)(Math.random()*4) + 4;
        System.out.println(random4);

       // (int) Math.random() * (-m -1));




    }
}
