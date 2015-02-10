package stap07;

public interface Statistic<T> {

	void addItem(T item);

	Iterable<T> getItems();

	Iterable<T> getBest();

	default int getSize() {
		int size = 0;
		for (T t : getItems()){
			size++;
		}
		return size;
	}

}
