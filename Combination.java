package recurrence;

/*
 *  recurrence formula; recursion formula : 漸化式
 * 
 *  n個の中から ｒ個を選ぶ組み合わせの数 nCr 
 *
 *  nCr を漸化式で解く
 *  
 *  nCr = n! / ( r! (n-r)! )
 *  
 *  漸化式
 *         n - r + 1
 *  nCr = ----------- * nCr-1
 *             r
 *  nC0 = 1
 */

public class Combination {
	private double c;
	private double n;
	private double r;
	private double result;

	public Combination(double n, double r) {
		this.n = n;
		this.r = r;
	}

	// nCr = n! / ( r! (n-r)! )
	public double combi1() {
		
		if (n < 0 || r < 0 || n < r) {
	        return Double.NaN;
	    }
		
		result = kaijo(n) / (kaijo(r) * kaijo(n - r));
		return Math.floor(result);
	}

	// nCrを漸化式で求める
	public double combi2() {
		c = 1;
		
		if (n < 0 || r < 0 || n < r) {
	        return Double.NaN;
	    }

		if (n == r || r == 0) {
			return 1d;
		}
		if (r == 1 || r == n - 1) {
			return n;
		}

		for (int i = 1; i <= r; i++) {
			c = c * (n - i + 1) / i;
		}
		return c;
	}

	// nCrの再帰解
	public double combi3(double n, double r) {
		if (n < 0 || r < 0 || n < r) {
	        return Double.NaN;
	    }
		if (n == r || r == 0) {
			return 1d;
		}
		if (r == 1 || r == n - 1) {
			return n;
		}

		result = ((n - r + 1) / r) * combi3(n, r - 1);

		return Math.floor(result);
	}

	// n!の再帰解
	public double kaijo(double n) {
		if (n == 0) {
			return 1;
		} else {
			return n * kaijo(n - 1);
		}
	}

}
