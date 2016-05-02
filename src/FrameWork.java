
public class FrameWork {
	filePresenter presenter;

	public FrameWork(filePresenter filePresenter) {
		this.presenter = filePresenter;
		presenter.attachView(this);
		showGUI();
		
		// TODO Auto-generated constructor stub
	}
	
	private void showGUI(){
		
		presenter.loadfileReader();
		
	}

}
