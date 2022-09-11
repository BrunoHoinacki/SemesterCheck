package entities;

public class Student {
	public String Name;
	public double Semester1;
	public double Semester2;
	public double Semester3;
	
	public double finalSemester() {
		return Semester1 + Semester2 + Semester3;
	}
	
	public double missingPoints() {
		if (finalSemester() < 60.0)
			return 60.0 - finalSemester();
		else
			return 0.0;
	}
	
	
}
