package stap07;

import java.util.ArrayList;
import java.util.List;

public class Albums implements Statistic<Album> {
	
	private final List<Album> albums = new ArrayList<>();

	@Override
	public void addItem(Album item) {
		albums.add(item);		
	}

	@Override
	public Iterable<Album> getItems() {		
		return albums;
	}

	@Override
	public Iterable<Album> getBest() {
		int mostSold = Integer.MIN_VALUE;
		for (Album album : albums) {
			if (album.getSold() > mostSold){
				mostSold = album.getSold();
			}
		}
		List<Album> best = new ArrayList<Album>();
		for (Album album : albums){
			if (album.getSold() == mostSold){
				best.add(album);
			}
		}
		return best;
	}
	
	@Override
	public int getSize(){
		return albums.size();
	}

}
