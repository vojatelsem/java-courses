import java.util.Scanner;


/**
	
	Класс для запуска калькулятора. Поддерживает ввод пользователя
	@author sem
	@version 0.1
	
*/
public class InterractRunner {
	/**
	Главный метод, в котором выполняется усё
	*/
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calculator = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Please enter operation(+,-,*,/): ");
				String operation = reader.next();
				
				calculate(calculator,first,second,operation);
				
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
	
	/**
	Метод для произведения математических операций
	@param calc переменная с классом Calculator 
	@param first первый параметр для вычисления
	@param second  второй параметр для вычисления
	@param operation содержит знак операции
	
	*/
	private static void calculate(Calculator calc, String first, String second,String operation){
		
			if (operation.equals("+")) {
				calc.add(Double.valueOf(first), Double.valueOf(second));}
			else if (operation.equals("-"))  {
				calc.minus(Double.valueOf(first), Double.valueOf(second));}
			else if (operation.equals("*"))  {
				calc.mult(Double.valueOf(first), Double.valueOf(second));}
			System.out.println("Result: " + calc.getResult());
			calc.cleanResult();
	}
		
}