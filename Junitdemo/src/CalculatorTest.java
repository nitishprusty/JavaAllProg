import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	 Calculator obj = new Calculator();
	 
	 @Test
	 public void addTest() {
		 Assertions.assertEquals(4, obj.add(2, 2));
	 }

}
