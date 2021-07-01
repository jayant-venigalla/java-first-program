package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] x = {1,2,3};
        System.out.println(add(x));

    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }

    private static int add(int[] numbers){
        int sum = 0;
        for (int i:numbers) {
            sum += i;
        }
        return sum;
    }


}
