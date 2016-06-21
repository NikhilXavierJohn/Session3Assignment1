public class session3Assignment1{

    @SuppressWarnings("resource")
	public static void main(String args[]) {
      
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter number to find square root in Java : ");
      
        
        double square = scanner.nextDouble();
      
      
        
        double squareRoot = Math.sqrt(square);
      
        
        System.out.print("Square root of number "+square+" is "+squareRoot);
    
    }
}
