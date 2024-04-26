package j8inaction.com;

import java.util.List;

import j8inaction.com.bean.Employee;
import j8inaction.com.utils.BaseOpEpm;
import j8inaction.com.impl.StreamImpl;

public class Java8Stream2 {

	public static void main(String[] args) {
	

	System.out.print("Program to print employee details working in each department");
	BaseOpEpm baseOpEpm=new BaseOpEpm();
	List<Employee> empList=baseOpEpm.getEpmList();
	//System.out.println("Employee List: " +empList);
	//System.out.println("Employee In Each Department: " +StreamImpl.orgEmpByDepartment(empList));
	
	
	System.out.println("Program to print total employee  working in each department");
	//System.out.println("Employee List: " +empList);
	System.out.println("Total Employee In Each Department: " +StreamImpl.getTotalEmpByDept(empList));
	
	
	
	
	}

}
