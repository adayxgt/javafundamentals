package threadsandparallelcalculation.averagecalculation;

import java.util.Arrays;

public class AverageCalculationTest {

	public static void main(String[] args) {

		float[] numbers = new float[20000];

		

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = 0.1f;

		}

		

		System.out.println(Arrays.toString(numbers));

		float sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			 sum = numbers[i]+ sum;

			

		}

		

		System.out.println(sum);

		float Average = sum /numbers.length;

		System.out.println(Average);

	}

}