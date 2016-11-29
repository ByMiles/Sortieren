package sort;

import java.util.List;

public interface Sortable <T>{
	void sort(List<T> list, Comparator<T> cmp);

}
