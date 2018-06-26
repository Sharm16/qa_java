
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Hello World";
		int a = -1;
		int b = -4;
		boolean c = false;
		int d =22;
		int[] arr = { 1, 2, 3, 4, 50, 6, 7, 8, 9, 10 };
		boolean isSummer = true;

		// Conditionals2(arr[0], arr[1], c);
		// for (int i = 0; i < 10; i++) {
		// System.out.println(arr[i]);
		// }

		System.out.println(BlackJack(a,b));
	}

	public static void testMethod(String test) {

		System.out.println(test);

	}

	public static void Conditionals2(int a, int b, boolean c) {

		for (int i = 0; i < 10; i++) {
			int var = 0;
			if (a == 0) {
				var = b;
			} else if (b == 0) {
				var = a;
			} else if (c == true) {
				var = a + b;
			} else
				var = a * b;

			System.out.println(var);
		}
	}

	public static int BlackJack(int a, int b) {
		if (a > 21 && b > 21)
			return 0;
		else if (a > 21)
			return b;
		else if (b > 21)
			return a;
		else if (a > b)
			return a;
		else if (b > a)
			return b;
		else
			return 1;

	}

	public static int UniqueSum(int a, int b, int c) {
		if (a == b && b == c)
			return 0;
		if (a == b)
			return c;
		if (b == c)
			return a;
		if (a == c)
			return b;
		else 
			return a+b+c;
	}
	
	public static boolean TooHot(boolean a, int b) {
		if (a==true && (b>59 && b<101))
			return true;
		else if (a==true && (b<60 || b>100))
			return false;
		else if (a==false && (b>59 && b<91))
			return true;
		else 
		return false;
		
		
	
	}
	
/*	public static void Loop(int[] a) {
		int [9] test= {};
		for (int i; i<a.length; i++) {
			System.out.println(a[i]);
			
			for (int j; j<a.length; j++) {
				System.out.println(a[j]*10);
			}
		
		}
	
}*/
}