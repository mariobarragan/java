class FizzBuzz {
	public static void main(String args[]){
	int n; //n is a number
		for (n = 1; n < 101; n++){
			if(n % 3 == 0 & n % 5 == 0){
				System.out.print(" FizzBuzz ");
			}
			else if(n % 3 == 0){
			System.out.print("Fizz ");
		}
			else if(n % 5 == 0){
			System.out.print("Buzz ");
		}
			else{
				System.out.print(n);
			}
			System.out.println();
			
		}
	}
}

