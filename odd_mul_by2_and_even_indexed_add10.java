import java.util.Scanner;
public class odd_mul_by2_and_even_indexed_add10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length of the Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enetr the Elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }
            System.out.print(arr[i]+"  ");
        }    
    }
}