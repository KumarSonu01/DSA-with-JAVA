import java.util.Scanner;
public class second_largest_part2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the length of the Array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enetr the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The elemnts in the Array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        System.out.println("The largest element in the given array is: ");
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        //Second largest element
        int smax=arr[0];
        System.out.println("The second largest element in the given array is: ");
        for(int i=0;i<n;i++){
            if(max>arr[i] && smax!=arr[i])
            {
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}