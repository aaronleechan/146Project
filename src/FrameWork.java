<<<<<<< HEAD
public class FrameWork {
=======
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FrameWork extends JFrame{
>>>>>>> d94b62843f3deead7f323128faa23192e7f1d4ca
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
		
		JPanel buttonKeys = new JPanel(new FlowLayout());
		buttonKeys.add(new JLabel());
		
		JButton quickSortButton = new JButton("Sort height");
		quickSortButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton heapSortButton = new JButton("heap Sort");
		heapSortButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JButton mergeSortButton = new JButton("merge Sort");
		mergeSortButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		buttonKeys.add(quickSortButton);
		buttonKeys.add(heapSortButton);
		buttonKeys.add(mergeSortButton);
		
		
		theFrame.add(buttonKeys, BorderLayout.NORTH);
		theFrame.setSize(800, 900);
		theFrame.setVisible(true);
			
	}

}
