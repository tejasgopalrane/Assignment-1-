import java.util.Scanner;
class Q22 {

      public static void main(String args[])
    {  
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a Binary number: ");
        String n = sc.nextLine();
		
       
        System.out.print("Decimal number is : "+Integer.parseInt(n,2));         
    }
}