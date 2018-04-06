package jh;

public class Program {
	public static void main(String[] args) {
		
//		System.out.println(recursiveEvenNumber(0));
//		System.out.println(recursiveEvenNumber(1));
//		System.out.println(recursiveEvenNumber(2));
//		System.out.println(recursiveEvenNumber(3));
//		
//		System.out.println(interativeEvenNumber(3));
//		System.out.println(recursiveEvenNumber(3));
//		
//		System.out.println(iterativeAdd(3,4));
//		System.out.println(recursiveAdd(3,4));
		
		
		for(int i=0;i<20;i++)
			System.out.format("%1$d, ",fib(i));
		
		System.out.println("");

		for(int i=0;i<20;i++)
			System.out.format("%1$d, ",fib2(i));

		return;

	}
	
	
	@SuppressWarnings("unused")
	private static int iterativeAdd(int x, int y) {
		int result = y;
		while(x > 0) {
			x--;
			result += 1;
		}
		return result;
	}
	
	@SuppressWarnings("unused")
	private static int interativeEvenNumber(int n) {
		int result =0;
		for( int i=0; i < n; i++) {
			result += 2;
		}
		return result;
	}
	
	@SuppressWarnings("unused")
	private static int recursiveAdd(int x, int y) {
		if( x == 0 ) return y;
		if( x < 0 ) return recursiveAdd(x+1, y-1);
		return recursiveAdd(x-1, y+1);
	}
	
	@SuppressWarnings("unused")
	private static int recursiveEvenNumber(int n) {
		if( n==0 ) return 0;
		return 2+ recursiveEvenNumber(n-1);
	}
	
	private static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1) + fib(n-2);
	}
	
	private static int fib2(int n) {
		
		int x,y,z;
		x=0;y=1;z=0;
		
		for(int i=0 ; i < n ; i++) {
			x = z;
			z = x + y;
			y = x;	
		}
		return z;
	}

}
