package com.husain;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 110; i > 0; i--) {

			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)){
				System.out.println("FizzBuzzBang");
			}

			else if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println("FizzBuzz");
			}
			else if (((i % 5) == 0) && ((i % 7) == 0)){
				System.out.println("BuzzBang");
			}
			else if ((i % 3) == 0){
				System.out.println("Fizz");
			}
			else if ((i % 5) == 0){
				System.out.println("Buzz");
			}
			else if ((i % 7) == 0){
				System.out.println("Bang");
			}
			else{
				System.out.println(i);	
			}
			
		}






	}

} 


