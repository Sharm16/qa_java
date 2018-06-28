package factorials;

public class Factorial {

	public static void main(String[] args) {
		float f = 1;

		System.out.println(fact1(f));
	}

	public static String fact1(float f) {

		int i = 1;
		float result = 0;
		do {
			if (i >= f) {
				break;
			}
			i++;
			result = f / i;
			if (result == 1) {
				return (i + "!");

			} else {
				f = result;

			}

		} while (f > i);

		return "Not a factorial";
	}
}
