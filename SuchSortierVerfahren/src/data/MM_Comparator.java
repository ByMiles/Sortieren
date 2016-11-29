package data;

import sort.Comparator;

public class MM_Comparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getMn() - o2.getMn();
	}

}
