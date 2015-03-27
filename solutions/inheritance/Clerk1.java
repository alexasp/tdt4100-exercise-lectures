package inheritance;

import java.util.function.BinaryOperator;

public class Clerk1 {

	Employee employee = new Employee(100);
	
	public void print(String document){
		employee.print(document);
	}
	
	public double doCalculations(BinaryOperator<Double> operator, double operand1, double operand2){
		return employee.doCalculations(operator, operand1, operand2);
	}
	
}
