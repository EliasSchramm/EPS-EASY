package easy;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Testdraw extends JLabel{

	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.fillRect(0, 0, 100, 100);
		
		repaint();
		
	}
	
}

