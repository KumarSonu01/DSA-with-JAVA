import java.util.Arrays;
import java.util.Scanner;
public class two_sum {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the length of the array: ");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the Elements: ");
       for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
       }  
       System.out.println("Enter the Target: ");
       int target=s.nextInt();
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(target==arr[i]+arr[j]){
                System.out.println("The indeces are: "+i+","+j);
            }
        }
       }
    }
}