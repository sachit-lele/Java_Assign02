import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convertor {
    public static void main(String[] args) {
        int[] arr = UserInput.getIntArray();
        //take user input and store in an array
        List<Integer> list = new ArrayList<>();
        // convert the array to Array list
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println("Array form is" + Arrays.toString(arr));
        // convert the ArrayList to array
        System.out.println("Array List is " + list);
        
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        System.out.println("New array: " + Arrays.toString(newArr));
    }
}
