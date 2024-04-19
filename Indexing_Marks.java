import java.util.Scanner;
public class Indexing_Marks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the No. of Students: ");
        int n=s.nextInt();
        int marks[]=new int[n];
        System.out.println("Enter the Marks of those students: ");
        for(int i=0;i<n;i++){
            marks[i]=s.nextInt();
            System.out.print(marks[i]);
        }
        System.out.println("The students who scored less than 35: ");
        for(int i=0;i<n;i++){
            if(marks[i]<35){
                System.out.print(marks[i]+" ");
            }
        }
    }
}