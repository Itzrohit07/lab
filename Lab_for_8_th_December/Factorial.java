package com.demo.main;

public class Factorial {
		public static int fact(int num) {
			int fact=1;
			while(num!=0) {
				fact=fact*num;
				num--;
			}
			return fact;
		}
		}
			