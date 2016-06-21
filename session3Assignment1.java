import java.util.Scanner;

public class session3Assignment1{

    @SuppressWarnings("resource")
	public static void main(String args[]) {
      
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter number to find square root in Java : ");
      
        
        double num = scanner.nextDouble();
      
      
        
        double squareRoot = Math.sqrt(num);
        double cubeRoot = Math.cbrt(num);
      
        
        System.out.println("Square root of number "+num+" is "+squareRoot);
        System.out.println("Cube root of number "+num+" is "+cubeRoot);
    }
}
