public class SimpleStartup{
	private int[] locationCells;
	private int numOfHits = 0;
	
	public String checkYourself(int userGuess){
		String result = "miss";
		

		for (int cell : locationCells){
			if (cell == userGuess){
				result = "hit";
				locationCells[numOfHits] = Integer.MIN_VALUE;
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length){
			result = "kill";
		}
		
		System.out.println(result);
		
		return result;
	}
	
	public void setLocationCells(int[] location){
		locationCells = location;
	}
}