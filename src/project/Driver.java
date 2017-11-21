package project;

public class Driver {
	// Step 3:
	public static int countThe(String[] s1) {
		int numThe = 0;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equalsIgnoreCase("the"))
				numThe = numThe + 1;
		}
		return numThe;
	}

	// Step 4:
	public static boolean compareOdd(float[] arr1, float[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 1; i < arr1.length; i = i + 2) {
				if (arr1[i] != arr2[i])
					return false;
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// Step 2:
		String[] s = { "The", "coach", "urged", "the", "team", "to", "press", "on", "and", "to", "score", "again",
				"before", "the", "end", "of", "the", "third", "quarter" };
		// Step 3:
		System.out.println(countThe(s));
		// Step 4:
		float[] arr1f = { 1.0f, 2.0f, 3.0f };
		float[] arr2f = { 44.5f, 2.0f, 4.0f };
		System.out.println(compareOdd(arr1f, arr2f));
		// Step 5:
		Student[] students = new Student[3];
		students[0] = new Student("Emmet", 3.5, 18);
		students[1] = new Student("John", 3.6, 20);
		students[2] = new Student("Steve", 3.2, 19);
		// Step 6:
		System.out.println("Best student: " + Student.findBestStudent(students));
	}

}
