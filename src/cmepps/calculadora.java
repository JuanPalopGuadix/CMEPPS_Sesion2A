package cmepps;

public class calculadora {
	int a = 0, b = 0;

	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static int resta(int a, int b) {
		return a - b;
		}
	public static int divide(int a, int b) {
		if(b==0) {
			return -1;
		}
		return a / b;
		}
	public static int multiplica(int a, int b) {
		return a * b;
		}
}
