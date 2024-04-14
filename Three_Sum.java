import java.util.Scanner;
public class Three_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the Target number: ");
        int target=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;i++){
                for(int k=i+2;i<n;i++){
                    if(target==arr[i]+arr[j]+arr[k]){
                        System.out.print(i+","+j+","+k);
                    }
                }
            }
        }
    }
}
