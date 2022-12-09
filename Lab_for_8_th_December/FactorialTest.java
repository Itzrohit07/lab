package com.Demo.test;
import com.demo.main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
 @Test
 public void test() {
	 assertEquals(2,Factorial.fact(2));
	 assertEquals(6,Factorial.fact(4));
 }

	}


