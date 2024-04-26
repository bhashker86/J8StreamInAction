package j8inaction.com.impl;

import java.util.List;
import java.util.Map;
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
	
}
