public class Value {
	int intValue;
	
	int doStuff(int factor){
		if (intValue > 100) {
			return intValue * factor;
		} else {
			return intValue * (5 - factor);
		}
	}
}