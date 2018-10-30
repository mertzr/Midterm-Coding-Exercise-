package main;
import java.util.*; 
public class SortByVolume implements Comparator<Cuboid>{
	SortByVolume(){
	}
	public int compare(Cuboid C1,Cuboid C2) {
		return C1.compareTo(C2); 
	}
}