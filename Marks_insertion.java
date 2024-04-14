import java.util.Scanner;
public class Marks_insertion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the No.of students: ");
        int n=s.nextInt();
        s.nextLine();
        String name[]=new String[n];
        System.out.println("Enter the Name: ");
        for(int i=0;i<n;i++){
            name[i]=s.nextLine();
        }
        int marks[]=new int[n];
        System.out.println("Enter the marks of students: ");
        for(int j=0;j<n;j++){
            marks[j]=s.nextInt();
        }
        for(int k=0;k<n;k++){
            System.out.println(name[k]+" has scored "+marks[k]);
        }
    }
}