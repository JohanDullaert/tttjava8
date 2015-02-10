package stap07;

public class DefaultMethods {

	public static void main(String[] args) {
		
		Statistic<Album> albums = new Albums();
		albums.addItem(new Album("darkside of the moon", "pink floyd", 50_000_000));
		albums.addItem(new Album("thriller", "michael jackson", 110_000_000));
		albums.addItem(new Album("back and black", "AD/DC", 49_000_000));
		
		for (Album album : albums.getBest()) {
			System.out.println(album.getTitle());			
		}
		
		System.out.println(albums.getSize());

	}

}
