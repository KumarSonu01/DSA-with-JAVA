import java.util.Scanner;
public class Intialization {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}