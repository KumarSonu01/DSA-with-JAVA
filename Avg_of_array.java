import java.util.Scanner;
public class Avg_of_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of element in Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter the Elements inthe Array:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        for(int num:arr){
            sum+=num;
        }
        int avg=sum/n;
        System.out.println("Sum of array is: "+ sum);   
        System.out.println("Avarage of the Array is :"+ avg);   
    }
}
