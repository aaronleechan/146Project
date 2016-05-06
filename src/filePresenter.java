import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class filePresenter {
	FrameWork view;
	readFile fileReader;
	QuickSorter quickSortResult;
	MergeSorter mergeSortResult;
	
	
	
	public ArrayList<String> firstFileList = new ArrayList<String>();
	public ArrayList<String> resultFieldList = new ArrayList<String>();
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		fileReader.read();	
		
		firstFileList = fileReader.storeAllList;
		
	}
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
