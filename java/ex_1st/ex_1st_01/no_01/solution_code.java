class Solution {

	public long solution(long num) {
		// Write code here.
		num++;
		int digit = 1;
		while(num / digit % 10 == 0) {
			num += digit;
			digit *= 10;
		}
		return num;
	}

}