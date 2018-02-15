package zad2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bb extends JFrame{
	private static final long serialVersionUID = 1L;
	int i = 0;
	Color[] bgColor = {Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.GREEN, Color.PINK};
	public void bAction(){
		if(i==bgColor.length-1){
			i=0;
		}
		else i++;
	}
	
	public Bb(){
	JPanel jp = new JPanel();
	jp.setLayout(new BorderLayout());
	
		JButton jb = new JButton("opis");
		jb.setFont(new Font("Calibri", Font.PLAIN, 20));
		jb.setBackground(bgColor[i]);
		jb.setOpaque(true);
		jp.add(jb, "Center");	
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bAction();
				jb.setBackground(bgColor[i]);
			}
		} );
	getContentPane().add(jp);
	}
}
