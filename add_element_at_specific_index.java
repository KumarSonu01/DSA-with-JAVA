import java.util.Scanner;
import java.util.Arrays;
public class add_element_at_specific_index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to be added in the given array:");
        int a=s.nextInt();
        System.out.println("Enter at which index you want to put it in:");
        int b=s.nextInt();
        if (b<0||b>n) {
            System.out.println("Invalid index. Please enter again.");
        } else {
            arr = addElementAtSpecificIndex(arr,a,b);
            System.out.print("The new array is: ");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[] addElementAtSpecificIndex(int[] array, int element, int index) {
        int length = array.length;
        int[] newArray = new int[length+1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index]=element;
        for (int i=index+1;i<length+1;i++) {
            newArray[i]=array[i-1];
        }
        return newArray;
    }
}