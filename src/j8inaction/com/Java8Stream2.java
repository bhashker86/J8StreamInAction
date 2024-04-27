package j8inaction.com;

import java.util.List;
import j8inaction.com.exception.*;
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
	
	
	/*
	 * System.out.
	 * println("Program to print total employee  working in each department");
	 * //System.out.println("Employee List: " +empList);
	 * System.out.println("Total Employee In Each Department: "
	 * +StreamImpl.getTotalEmpByDept(empList));
	 */
	/*
	 * System.out.println("Program to print   group  total employee  by its status"
	 * ); //System.out.println("Employee List: " +empList);
	 * System.out.println("Total Employee  group by its status  : "
	 * +StreamImpl.groupTotalEmployeeByStatus(empList));
	 */
	
	/*System.out.println("Program to print   Emp with Max and Min salary");
	System.out.println("Employee List: " +empList);
	System.out.println("Emp with Max Salary  : " +StreamImpl.getEmpWithMaxSal(empList) + "Employee with min salary: " + StreamImpl.getEmpWithMinSal(empList));
	*/
	System.out.println("Program to print  Frequency Count  of character in a word");
	System.out.println("String : " + "bhashker");
	System.out.println("Map of character   : " +StreamImpl.getCharFreqCount("bhashker"));
	
	System.out.println("Program to print  Frequency Count  of number in a  number");
	System.out.println("String : " + "2323661");
	System.out.println("Map of character   : " +StreamImpl.getFreqCountOfNumber(new Integer(2323661)));
	
	System.out.println("---------------------------------------");
	System.out.println("Longest Wrod in string: "+"My Name i iss Bhashker Kumar isssssdddssssss :"+StreamImpl.getLongestWord("My Name i iss Bhashker Kumar isssssdddssssss"));
	
	
	System.out.println("---------------------------------------");
	System.out.println("Second Longest Wrod in string: "+"My Name i iss Bhashker Kumar isssssdddssssss sdsdfert :"+StreamImpl.getSecondLongestWord("My Name i iss Bhashker Kumar isssssdddssssss sdsdfert"));
	
	System.out.println("---------------------------------------");
	System.out.println("Occurrence Wrod in string: "+"My Name i iss Bhashker Kumar is Bhashker My:"+StreamImpl.findFreqOfWord("My Name i iss Bhashker Kumar is Bhashker my"));
	
	System.out.println("---------------------------------------");
	System.out.println("Occurrence Wrod in string: "+"My Name i iss Bhashker Kumar is Bhashker My:"+StreamImpl.findFreqOfWordIgnoreCase("My Name i iss Bhashker Kumar is Bhashker my"));
	
	
	System.out.println("---------------------------------------");
	try {
		System.out.println("Occurrence Character in Word: "+"Bhashker kumar:"+StreamImpl.findFreqOfCharacInWord2("Bhashker kumar"));
	} catch (IsStringEmptyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
