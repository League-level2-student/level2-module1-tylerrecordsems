package _01_array_list_visualizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import _01_array_list_visualizer.data.ArrayList;

public class VisualArrayLists implements ActionListener {
	Timer timer;
	JFrame frame = new JFrame();
	
	ArrayList<String> list = new ArrayList<String>();

	public void addThingsToList() {
		// 1. Add a bunch of items to our list (4 or 5 should be enough!)
		
		list.add("Bo");
		list.add("Jo");
		list.add("Smo");
		list.add("Go");
		list.add("To");
		// 2. Set one item in our list to be something different
		list.set(3, "Tim");
		// 3. Remove something from our list
		list.remove(2);
		// 4. Print the size of our list
	for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
	}
		// 5. Check if our list contains a specific thing of your choice
		//	  and print whether it is in the list or not.
		if (list.contains("T")) {
			System.out.println(list.size()+" Contains T");
		}else {
			System.out.println(list.size()+" Doesn't Contain T");
		}
		// 6. Get a specific item from our list and print it out
	//[START-HERE]	System.out.println(list.size());
		// 7. Clear our list of all items
		list.remove(0);
		list.remove(2);
		list.remove(3);
		list.remove(4);
		// 8. Print the size of our list again
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			}
	}
	
	
	/*
	 * ------------DONT CHANGE ANYTHING BELOW THIS LINE-----------------------------------------
	 */
	public static void main(String[] args) {
		VisualArrayLists vcc = new VisualArrayLists();
		vcc.setup();
	}

	void setup() {
		timer = new Timer(1000 / 60, this);
		timer.start();
		frame.setVisible(true);
		frame.setTitle("LEAGUE ArrayList Visualizer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(list.displayPanel);
		frame.pack();
		addThingsToList();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		list.draw();
	}
}
