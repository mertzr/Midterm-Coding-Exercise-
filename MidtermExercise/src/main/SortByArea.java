package main;
import java.util.*; 

public class SortByArea implements Comparator<Cuboid> {
	SortByArea(){}
	public int compare(Cuboid C1,Cuboid C2) {
		return C1.compareTo(C2); 
	}
}

