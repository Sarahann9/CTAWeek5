import java.util.Scanner;

public class RecursiveMethod {
    public static int sum(int[] array, int i) {
        if (i == 0 ) { return array[i]; } //Base case
        else {
            return array[i] + sum( array, i -1) ;  }//Recursive case
    }

    public static void main(String[] args) {
        //Declare scanner and collect user inputs
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = scnr.nextInt();
        System.out.print("Enter a number: ");
        int n2 = scnr.nextInt();
        System.out.print("Enter a number: ");
        int n3 = scnr.nextInt();
        System.out.print("Enter a number: ");
        int n4 = scnr.nextInt();
        System.out.print("Enter a number: ");
        int n5 = scnr.nextInt();

        //Add inputs into an array
        int i = 5; // Set array length
        int[] array = new int[i];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        array[3] = n4;
        array[4] = n5;

        //Call on method
        int arraySum = sum(array, i-1);
        System.out.print("The sum of the 5 numbers provided is: " + arraySum );

    }
}