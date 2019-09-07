package var;

import javax.swing.JFrame;

public class VAR {
	
	public static JFrame jf1;
	
	private static int WINDOW_X = 1280;
	private static int WINDOW_Y = 720;
	
	private static String WINDOW_TITEL = "EPS_EASY";
	
	private static boolean WINDOW_Resizable = false;
	private static boolean WINDOW_Visible = true;
	
	
	
	public static boolean isWINDOW_Resizable() {
		return WINDOW_Resizable;
	}
	public static void setWINDOW_Resizable(boolean wINDOW_Resizable) {
		WINDOW_Resizable = wINDOW_Resizable;
	}
	public static boolean isWINDOW_Visible() {
		return WINDOW_Visible;
	}
	public static void setWINDOW_Visible(boolean wINDOW_Visible) {
		WINDOW_Visible = wINDOW_Visible;
	}
	public static int getWINDOW_X() {
		return WINDOW_X;
	}
	public static void setWINDOW_X(int wINDOW_X) {
		WINDOW_X = wINDOW_X;
	}
	public static int getWINDOW_Y() {
		return WINDOW_Y;
	}
	public static void setWINDOW_Y(int wINDOW_Y) {
		WINDOW_Y = wINDOW_Y;
	}
	public static String getWINDOW_TITEL() {
		return WINDOW_TITEL;
	}
	public static void setWINDOW_TITEL(String wINDOW_TITEL) {
		WINDOW_TITEL = wINDOW_TITEL;
	}
	
	
}
