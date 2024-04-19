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
        searching
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                System.out.println(num+"Found at index"+i);
                break;//Remove it to get multiple Index having Same value
            }
            else{
                System.out.println("Not Found");
                break;
            }
        }
        //For the same number having last index
        for(int i=n-1;i>=0;i--){
            if(num==arr[i]){
                System.out.println(num+"Found at index"+i);
                break;
            }
        }
    }
}