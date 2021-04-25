package javapractice;
import java.io.*;
import java.util.*;
public class Jukebox1 {

	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		Jukebox1 box = new Jukebox1();
		box.go();
		
		Jukebox1 a = new Jukebox1();
		Jukebox1 b = new Jukebox1();
		
		System.out.println(a.equals(b));
		
		Song t = new Song("a","b","c","d");
		box.printObjectType(t);
		
		
	}

	public void go() {
		
		getSongs();
		TreeSet<Song> songTSet = new TreeSet<Song>();
		songTSet.addAll(songList);
		System.out.println(songTSet);
		Collections.sort(songList);
		System.out.println(songList);
		ArtistComparator artistCompare = new ArtistComparator();
		TreeSet<Song> songTSet2 = new TreeSet<Song>(artistCompare);
		songTSet2.addAll(songTSet);
		System.out.println(songTSet2);
		Collections.sort(songList,artistCompare);
		System.out.println(songList);
		
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
		
	}
	void getSongs() {
		try {
			File file  = new File("javapractice/SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = reader.readLine()) != null) {
				getSong(line);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	void getSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		
		songList.add(new Song (tokens[0],tokens[1],tokens[2],tokens[3]));
	}
	
	public <T extends Object> void printObjectType(T o){
		System.out.println(o);
	}
	
	
}

class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	
	public Song(String title, String artist, String rating, String bpm) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	@Override
	public int compareTo(Song o) {
		return title.compareTo(o.getTitle());
	}
	@Override
	public boolean equals(Object o) {
		Song s = (Song) o;
		return title.equals(s.getTitle());
	}
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	
	
}

class ArtistComparator implements Comparator<Song>{
	@Override
	public int compare(Song o1, Song o2) {
		return o1.getArtist().compareTo(o2.getArtist());
	}
	
}
