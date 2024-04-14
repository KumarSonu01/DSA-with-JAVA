import java.util.Scanner;
import java.util.Arrays;
public class union_of_arrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of 1st Array: ");
        int n1=s.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter the element in the 1st Array:- ");
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
            //System.out.print(arr1[i]+" ");
        }
        //2nd Array
        System.out.print("Enter the length of 2nd array: ");
        int n2=s.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter the element of 2nd Array: ");
        for(int j=0;j<n2;j++){
            arr2[j]=s.nextInt();
            //System.out.print(arr2[j]+" ");
        }
        //Unity of arrays
        int n3  = n1+n2;
        int[] arr3 = new int[n3];
        for(int i = 0;i<n3;i++)
        {
            if(i < n1)
            {
                arr3[i] = arr1[i];
            }
            else
            {
                arr3[i] = arr2[i-n1];
            }
        } 
        for(int i = 0;i<n1+n2;i++)
        {
            System.out.printf(arr3[i]+" ");
        }
    }
}