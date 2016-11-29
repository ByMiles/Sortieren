package sort;

import java.util.List;

public class SelectionSort<T> implements Sortable<T> {

	@Override
	public void sort(List list, Comparator cmp) {
	
		int min = 0;
		for(int i = 0; i < list.size(); ++i){
			min = i;
			for (int e = i + 1; e < list.size(); ++e){
				if(cmp.compare(list.get(e), list.get(min)) < 0){
					min = e;
				}
			}
			swap(list, i, min);
		}
		
	}
	
	private void swap(List<T> list, int i, int e){
		T memorizedObject = list.get(i);
		list.set(i,  list.get(e));
		list.set(e,  memorizedObject);
		
	}

}
