import java.util.Scanner;
public class D2_Initialization {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=s.nextInt();
        System.out.println("Enter the Column");
        int c=s.nextInt();
        int arr[][]=new int[r][c];

        //To take input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                arr[i][j] = s.nextInt();
            }
        }

        //Output
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }        
    }
}