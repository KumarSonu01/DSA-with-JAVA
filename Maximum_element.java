import java.util.Scanner;
public class Maximum_element {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the NO.of inputs you want to take: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element in the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        //Maximum elemennt in the array
        System.out.println();
        System.out.println("Maximum element of the array is: ");
        int max=-1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}