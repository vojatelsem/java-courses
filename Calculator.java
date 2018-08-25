/**
	Класс реализует калькулятор.
	*/
public class Calculator {
	/**
		Результат вычисления.
		*/
		private double result;
	/**
		Суммируем аргументы.
		@param params Аргументы суммирования.
		*/
		
	public void add (double ... params) {
		for (Double param : params) {
			this.result += param;
		}
	}
	
	/**
		Выполняем умножение.
		@param params Аргументы умножения
	*/
	public void mult (double ... params) {
		for (Double param : params) {
			this.result *= param;
		}
	}
	
	/**
		Выполняем вычитание.
		@param params Аргументы вычитания
	*/
	public void minus (double ... params) {
		for (int i = params.length - 1; i >= 0 ; i--){
			this.result -= params[i];
		}
	}
	
	
	
	/**
		Получить результат.
		@return результат вычисления.
	*/
	public double getResult() {
		return this.result;
	}
	
	/**
		Очистить результат вычисления.
	*/
	public void cleanResult() {
		this.result = 0;
	}
}