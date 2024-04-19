import java.util.Scanner;
public class max_of_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Length of array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Maximum of the given Array is:"+ max);
    }
}