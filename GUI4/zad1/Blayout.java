package zad1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Blayout extends JFrame{

	private static final long serialVersionUID = 1L;

	public Blayout() {
		String[] opis ={"Center", "South", "East", "North", "West"};
		String[] loc = {"Center", "South", "East", "North", "West"};
		int[] fSize = {18, 20, 22, 24, 26};
		Color[] bgColor = {Color.CYAN, Color.BLACK, Color.BLUE, Color.DARK_GRAY, Color.GRAY};
		Color[] fgColor = {Color.YELLOW, Color.WHITE, Color.RED, Color.PINK, Color.ORANGE};
		String[] ttText = {"Center", "South", "East", "North", "West"};
			
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		for(int i=0;i<opis.length;i++){
			JLabel jl = new JLabel(opis[i], JLabel.CENTER);
			jl.setFont(new Font("Calibri", Font.PLAIN, fSize[i]) );
			jl.setBackground(bgColor[i]);
			jl.setForeground(fgColor[i]);
			jl.setToolTipText(ttText[i]);
			jl.setBorder(BorderFactory.createLineBorder(fgColor[i]));
			jl.setOpaque(true);
			jp.add(jl, loc[i]);
		}
		getContentPane().add(jp);
		
		
	}
}
