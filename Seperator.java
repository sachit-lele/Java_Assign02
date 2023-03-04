public class Seperator{
    public static void main(String[] args) {

        int[] arr = UserInput.getIntArray();
        //Initiated an array which gets user input and stores it 
        int[] evenArr = new int[arr.length];
        int[] oddArr = new int[arr.length];
        //Then two arrays one to store odd digits and the other for even
        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
            //for loop to store in either of the arrays
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + ", ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + ", ");
            //Finally output is printed 
        }

    }
}
