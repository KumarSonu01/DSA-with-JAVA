import java.util.Scanner;
public class duplicate_elements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnts: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Checking and printing duplicate elements
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements are: "+arr[i]);
                }
            }
        }
    }
}