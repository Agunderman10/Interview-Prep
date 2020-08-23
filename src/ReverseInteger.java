
public class ReverseInteger {
	public int reverse(int x) { // x = 3245
		char[] chars = ("" + x).toCharArray();
		int length = chars.length;
		char temp;
		char front;
		char back;
		for(int i = 0; i < length / 2; i++) 
		{
			back = chars[i]; // front is now 3
			front = chars[length - 1 - i];
			temp = front;
			chars[i] = temp;
			chars[length - 1 - i] = back;
		}
		return Integer.parseInt(new String(chars));
	}
}
/*
 * first iteration: 3 to switch with 5
 * second iteration: 2 to switch with 4
 * 
 * 
 * 
 */ 
