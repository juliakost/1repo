package task2;

public class CalculateTwoDimArray {

    public static void main(String[] args) {

        double myDoubleArray[][] = new double[3][3];

        myDoubleArray[0][0] = 1.0;
        myDoubleArray[0][1] = 1.5;
        myDoubleArray[0][2] = 2.0;

        myDoubleArray[1][0] = 1.5;
        myDoubleArray[1][1] = 2.0;
        myDoubleArray[1][2] = 2.5;

        myDoubleArray[2][0] = 2.0;
        myDoubleArray[2][1] = 2.5;
        myDoubleArray[2][2] = 3.0;

        //The sum of the diagonal array products

        System.out.println("The sum of the diagonal array products is: " + ((myDoubleArray[0][0] + myDoubleArray[1][1] + myDoubleArray[2][2]) + (myDoubleArray[0][2] + myDoubleArray[1][1] + myDoubleArray[2][0])));


        //The product of the middle multiplication of the row and the middle column of the array

        System.out.println("Result of multiplication of middle row and middle column is:" +
                " " + (myDoubleArray[1][0] * myDoubleArray[1][1] * myDoubleArray[1][2] * myDoubleArray[0][1] * myDoubleArray[1][1] * myDoubleArray[2][1]));

        //The sum of all elements at the edge of the board

        System.out.println("The sum of all elements at the edge of the board is: " +
                " " + ((myDoubleArray[0][0] + myDoubleArray[0][1] + myDoubleArray[0][2]) + (myDoubleArray[2][0] + myDoubleArray[2][1] + myDoubleArray[2][2]) + myDoubleArray[1][0] + myDoubleArray[1][2]));


    }
}

