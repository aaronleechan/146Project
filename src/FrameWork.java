import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class FrameWork extends JFrame {

	filePresenter presenter;
	
	ArrayList<String> result = new ArrayList<String>();
	ArrayList<String> resultValue = new ArrayList<String>();
	JPanel resultField;
	JPanel resultFieldColumn;
	
	String[] title = { "id ", "First Name", "Last Name", "age" , "gender" , "weight" , "height" , "heart rate"}; 

	public FrameWork(filePresenter filePresenter) {
		this.presenter = filePresenter;
		presenter.attachView(this);
		showGUI();

		// TODO Auto-generated constructor stub
	}

	private void showGUI() {
		presenter.loadfileReader();

		JFrame theFrame = new JFrame("FrameWork");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setLayout(new BorderLayout());

		JPanel buttonKeys = new JPanel(new FlowLayout());
		buttonKeys.add(new JLabel());

		JButton quickSortButton = new JButton("Sort height");
		quickSortButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JButton heapSortButton = new JButton("heap Sort");
		heapSortButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JButton mergeSortButton = new JButton("merge Sort");
		mergeSortButton.addActionListener(new ActionListener() {

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

		
		JPanel titleField = new JPanel();
		titleField.setLayout(new GridLayout(0,column));
		titleField.setSize(100, 100);
			
		for(int i = 0; i < title.length; i++)
		{
			
			titleField.add(new JLabel(title[i]));
		}
		
		System.out.println(row);
		System.out.println(column);
		
		resultField = new JPanel();
		resultField.setLayout(new GridLayout(row,column));
		
		for(int i = 0; i < result.size(); i++)
		{
			String[] s = result.get(i).split(" ");
			for(String sS : s)
			{
				resultValue.add(sS);
			}
		}
		
		for(int i = 0; i < resultValue.size(); i++)
		{
			resultField.add(new JLabel(resultValue.get(i)));
		}
		
		
		buttonKeys.add(quickSortButton);
		buttonKeys.add(heapSortButton);
		buttonKeys.add(mergeSortButton);
		
		buttonKeys.add(searchBar);
		buttonKeys.add(searchButton);
		
		theFrame.add(titleField);
		

		buttonKeys.add(quickSortButton);
		buttonKeys.add(heapSortButton);
		buttonKeys.add(mergeSortButton);


		theFrame.add(buttonKeys, BorderLayout.SOUTH);
		
		theFrame.add(titleField,BorderLayout.NORTH);
		theFrame.add(resultField, BorderLayout.CENTER);
		theFrame.setSize(800, 900);
		theFrame.setVisible(true);

	}

}
