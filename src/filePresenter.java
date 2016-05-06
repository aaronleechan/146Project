import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class filePresenter {
	FrameWork view;
	readFile fileReader;
	public ArrayList<String> firstFileList = new ArrayList<String>();
	public ArrayList<String> resultFieldList = new ArrayList<String>();
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		fileReader.read();
		
//		fileReader.readFile();		
		
		firstFileList = fileReader.storeAllList;
		
//		for(int i = 0; i < firstFileList.size(); i++)
//		{
////			resultFieldList.add(firstFileList.get(i));
//			System.out.println(firstFileList.get(i));
//		}
	}
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
