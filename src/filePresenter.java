import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class filePresenter {
	FrameWork view;
	readFile fileReader;
	QuickSorter quickSortResult;
	MergeSorter mergeSortResult;
	Hashing hashingPeople;
	
	
	public ArrayList<String> firstFileList = new ArrayList<String>();
	public ArrayList<String> mergeSortList = new ArrayList<String>();
	public ArrayList<String> quickSortList = new ArrayList<String>();
	public ArrayList<String> heapSorterList = new ArrayList<String>();

	
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		fileReader.read();	
		
		firstFileList = fileReader.storeAllList;
		
//		for(int i = 0; i < firstFileList.size(); i++)
//		{
//			System.out.println(firstFileList.get(i) + " First ");
//		}
		
	//	hashingPeople = new Hashing();

		mergeSortList = MergeSorter.mergeSort(hashingPeople.getPersonArray());
		quickSortList = QuickSorter.quicksort(hashingPeople.getPersonArray());
		heapSorterList = HeapSorter.heapSort(hashingPeople.getPersonArray());
		
		
		
//		for(int i = 0; i < heapSorterList.size(); i++)
//		{
//			System.out.println(heapSorterList.get(i) + " Heap ");
//		}
		
		//quickSortList = QuickSorter.
		
		//mergeSortList = mergeSortResult.sort(hashingPeople.people);
		
//		for(int i = 0; i < mergeSortList.size(); i++)
//		{
//			System.out.println(mergeSortList.get(i) + " merge Sort ");
//		}
//		
//		for(int i = 0; i < quickSortList.size(); i++)
//		{
//			System.out.println(quickSortList.get(i) + " QUICK");
//		}

		
	}
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
