import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        java.util.Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int m=0;m<b;m++){
            for(int n=0;n<a;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println(a + b);
    }
}