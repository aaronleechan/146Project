import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class filePresenter {
	FrameWork view;
	readFile fileReader;
	public ArrayList<String> firstFileList = new ArrayList<String>();
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		fileReader.read();
		
		fileReader.readFile();
		
		
		firstFileList = fileReader.storeAllList;
		
	}
	
	
	
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
