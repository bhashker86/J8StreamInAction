package j8inaction.com.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import j8inaction.com.bean.Employee;

public class StreamImpl {


	
	//function    to organize employee working in each department.
	public static  Map<String,List<Employee>> orgEmpByDepartment(List<Employee> empList){
		return empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
	}
	
	
	
	//function  to get total number of  employee working in each department.
	public static Map<String,Long> getTotalEmpByDept(List<Employee> empList){
		return empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
	}
	
	
	//function to  print active and inactive employee in given collection of employee.
	 public static Map<Boolean, List<Employee>> groupTotalEmployeeByStatus(List<Employee> emplist){
	   return emplist.stream().collect(Collectors.groupingBy(Employee::isStatus,Collectors.toList()));	
	}
   
	 
	 //function to print employee with Max salary
	public static Employee getEmpWithMaxSal(List<Employee> empList) {
		Employee emp=null; 
		Optional<Employee> opEmp=empList.stream().max(Comparator.comparingInt(Employee::getSalary));
		if(opEmp.isPresent())
			emp=opEmp.get();
		return emp;
		
	 } 
	
	//function to print employee with Min salary
	public static Employee getEmpWithMinSal(List<Employee> empList) {
		Employee emp=null;
		Optional<Employee> opEmp=empList.stream().min(Comparator.comparingInt(Employee::getSalary));
		if(opEmp.isEmpty())
			return emp;
		return opEmp.get();
	}
	
	
}
