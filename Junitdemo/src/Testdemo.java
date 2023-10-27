import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class Testdemo {
	
	@BeforeEach
	public void beforeEachmethod() {
		System.out.println("Before Each Running ");
	}
	
	@AfterEach
	public void afterEachmethod() {
		System.out.println("After Each Running");
	}
	
	@BeforeAll
	public void beforeclass() {
		System.out.println("Before runnning all test cases...");
	}

	@Test
	@DisplayName("TetsDemo3,3")
	void test() {
		assertEquals(3,3);
	}
	
	@Test
	@Disabled
	public void test1() {
		String actualValue = "Helloworld";
		assertNotEquals("HelloWorld",actualValue);
	}
	
	@AfterAll
	public  void Afterclass() {
		System.out.println("After runnning all test cases...");
	}
	

}
