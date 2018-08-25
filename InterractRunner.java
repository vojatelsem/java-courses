import java.util.Scanner;


/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя
*/
public class InterractRunner {
	
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Please enter operation(+,-,*,/): "
				String operation = reader.next();
				if (operation.equals("+") then
					calc.add(Double.valueOf(first), Double.valueOf(second));
				else if (operation.equals("-") then
					calc.minus(Double.valueOf(first), Double.valueOf(second));
				else if (operation.equals("*") then
					calc.mult(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}