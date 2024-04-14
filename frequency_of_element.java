import java.util.Scanner;
import java.util.Arrays;
public class frequency_of_element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the Arrays:");
        int n=s.nextInt();
        int arr[]=new int[n];
        int count=0;
        System.out.println("Enter the elemnts of the arrays:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the elments to get the occurance in the created array");
        int a=s.nextInt();
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                index=i;                
                count++;
                
            }
        }
            System.out.println("The element is found "+count+" times");
    }        
}