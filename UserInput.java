import java.util.Scanner;

public class UserInput {

    public static int[] getIntArray() {
    
        Scanner scanner = new Scanner(System.in);
        //Here we initiate scanner class
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        //Define the size of the array that the user wants
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            //Enter the elemnets of an array
        }
        return arr;
    }
}

