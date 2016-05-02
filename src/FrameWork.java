import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FrameWork extends JFrame{
	filePresenter presenter;

	public FrameWork(filePresenter filePresenter) {
		this.presenter = filePresenter;
		presenter.attachView(this);
		showGUI();
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	private void showGUI(){
		presenter.loadfileReader();
		
		JFrame theFrame = new JFrame("FrameWork");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setLayout(new BorderLayout());
		
		
		
		JPanel title = new JPanel(new FlowLayout());
		theFrame.add(title, BorderLayout.NORTH);
		theFrame.setSize(800, 900);
		theFrame.setVisible(true);
			
	}

}
