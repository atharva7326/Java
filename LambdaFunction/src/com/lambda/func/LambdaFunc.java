package com.lambda.func;

interface Sum {
	int add(int a, int b);
}

interface Sub {
	int sub(int a, int b);
}

interface Mul {
	int mul(int a, int b);
}

interface Div {
	int div(int a, int b);
}


public class LambdaFunc {

	public static void main(String[] args) {
		Sum s = (a, b) -> a + b;
		System.out.println("Sum: " + s.add(10, 20));

		Sub sb = (a, b) -> b - a;
		System.out.println("Sub: " + sb.sub(10, 20));

		Mul m = (a, b) -> a * b;
		System.out.println("Mul: " + m.mul(10, 20));

		Div d = (a, b) -> b / a;
		System.out.println("Div: " + d.div(10, 20));

	}

}
