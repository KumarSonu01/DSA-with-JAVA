import java.util.Scanner;
public class min_of_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]);
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum of an array is: "+min);
    }
}
