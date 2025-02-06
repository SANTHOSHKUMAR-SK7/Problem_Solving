import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        char[] c=input.nextLine().toCharArray();
        System.out.println("The reversed String is : ");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}
