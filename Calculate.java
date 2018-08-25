public class Calculate {
	
		public static void main(String[] args) {
				System.out.println("Calculate");
				double first = Integer.valueOf(args[0]);
				double second = Integer.valueOf(args[1]);
				double summ = first + second;
				System.out.println("Sum " + summ);
				double multi = first * second;
				System.out.println("Mult " + multi);
				double minus = first - second;
				System.out.println("Minus " + minus);
				double pow = first * first;
				System.out.println("Pow " + pow);
				
		}
}