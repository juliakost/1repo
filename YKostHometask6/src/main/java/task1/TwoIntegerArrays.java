package task1;

import java.util.Random;

public class TwoIntegerArrays {
    public static void main(String[] args) {

        int myIntArray1[] = new int[3];
        int myIntArray2[] = new int[3];

        Random rand = new Random();

        myIntArray1[0] = rand.nextInt(10);
        myIntArray1[1] = rand.nextInt(10);
        myIntArray1[2] = rand.nextInt(10);

        myIntArray2[0] = rand.nextInt(10);
        myIntArray2[1] = rand.nextInt(10);
        myIntArray2[2] = rand.nextInt(10);

        System.out.println("Array1: [" + myIntArray1[0] + ", " + myIntArray1[1] + ", " + myIntArray1[2] + "]");
        System.out.println("Array2: [" + myIntArray2[0] + ", " + myIntArray2[1] + ", " + myIntArray2[2] + "]");


        int sum = myIntArray1[0] + myIntArray1[1] + myIntArray1[2] + myIntArray2[0] + myIntArray2[1] + myIntArray2[2];


        System.out.println("SUM is: " + sum);


    }
}



