import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filePresenter {
	FrameWork view;
	readFile fileReader;
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		fileReader.read();
		
		
		
		fileReader.readFile();
	}
	
	
	
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
