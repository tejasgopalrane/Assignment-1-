import java.util.Scanner;
class Q20 {

      public static void main(String args[])
    {  
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        int n = sc.nextInt();
		
       
        System.out.print("Hexadecimal number is : "+Integer.toHexString(n));         
    }
}