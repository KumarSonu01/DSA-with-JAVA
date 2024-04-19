import java.util.Scanner;
import java.util.Arrays;
public class Unique_Element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Length of the array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element in the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Finding Unique Number
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1 && arr[i]==arr[i+1]){
                i++;
            }
            else System.out.print(arr[i] + " ");
            
        }
    }
}
