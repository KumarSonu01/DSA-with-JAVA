import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element in array : ");
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println(("Enter the element of the array : "));
        //Tking input and display
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");     
        }
        //sum of array
        for(int num:arr){
            sum+=num;
        }
        System.out.println("Sum is:"+sum);
    }
}