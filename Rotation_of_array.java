import java.util.Scanner;
public class Rotation_of_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the Length of the Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element on the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        //Rotation of the Array
        System.out.println("Enter the beginning index from which you want to Start Reversing: ");
        int b=s.nextInt();
        System.out.println("Enter the Destination of the Index where you want to stop: ");
        int d=s.nextInt();
        for(int i=b,j=d;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}