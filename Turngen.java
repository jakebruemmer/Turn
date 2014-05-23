import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;




public class TurnGenerator extends JFrame {

	/**
	 * Create the panel.
	 */
	private String[] names; 
	private JPanel contentPane;
	private int index;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TurnGenerator turn = new TurnGenerator();
					turn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TurnGenerator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		index = 0;
		
		final String[] names = {"Matt", "Alex", "Arielle", "Aaron", "Caitlin", "Natalie", "Taylor"};
		
		final JTextArea turnShow = new JTextArea();
		turnShow.setBounds(10, 11, 413, 166);
		getContentPane().add(turnShow);
		turnShow.setText("No one's turn");
		
		JButton changeTurn = new JButton("Change Turn!");
		changeTurn.setBounds(171, 211, 110, 23);
		contentPane.add(changeTurn);
		
		changeTurn.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						turnShow.setText(names[index] + "'s turn!");
						if (index != names.length - 1) {
							index++;
						}
						else {
							index = 0;
						}
					}
				});
	}
}
