package inheritance;

import java.util.function.BinaryOperator;

public class Employee {
	
	
	private int salary;
	
	public Employee(int salary){
		this.salary = salary;
	}
	
	public void print(String document){
		System.out.println(document);
	}
	

	public double doCalculations(BinaryOperator<Double> operator, double operand1, double operand2){
		return operator.apply(operand1, operand2);
	}

	public int getSalary(){
		return this.salary;
	}
	
}
