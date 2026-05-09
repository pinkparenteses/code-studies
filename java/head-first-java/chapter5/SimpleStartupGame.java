import java.util.Scanner;

public class SimpleStartupGame{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		SimpleStartup theStartup = new SimpleStartup();
		GameHelper helper = new GameHelper();

		int numOfGuesses = 0;
		
		boolean isAlive = true;
		
		int randomNumber = (int) (Math.random() * 5);
		int[] location = {randomNumber, randomNumber + 1, randomNumber + 2};
		
		theStartup.setLocationCells(location);
		
		String result = "";
		int guess;
		
		while (isAlive){
			guess = helper.getUserInput("Enter a number");
			result = theStartup.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
			
		}
		
		
	}
}