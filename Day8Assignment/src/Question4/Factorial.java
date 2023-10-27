package Question4;

public class Factorial extends Processor{
	
	@Override
	void process() {
		int result = 1;
		for(int i = 1;i<=data;i++) {
			result *= i;
		}
		data = result;
	}
	

}
