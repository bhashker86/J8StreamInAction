package j8inaction.com.impl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
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
	
	//function to print employee with max salary in each department
	/*
	 * public static Map<Integer, Optional<Employee>>
	 * getMaxSalEmpInEachDept(List<Employee> emplist){ return emplist.stream()
	 * .collect(Collectors.groupingBy(Employee::getDept), Collectors.reducing(
	 * BinaryOperator.maxBy( Comparator.comparing(Employee::getSalary) ) ) ); }
	 */
	
	//function to   return number of time a number get repeated. 12223343=1->1,2->3,3->3,4->1
	public static Map<Integer,Long> getFreqCountOfNumber(Integer number){
		
		List<Integer> numberList=Arrays.asList( number.toString().split(""))
				                       .stream()
				                       .map(v->Integer.valueOf(v)).collect(Collectors.toList()); 
	return	numberList.stream()
		          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	//function to return number of time a character get repeated in string bhashker=b->1,h->2, a->1,h->1,k->1,e->1,r->1
	public static Map<Character,Long> getCharFreqCount(String str){
		List<Character> charList= str.chars().mapToObj(c->(char)c).toList();
		return charList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	
}
