

public class ReverseInteger {
	
	/*
	 * Brute Force Solution
	 */
	private boolean isNegative(int num) {
		if(num < 0) {
			return true;
		}
		return false;
	}
	
	private int makePositive(int num) {
		if(isNegative(num)) {
			return num * - 1;
		}
		return num;
	}
	
	private int loopThroughCharArrayAndReverse(char[] chars) {
		int length = chars.length;
		char temp;
		char front;
		char back;
		
		for(int i = 0; i < length / 2; i++) 
		{
			back = chars[i];
			front = chars[length - 1 - i];
			temp = front;
			chars[i] = temp;
			chars[length - 1 - i] = back;
		}
		
		return Integer.parseInt(new String(chars));
	}
		
	
	public int reverseBruteForce(int x) {
		char[] chars;
		
		try {
			if(!isNegative(x)) {
				chars = ("" + x).toCharArray();
				return loopThroughCharArrayAndReverse(chars);
			}
			else {
				chars = ("" + makePositive(x)).toCharArray();
				return loopThroughCharArrayAndReverse(chars) * -1;
			}
		}
		catch(Exception e) {
			return 0;
		}
	}
	
	/*
	 * Optimized Solution
	 */
	
	public int reverseOptimized(int x) {
		return 0;
	}
}
