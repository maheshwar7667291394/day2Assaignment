package question2;

import java.util.Comparator;

public class Studentshort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getMarks()>o2.getMarks() ? 1:-1;
	}

}
