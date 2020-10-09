package Bridge;

public class BridgeMain {
	public static void main(String[] args) {
 
		SortImple TImple = new QuickSortImple();
	
		SortImple TImple2 = new BubbleSortImple();
		
		new TimerSorter(TImple).timerSort(null);;
		new TimerSorter(TImple2).timerSort(null);;
	
	}
}