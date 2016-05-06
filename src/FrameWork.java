import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class FrameWork extends JFrame{
	filePresenter presenter;
	
	ArrayList<String> result = new ArrayList<String>();
	
	String[][] finalResult;
	String[] title = { "id ", "First Name", "Last Name", "age" , "gender" + "weight" + "height" + "heart rate"}; 

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
		
		JTextField searchBar = new JTextField("Enter Name", 10);
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		result = presenter.firstFileList;
		// Get column size
		int column = title.length;
		int row = result.size();

		
		JPanel resultField = new JPanel();
		resultField.setLayout(new FlowLayout());
		JLabel resultName = new JLabel("Result");
		JTable table = new JTable(row+1, column);
		table.setSize(new Dimension(400,400));
		System.out.println(row);
		System.out.println(column);
		
		finalResult = new String[row][column];
		
		
		resultField.add(table,BorderLayout.CENTER);
		
		
		
//		resultName.setAlignmentX(CENTER_ALIGNMENT);
//		resultField.add(resultName);
//		resultField.setBorder(BorderFactory.createRaisedBevelBorder());
//		
//		result = presenter.resultFieldList;
//		
//		for(int i = 0; i < result.size(); i++)
//		{
//			resultField.add(new JTextArea(result.get(i)));
//		}
		
		buttonKeys.add(quickSortButton);
		buttonKeys.add(heapSortButton);
		buttonKeys.add(mergeSortButton);
		
		buttonKeys.add(searchBar);
		buttonKeys.add(searchButton);
		
		theFrame.add(resultField);
		
		theFrame.add(buttonKeys, BorderLayout.NORTH);
		theFrame.add(resultField,BorderLayout.CENTER);
		theFrame.setSize(800, 900);
		theFrame.setVisible(true);
			
	}

}
