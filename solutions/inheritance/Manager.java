package inheritance;

import java.util.List;
import java.util.function.BinaryOperator;

public class Manager extends Employee{
	
	private List<Employee> employees;

	public Manager(List<Employee> employees, int salary){
		super(salary);
		this.employees = employees;
	}

	@Override
	public void print(String document) {
		employees.get(0).print(document);;
	}

	@Override
	public double doCalculations(BinaryOperator<Double> operator,
			double operand1, double operand2) {
		return employees.get(0).doCalculations(operator, operand1, operand2);
	}
	
	
	
}
