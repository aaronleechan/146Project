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
	JLabel comeOut;
	
	String[] title = { "id ", "First Name", "Last Name", "age" , "gender" , "weight" , "height" , "heart rate"}; 

	public FrameWork(filePresenter filePresenter) {
		this.presenter = filePresenter;
		presenter.attachView(this);
		showGUI();

		// TODO Auto-generated constructor stub
	}

	private void showGUI() {
		presenter.loadfileReader();
		
		result = presenter.firstFileList;
		
		// Get column size
		final int column = title.length;
		final int row = result.size();

		final JFrame theFrame = new JFrame("FrameWork");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setLayout(new BorderLayout());

		final JPanel buttonKeys = new JPanel(new FlowLayout());
		//buttonKeys.add(new JLabel());
		
		
		// Title Print Out
		final JPanel titleField = new JPanel();
		titleField.setLayout(new GridLayout(0,column));
		titleField.setSize(100, 100);
			
		for(int i = 0; i < title.length; i++)
		{
			titleField.add(new JLabel(title[i]));
		}
		/////////////////////////////////////////////////////////////////////////
		resultField = new JPanel();
		resultField.setLayout(new GridLayout(row,column));


		JButton quickSortButton = new JButton("Sort height");
		buttonKeys.add(quickSortButton);
		quickSortButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				resultValue.clear();
				
				result = presenter.quickSortList;
				resultField.repaint();
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
					comeOut = new JLabel();
					comeOut.setText(resultValue.get(i));
					resultField.add(comeOut);
				}
				
				theFrame.add(resultField, BorderLayout.CENTER);
				theFrame.setVisible(true);
				// TODO Auto-generated method stub
			}
		});

		JButton heapSortButton = new JButton("heap Sort");
		buttonKeys.add(heapSortButton);
		heapSortButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				resultValue.clear();
				
				result = presenter.heapSorterList;
				resultField.repaint();
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
					comeOut = new JLabel();
					comeOut.setText(resultValue.get(i));
					resultField.add(comeOut);
				}
				
				theFrame.add(resultField, BorderLayout.CENTER);
				theFrame.setVisible(true);
				// TODO Auto-generated method stub
			}
		});

		JButton mergeSortButton = new JButton("merge Sort");
		buttonKeys.add(mergeSortButton);
		mergeSortButton.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				
				resultValue.clear();
				
				result = presenter.mergeSortList;
				resultField.repaint();
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
					comeOut = new JLabel();
					comeOut.setText(resultValue.get(i));
					resultField.add(comeOut);
				}
				
				theFrame.add(resultField, BorderLayout.CENTER);
				theFrame.setVisible(true);
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
			comeOut = new JLabel(resultValue.get(i));
			resultField.add(comeOut);
		}
		

		theFrame.add(buttonKeys, BorderLayout.SOUTH);
		theFrame.add(titleField,BorderLayout.NORTH);
//		
		try{ theFrame.add(resultField, BorderLayout.CENTER);}
		catch(Exception e){	e.printStackTrace(); }
		
		theFrame.setSize(800, 900);
		theFrame.setVisible(true);

	}

}
