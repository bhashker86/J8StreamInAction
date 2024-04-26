package j8inaction.com.utils;

import java.util.ArrayList;
import java.util.List;

import j8inaction.com.bean.Employee;

public class BaseOpEpm {

	
	private List<Employee> epmList;
	
	
	public BaseOpEpm() {
		super();
		this.init();
		this.epmList = epmList;
	}
	
	public List<Employee> getEpmList() {
		return epmList;
	}

	public void setEpmList(List<Employee> epmList) {
		this.epmList = epmList;
	}

	

	public List<Employee> createEmpList(){
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"bhashker kumar","A3","IT",4000,true));
		empList.add(new Employee(2,"Anand","A3","IT",6000,false));
		empList.add(new Employee(3,"Tantan","A2","Banking",65000,true));
		empList.add(new Employee(4,"Amit kumar","A4","Manager",89000,true));
		empList.add(new Employee(5,"Rahul","A4","Banking",90000,true));
		
		return empList;
		
	}
	
	public void init() {
		
		this.epmList=this.createEmpList();
	}
}
