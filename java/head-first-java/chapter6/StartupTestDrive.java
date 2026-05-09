public class SimpleStartupTestDrive{
	public static void main(String[] args){
		
		SimpleStartup s = new SimpleStartup();
			
		int[] location = {2,3,4};
		
		int guess = 2;
		
		s.setLocationCells(location);
		
		String result = s.checkYourself(2);
		String testResult = "Failed";
		
		if (result.equals("hit")){
			testResult = "Passed";
		}
		
		System.out.println(testResult);
	}
}
