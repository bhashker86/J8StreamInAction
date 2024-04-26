package j8inaction.com.bean;

import java.util.Objects;

public class Employee {

private int id;
private String name;
private String  grade;
private String dept;


public Employee(int id, String name, String grade, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.grade = grade;
	this.dept = dept;
}
@Override
public int hashCode() {
	return Objects.hash(dept, grade, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(dept, other.dept) && Objects.equals(grade, other.grade) && id == other.id
			&& Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", dept=" + dept + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

	
	
}
