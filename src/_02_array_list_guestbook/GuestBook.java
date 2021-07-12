package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	void run() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.setVisible(true);
		add.setText("Add Name");
		view.setText("View Names");
		add.addActionListener(this);
		view.addActionListener(this);
		
		
		
		
		frame.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (add==arg0.getSource()) {
			String input = JOptionPane.showInputDialog("Enter a name!");
			names.add(input);
		}if (view==arg0.getSource()) {
			String t = "";
			for (int i = 0; i < names.size(); i++) {
				t+="Guest #"+(i+1)+": "+names.get(i)+"\n";
			
			}
			JOptionPane.showMessageDialog(null,t);
		}
	}
}
