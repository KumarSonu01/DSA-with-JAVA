import java.util.Scanner;
import java.util.Arrays;
public class reverse_an_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements in arrays: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        //reverse an arrays
        System.out.println("Reversed arrays is: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
