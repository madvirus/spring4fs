package chap07;

public class ImpeCalculator implements Calcuator {

	@Override
	public long factorial(long num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
