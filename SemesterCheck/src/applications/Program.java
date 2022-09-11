package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.Name = sc.nextLine();
		student.Semester1 = sc.nextDouble();
		student.Semester2 = sc.nextDouble();
		student.Semester3 = sc.nextDouble();
		
		System.out.printf("FINAL SEMESTER = %.2f%n", student.finalSemester());
		if (student.finalSemester() > 60.00)
			System.out.println("PASS");
		else
			System.out.printf("FAILED%n" + "MISSING %.2f POINTS", student.missingPoints());
		
		sc.close();
	}

}
