import java.util.Scanner;
class Q21 {

      public static void main(String args[])
    {  
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        int n = sc.nextInt();
		
       
        System.out.print("Hexadecimal number is : "+Integer.toOctalString(n));         
    }
}