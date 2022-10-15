package com.siit.course;
import static com.siit.course.utils.MathFunctions.isPrimeNumber;

public class Course03 {

    static int x = 0;

    public static void course03(String[] args) {

        final double PI = 3.14;
        final int MAX_SIZE = 100; // naming convention all uppercase split by _
        int y = 100; // primitive
        String name = "Alex";
        char myChar = 'a';
        y = y + 5; // y += 5;

//        PI = 1.34;
        float a = 100.4f;
        double b = 100.4;

        boolean myBool = true;
        char myChar2 = 97;

        Integer i1 = 100; // wrapper object on top of int primitive

        System.out.println("Hello course 03!!");
        System.out.println(name);
        System.out.println("My name is " + name);

        System.out.println(args[0] + " " +  args[1]);
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//        System.out.println(args[2]);
        System.out.println(myChar2);
        System.out.println( 500 / 3);
        System.out.println( 500 / 3.0);

        if ( x > 5 ) {
            System.out.println("Number is greater than 5");
        }

        if (y < MAX_SIZE) {
            System.out.println("Number is less than " + MAX_SIZE);

        }
        else {
            System.out.println("Number exceeds the max size of " + MAX_SIZE);
        }

        switch (y) {
            case 0: { // y == 0 --> TRUE
                System.out.println("Number is 0");

                break;
            }
            case 1: { // y == 1 --> TRUE
                System.out.println("Number is 1");

                break;
            }
            default: {
                System.out.println("Not 0 not 1 ");

            }
        }
        // while example
        int index = 0;
        while(myBool) {
            System.out.println("WHILE Infinite loooop !!!! " + index);
            if (index > 10) {
                myBool = false;
            }
            index++;
        }
        // do while example
        myBool = true;
        index = 0;
        do {
            System.out.println("DO WHILE Infinite loooop !!!! " + index);
            if (index > 10) {
                myBool = false;
            }
            index++;
        }
        while (myBool);

        index = 0;
        // rewrite whithout myBool
        do {
            System.out.println("DO WHILE Infinite loooop !!!! " + index);
            if (index > 10) {
                break;
            }
            index++;
        }
        while (true);

        for (index = 0 ; index <= 10 ; index++) {
            System.out.println("FOR Infinite loooop !!!! " + index);
        }

        for (index = 0 ; index < args.length; index++) {
            System.out.println(args[index]);
        }

        for (String s : args) { // for each value from the array element by element, equivalent to foreach
            System.out.println(s);
        }

        for (char c : name.toCharArray()) {
            System.out.println(c);
        }

        int sum = 0;
        for (int i = 1 ; i <= MAX_SIZE ; i++) {
            sum = sum + i; // sum += i;
        }
        System.out.println("Suma este " + sum);

        System.out.println("Suma este " + (MAX_SIZE * (MAX_SIZE + 1))/ 2);

        final int MAX_NUMBER = 1000000;
        int countPrime = 0;
        for (int i = 2; i < MAX_NUMBER; i++) {
            // i is the current number we test if it is prime :)
            boolean isPrime = isPrimeNumber(i);
            if(isPrime) {
                System.out.println("Number " + i + " is prime");
                countPrime++;
            }
//            else {
//                System.out.println("Number " + i + " is not prime!");
//            }
        }
        System.out.println("Totoal number of primes are " + countPrime);
        boolean pn = isPrimeNumber(12345);
    }


}
