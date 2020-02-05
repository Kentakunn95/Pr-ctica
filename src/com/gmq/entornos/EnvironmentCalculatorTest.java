package com.gmq.entornos;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvironmentCalculatorTest {
	
	EnvironmentCalculator calculator = new EnvironmentCalculator();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void should_sum_two_variables() {
		BigDecimal imputx = new BigDecimal(15);
		BigDecimal imputy = new BigDecimal(5);
		BigDecimal result;
		
		//SUMA
		result=new BigDecimal(20);
		BigDecimal SumResult;
		SumResult=calculator.sum(imputx,imputy);
		assertEquals(result,SumResult);
		
		//RESTA
		result=new BigDecimal(10);
		BigDecimal RestResult;
		RestResult=calculator.substract(imputx,imputy);
		assertEquals(result,RestResult);
		
		
		//MULTIPLICACIÓN
		result=new BigDecimal(75);
		BigDecimal MultResult;
		MultResult=calculator.multiply(imputx,imputy);
		assertEquals(result,MultResult);
		
		//DIVISIÓN
		result=new BigDecimal(3);
		BigDecimal DivResult;
		DivResult=calculator.divide(imputx,imputy);
		assertEquals(result,DivResult);
		
		//MÁXIMO COMÚN DIVISOR
		
		
		
		//MÍNIMO COMÚN MÚLTIPLO
		
		
		
	}

}
