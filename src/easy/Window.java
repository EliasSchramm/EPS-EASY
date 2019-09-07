package easy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Window {
	
	public static JFrame jf1;
	
	private static int WINDOW_X = 1280;
	private static int WINDOW_Y = 720;	
	
	private static String WINDOW_TITEL = "EPS_EASY";
	private static String AKT_FORM_ID;
	
	private static boolean WINDOW_Resizable = false;
	private static boolean WINDOW_Visible = true;
	
	private static long lastFrameTime;
	private static float delta;
	
	//private static Form [] Forms = new Form[9999];
	
	private static List<Form> Forms = new ArrayList<Form>();
	
	public static void initTime() {
		long millis = System.currentTimeMillis() % 1000;
		lastFrameTime = millis;
	}
	
	
	
	public static JFrame getJf1() {
		return jf1;
	}



	public static void setJf1(JFrame jf1) {
		Window.jf1 = jf1;
	}



	public static long getLastFrameTime() {
		return lastFrameTime;
	}



	public static void setLastFrameTime(long lastFrameTime) {
		Window.lastFrameTime = lastFrameTime;
	}



	public static float getDelta() {
		return delta;
	}



	public static void setDelta(float delta) {
		Window.delta = delta;
	}



	public static void updateTime() {
		long currentFrameTime = System.currentTimeMillis() * 1000;
		delta = (currentFrameTime - lastFrameTime) / 1000f;
		lastFrameTime = currentFrameTime;
	}

	public static String getAKT_FORM_ID() {
		return AKT_FORM_ID;
	}

	public static void setAKT_FORM_ID(String aKT_FORM_ID) {
		AKT_FORM_ID = aKT_FORM_ID;
	}

	private static int getFormLenght(){
		int TMP = Forms.size();
		
		
		
		return TMP;
	}
	
	public static void addForm(Form Form) {
		
		int TMP = getFormLenght();
		
		Forms.add(Form);
		
		if (TMP == 0) {
			AKT_FORM_ID = Form.getID();
		}
		
	}
	
	public Window() {
		
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

	public static List<Form> getForms() {
		return Forms;
	}
	
	public static Form getFormByID(String ID) {
		
		
		
		for (Form form : Forms) {
			if(form.getID() == ID) {
				return form;
			}
		}
		
		
		return null; 
	}
	
	public static Text getTextByID(String id) {
		
		for (Form form : Forms) {
			for (Text t : form.getText()) {
				if(t.getID() == id) {
					return t;
				}
			}
		}
		
		return null;
	}
	
	public static Image getImageByID(String id) {
		
		for (Form form : Forms) {
			for (Image t : form.getImage()) {
				if(t.getID() == id) {
					return t;
				}
			}
		}
		
		return null;
	}
	
	public static Button getButtonByID(String id) {
		
		for (Form form : Forms) {
			for (Button t : form.getButton()) {
				if(t.getID() == id) {
					return t;
				}
			}
		}
		
		return null;
	}
	
	public static TextField getTextFieldByID(String id) {
		
		for (Form form : Forms) {
			for (TextField t : form.getTextField()) {
				if(t.getID() == id) {
					return t;
				}
			}
		}
		
		return null;
	}

	public static InputField getInputFieldByID(String id) {
		
		for (Form form : Forms) {
			for (InputField t : form.getInputField()) {
				if(t.getID() == id) {
					return t;
				}
			}
		}
		
		return null;
	}
	
	
	
	

}
