import java.util.Scanner;
class Q23 {

      public static void main(String args[])
    {  
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a Binary number: ");
        String n = sc.nextLine();
	int dec=Integer.parseInt(n,2);
       
        System.out.print("hexadecimal number is : "+Integer.toHexString(dec));         
    }
}