import java.util.Arrays;
import java.util.Scanner;
public class second_largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The length of the array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnts of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("The second Largest Elemnt of the array is: "+arr[n-2]);
    }
}