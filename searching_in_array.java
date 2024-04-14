import java.util.Scanner;
public class searching_in_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("Target number: ");
        int num=s.nextInt();
        //searching
        int index=0;
        for(int i=0;i<n;i++){
            if (arr[i]==num){
                index=i;
                break;
            }
        }
        if(index!=0){
            System.out.println("Found "+num+"at index: "+index);
        }
        else{
            System.out.println("Not Found");
        }
    }
}