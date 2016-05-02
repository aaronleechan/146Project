
public class filePresenter {
	FrameWork view;
	readFile fileReader;
	//This is the class that will handle the model <-> UI communication
	void loadfileReader()
	{
		fileReader = new readFile();
		
		
		
		
		
	}
	
	
	
	
	void attachView(FrameWork view) {
        this.view = view;
    }

}
