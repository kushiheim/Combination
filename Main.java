package recurrence;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.MathUtils;

public class Main {

	private static long factorial;
	private static double factorial2;
	private static double c2;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		long start, stop;
		double result;
		double n = -1;
		double r = 6;
		
		Combination c = new Combination(n, r);  // 6096454通り
		
		System.out.println("------nCr = n! / ( r! (n-r)! )------");
		start = System.nanoTime();
		result = c.combi1();
		stop = System.nanoTime();
		System.out.println("c.combi1() : " + result);
		System.out.println("time : " + (stop - start)/1000000f + "ms");
		
		System.out.println("----------nCrを漸化式で求める-----------");
		start = System.nanoTime();
		result = c.combi2();
		stop = System.nanoTime();
		System.out.println("c.combi2() : " + result);
		System.out.println("time : " + (stop - start)/1000000f + "ms");
		
		System.out.println("----------nCrの再帰解-----------------");
		start = System.nanoTime();
		result = c.combi3(n, r);
		stop = System.nanoTime();
		System.out.println("c.combi3() : " + result);
		System.out.println("time : " + (stop - start)/1000000f + "ms");
		
		System.out.println("------nCr = n! / ( r! (n-r)! )------");
		start = System.nanoTime();
		result = c.combi1();
		stop = System.nanoTime();
		System.out.println("c.combi1() : " + result);
		System.out.println("time : " + (stop - start)/1000000f + "ms");
		
		System.out.println("----------nCrを漸化式で求める-----------");
		start = System.nanoTime();
		result = c.combi2();
		stop = System.nanoTime();
		System.out.println("c.combi2() : " + result);
		System.out.println("time : " + (stop - start)/1000000f + "ms");
		
		System.out.println("----------nCrの再帰解-----------------");
		start = System.nanoTime();
		result = c.combi3(n, r);
		stop = System.nanoTime();
		System.out.println("c.combi3() : " + result);
		System.out.println("time : " + (stop - start)/1000000f + "ms");
		System.out.println("-------------------------------------");
		
		
		System.out.println(c.kaijo(20));
		
		factorial = ArithmeticUtils.factorial(20);
		
		factorial2 = ArithmeticUtils.factorialDouble(170);
		
		System.out.println(factorial);
		System.out.println(factorial2);
		
		 c2 = ArithmeticUtils.binomialCoefficientDouble(43, 6);
		
		 System.out.println(c2);
	}

}
