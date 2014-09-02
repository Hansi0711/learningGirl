public class FizzBuzz {                      // Everything in Java is a class
	  public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = scan.nextInt();
		System.out.println("Enter the second number");
		int secondNum = scan.nextInt();
		System.out.println("Enter the length");
		int numLength = scan.nextInt();
	    for(int i = 1; i <= numLength; i++) {                    // count from 1 to given length
	      if (((i % firstNum) == 0) && ((i % secondNum) == 0))            // A multiple of both?
	        System.out.print("fizzbuzz");    
	      else if ((i % firstNum) == 0) System.out.print("fizz"); // else a multiple of first number?
	      else if ((i % secondNum) == 0) System.out.print("buzz"); // else a multiple of second number?
	      else System.out.print(i);                        // else just print it
	      System.out.print(" "); 
	    }
	    System.out.println();
	  }
	}
