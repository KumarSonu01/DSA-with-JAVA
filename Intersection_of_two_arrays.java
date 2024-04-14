import java.util.Scanner;
public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of 1st array: ");
        int n1=s.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter the Element of the 1st Array: ");
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //2nd array
        System.out.println("Enter the length of the 2nd Array: ");
        int n2=s.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the Elemnt in the 2nd Array: ");
        for(int j=0;j<n2;j++){
            arr2[j]=s.nextInt();
            System.out.print(arr2[j]+" ");
        }
        System.out.println();
        System.out.println("Intersected array is: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
                
            }
        }
    }
}
