package com.avinashit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmployeeApplicationTests {

	private final  Calculator c=new Calculator();
	@Test
	void contextLoads() {
		String actualName="Alex";
		String expectedName="Alex";
		assertThat(actualName).isEqualTo(expectedName);
	}

	@Test
	void testSum(){
		//expected
		int expectedResult=20;
		//actual
		int actualResult=c.doSum(12,2,6);
		//compare
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	//@Test
//	public void sum(){
//		//assertThat(3).isEqualTo(3);
//	}

	@Test
	//@Disabled//demo of disabled annotation
	void testProduct(){
		//expected
		int expectedResult =32;
		//actual
		int actualResult =c.doProduct(4,8);
		//compare
		assertThat(actualResult).isEqualTo(expectedResult);
	}

}
