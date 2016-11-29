
import java.util.Arrays;
import java.util.List;

import data.MM_Comparator;
import data.Student;
import data.Surname_Comparator;
import sort.SelectionSort;
import sort.Sortable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ted", "Lala", 2, 1, 14);
		Student s2 = new Student("Max", "Power", 67, 1, 32);
		Student s3 = new Student("Susi", "Geil", 1, 0, 18);
		Student s4 = new Student("Simon", "Schnuck", 35, 1, 49);

		List<Student> list = Arrays.asList(s1, s2, s3, s4);

		
		System.out.println("Alle Studenten: ");
		printAllStudents(list);
		
		Sortable<Student> doSort = new SelectionSort<Student>();
		System.out.println("Sortiert nach MN: ");
		doSort.sort(list, new MM_Comparator());
		printAllStudents(list);
		
		Sortable<Student> suSort = new SelectionSort<Student>();
		System.out.println("Sortiert nach MN: ");
		doSort.sort(list, new Surname_Comparator());
		printAllStudents(list);
	
	}
	
	private static void printAllStudents(List<Student> list){
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
