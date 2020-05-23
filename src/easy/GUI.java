package easy;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JFrame;

import button_scripts.ChangeForm;
import button_scripts.OnClickExit;
import core.HandlerExtention;
import core.InputTypes;


import java.awt.GraphicsEnvironment;
import java.awt.event.KeyListener;
import java.awt.GraphicsDevice; 

public class GUI {
	
	static GraphicsDevice device = GraphicsEnvironment
	        .getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	public static Window Window;
	
	public static Form Main, Main2;
	
	public static Text t1, t2, t3, t4;
	
	public static Image i1, i2;
	
	public static Button b1, b2, bexit;
	
	public static TextField tf1;
	
	public static InputField if1;
	
	private static Handler h = new Handler();
	
	public static KeyListener li = h;
	
	public static void setHandlerExtention(HandlerExtention e) {
		h.setEx(e);
	}
	
	public GUI() {
		
		Window = new Window();
		
		Window.jf1 = new JFrame();
		Window.jf1.setSize(Window.getWINDOW_X(), Window.getWINDOW_Y());
		Window.jf1.setTitle(Window.getWINDOW_TITEL());
		Window.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.jf1.setLayout(null);
		Window.jf1.setResizable(false);
		Window.jf1.setVisible(true);
		Window.jf1.setLocationRelativeTo(null);
		Window.jf1.addKeyListener(li);
		Window.jf1.addMouseListener(new Handler());
		Window.jf1.addMouseMotionListener(new Handler());
		Window.jf1.addMouseWheelListener(new Handler());
		
		
		
	//device.setFullScreenWindow(Window.jf1);
		
		
		
		
		
		FormDrawer draw1 = new FormDrawer();
		draw1.setBounds(0, 0, Window.getWINDOW_X(), Window.getWINDOW_Y());
		draw1.setVisible(true);
		Window.jf1.add(draw1);
		
		Window.jf1.repaint();
	}

}
