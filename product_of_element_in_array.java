import java.util.Scanner;
import java.util.Arrays;
public class product_of_element_in_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of the Arrays");
        int n=s.nextInt();
        int arr[]=new int[n];
        int product=1;
        System.out.println("Enter the elwemnt of the arrays");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(+arr[i]+" " );
        }
        //product
        for(int num:arr){
            product*=num;
        }
        System.out.println("Product of the array elements are"+product);
    }
}