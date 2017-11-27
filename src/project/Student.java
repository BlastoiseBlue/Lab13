package project;

//Step 5:
public class Student {
	String name;
	double gpa;
	int age;

	public String toString() {
		return (name + ", " + age + ", " + gpa);
	}

	public Student(String n, double g, int a) {
		name = n;
		gpa = g;
		age = a;
	}

	// Step 6:
	public static String findBestStudent(Student[] s) {
		double highestGPA = 0;
		int bestStudent = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].gpa > highestGPA) {
				highestGPA = s[i].gpa;
				bestStudent = i;
			}
		}
		return s[bestStudent].name;
	}

	// Step 7:
	public static Student[] findStudents(Student[] s, int ageMin, int ageMax) {
		int i = 0;
		int n = 0;
		for (i = 0; i < s.length; i++) {
			if (s[i].age >= ageMin && s[i].age < ageMax) {
				n++;
			}
		}
		Student[] placeHolder = new Student[n];
		int j = 0;
		for (i = 0; i < s.length; i++) {
			if (s[i].age >= ageMin && s[i].age < ageMax) {
				placeHolder[j] = s[i];
				j++;
			}
		}
		return placeHolder;
	}
}
