
public class Chapter09_Ex2 {
	public static void main(String[] args) {
		int number1 = 976;
		int number2 = 427;
		System.out.println(number1 + "と" + number2 + "の最大公約数は、" + euclid(number1, number2) + "です。");
		}
	
	public static int euclid(int number1, int number2) {
		if(number2 == 0) {
			return number1;
		}
		
		return euclid(number2, number1 % number2);
	}
}
