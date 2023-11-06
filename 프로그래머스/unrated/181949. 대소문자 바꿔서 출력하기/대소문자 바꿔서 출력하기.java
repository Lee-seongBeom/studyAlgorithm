import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String output = "";
        for(int i=0; i<a.length(); i++){
            
            
            if(65 <= a.charAt(i) && 90 >= a.charAt(i)){
                output+= String.valueOf(a.charAt(i)).toLowerCase();
            }else{
                output+= String.valueOf(a.charAt(i)).toUpperCase();
            }
        }
        
        System.out.print(output);
    }
}