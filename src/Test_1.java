import static org.junit.Assert.*;

import org.junit.Test;
//класс тестов
public class Test_1 {
	//Тестирование основных функций
	@Test
	public void testPlus() {
		int res=Calc.metodCalc(20, "+", 5);
		assertEquals (25,res);
	}
	
	@Test
	public void testMinus() {
		int res=Calc.metodCalc(20, "-", 5);
		assertEquals (15,res);
	}
	
	@Test
	public void testMultiply() {
		int res=Calc.metodCalc(20, "*", 5);
		assertEquals (100,res);
	}
	
	@Test
	public void testDivide() {
		int res=Calc.metodCalc(20, "/", 5);
		assertEquals (4,res);
	}
	
	@Test
	public void testSqrt() {
		int res= (int) Calc.metodSqrt(9);
		assertEquals (3,res);
	}

}
