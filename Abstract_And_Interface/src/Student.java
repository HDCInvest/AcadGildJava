import java.util.ArrayList;
import java.util.List;

public class Student extends aStudent {
	private List<aStudent> studentList = new ArrayList<aStudent>();
	public void addNewStudent(String name, String reg, int roll) {
		aStudent st = new Student(name, reg, roll);
		studentList.add(st);
	}

	public Student() {
	
	}
	
	public Student(String name, String reg, int roll) {
		this.setName(name);
		this.setReg(reg);
		this.setRoll(roll);
	}
	
	
	@Override
	void displayStudentData() {
		System.out.println(" # of students = " + studentList.size());
		for (aStudent eachStudent : studentList) {
			System.out.println(" name is = " + eachStudent.getName());
		}
	}


}
