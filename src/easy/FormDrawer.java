package easy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;



import core.InputTypes;
import core.RenderExtention;

public class FormDrawer extends JLabel {

	public static Graphics gg;
	private static Boolean loading = true;
	
	List<String> Rows = new ArrayList<String>();
	List<String> Rows1 = new ArrayList<String>();
	private static long lastFrameTime;
	private static float delta;
	private AffineTransform ident = new AffineTransform();
	public static RenderExtention renEx = null;
	
	public static void setR(RenderExtention r) {
		renEx= r;
	}
	
	protected void paintComponent(Graphics g) {

		gg = g;
		
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		Form_Main();

		Image_Main();
		
		if(renEx != null) {
			renEx.render(g2d);
		}
		
		Button_Main();

		Text_Main();
		
		textField_Main();
		
		Inputfield_Main();
		
		
		
		repaint();

	}

	// ###########################################################
	// # Akt. Window #
	// ###########################################################
	
	private void updateWindowSize() {
		GUI.Window.setWINDOW_X(GUI.Window.jf1.getSize().width);
		GUI.Window.setWINDOW_Y(GUI.Window.jf1.getSize().height);	
		
		GUI.Window.jf1.setBounds(0, 0, Window.getWINDOW_X(), Window.getWINDOW_Y());
		Window.jf1.requestFocus();
	}
	
	// ###########################################################
	// # BUTTON #
	// ###########################################################

	private void Button_Main() {

		List<Button> tmp = Window.getFormByID(Window.getAKT_FORM_ID()).getButton();
		

		for (Button b : tmp) {
			if (b.getActive()) {

				switch (b.getState()) {
				case 1:

					Button_DrawHoverState(b);

					break;

				case 2:

					Button_DrawPressedState(b);

					break;

				default:

					Button_DrawNormalState(b);

					break;
				}

			} else {

				Button_DrawNonactiveState(b);

			}

		}

			
			

	}

	private void Button_DrawNormalState(Button tmp) {

		if (tmp.getImg_normal() == null) {

			gg.setColor(tmp.getColor_normal());
			gg.fillRect(tmp.getX(), tmp.getY() - 20, tmp.getWidth(), tmp.getHeight());
			ButtonDrawText(tmp.getText(),tmp);
		} else {

			gg.drawImage(tmp.getImg_normal().getImg(), tmp.getX(), tmp.getY() - 20, tmp.getWidth(),
					tmp.getHeight(), null);

		}
	}

	private void Button_DrawPressedState(Button tmp) {

		if (tmp.getImg_pressed() == null) {

			gg.setColor(tmp.getColor_pressed());
			gg.fillRect(tmp.getX(), tmp.getY() - 20, tmp.getWidth(), tmp.getHeight());
			ButtonDrawText(tmp.getText(), tmp);
		} else {

			gg.drawImage(tmp.getImg_pressed().getImg(), tmp.getX(), tmp.getY() - 20, tmp.getWidth(),
					tmp.getHeight(), null);

		}

	}

	private void Button_DrawHoverState(Button tmp) {

		if (tmp.getImg_hover() == null) {

			gg.setColor(tmp.getColor_hover());
			gg.fillRect(tmp.getX(), tmp.getY() - 20, tmp.getWidth(), tmp.getHeight());
			ButtonDrawText(tmp.getText(),tmp);
		} else {

			gg.drawImage(tmp.getImg_hover().getImg(), tmp.getX(), tmp.getY() - 20, tmp.getWidth(),
					tmp.getHeight(), null);

		}

	}

	private void Button_DrawNonactiveState(Button tmp) {
		
		if(tmp.getImg_notActive() == null) {
			
			gg.setColor(tmp.getColor_notActive());
			gg.fillRect(tmp.getX(), tmp.getY() - 20, tmp.getWidth(), tmp.getHeight());
			ButtonDrawText(tmp.getText(), tmp);
		}else {
			
			gg.drawImage(tmp.getImg_notActive().getImg(),tmp.getX(), tmp.getY() - 20, tmp.getWidth(), tmp.getHeight(), null );
		

		}

	}


	// ###########################################################
	// # IMAGE #
	// ###########################################################

	private void Image_Main() {
		Image_DrawBorder();
		Image_DrawImage();
	}

	private void Image_DrawBorder() {

		List<Image> tmp = Window.getFormByID(Window.getAKT_FORM_ID()).getImage();
		

		for (Image i : tmp) {
			if(i.isActive()) {
				if (i.getHasBorder()) {

				gg.setColor(i.getBorderColor());
				gg.fillRect(i.getX() - i.getBorderPX(), i.getY() - i.getBorderPX(),
						i.getWidth() + 2 * i.getBorderPX(),i.getHeight() + 2 * i.getBorderPX());

				}
			}
			
		}
		
			

			

	}

	private void Image_DrawImage() {
		
		List<Image> tmp = Window.getFormByID(Window.getAKT_FORM_ID()).getImage();
		 for (Image i : tmp) {
			if(i.isActive()) {
				Graphics2D gg2 = (Graphics2D) gg;
				
				gg2.drawImage(i.getImg(), i.getX(), i.getY(), i.getWidth(), i.getHeight(), null);
				
				
			}
			
		}

		

			


	}
	
	// ###########################################################
	// # TEXTField #
	// ###########################################################
	
	
	private void textField_Main() {
		
		List<TextField> tmps =Window.getFormByID(Window.getAKT_FORM_ID()).getTextField();
	
		for (TextField tmp : tmps) {
			if(tmp.isActive()) {
				int x = calculateHeight(tmp);
				textField_Border(tmp, x);
				textField_BG(tmp , x);
				textField_Text(tmp);
			}
			
		}
		
			
			
		
		
	}
	
	private int calculateHeight(TextField i) {
		String[] s1 = i.getText().split(" ");
		
		String tmpROW = "";
		String tmpLastWord = "";
		String tmpROWraw = "";
		
		int t = 0;
		
		Font tempFont = new Font(i.getFontFamily(), i.getFontType(), i.getTextSize());
		gg.setFont(tempFont);
		
		
		Rows.clear();
		
		for (String word : s1) {
			tmpLastWord = word;
			tmpROWraw = tmpROW;
			tmpROW += word + " ";
			t = gg.getFontMetrics().stringWidth(tmpROW);
			if(t >= i.getMaxWidth()) {
				Rows.add(tmpROWraw);
				tmpROW = tmpLastWord + " ";
				
			}
			
		
			
			
		} 
		
		
		
		if (t < i.getMaxWidth()) {
			Rows.add(tmpROW);
		}
		if(tmpROW.length() == 1 && Rows.size() > 1) {
			Rows.add(tmpROW);
		}
		
		i.setCalculatedHeight(Rows.size() * (i.getTextSize() + 5));
		return  Rows.size() * (i.getTextSize() + 5);
	}
	
	private void textField_Text(TextField i) {
		
		gg.setColor(i.getTextColor());
		
		int l = 0;
			for (String row : Rows) {
				gg.drawString(row, i.getX(), i.getY() + l * (i.getTextSize() + 5));
				l ++;
			}
		
	}
	
	private void textField_Border(TextField i, int height) {
		
		if(i.isHasBorder()) {
			gg.setColor(i.getBorderColor());
			gg.fillRect(i.getX() - 2 * i.getBordersize(), i.getY() - i.getTextSize() - 2* i.getBordersize(), i.getMaxWidth() + i.getBordersize(), height + i.getTextSize() + 2 * i.getBordersize());
			
			gg.setColor(Window.getFormByID(Window.getAKT_FORM_ID()).getBackground_Color());
			gg.clearRect(i.getX() - i.getBordersize(), i.getY() - i.getTextSize() - i.getBordersize(), i.getMaxWidth() -i.getBordersize(), height  + i.getTextSize());
		}
		
	}
	
	private void textField_BG(TextField i, int height) {
		if(i.isHasBackground()) {
			
		
		gg.setColor(i.getBackgroundColor());
		gg.clearRect(i.getX() - i.getBordersize(), i.getY() - i.getTextSize() - i.getBordersize(), i.getMaxWidth() -i.getBordersize(), height  + i.getTextSize());
		
		
		
		}
	}
	
	// ###########################################################
	// # TEXT #
	// ###########################################################

	private void Text_Main() {
		List<Text> tmps =Window.getFormByID(Window.getAKT_FORM_ID()).getText();
		

		for (Text tmp : tmps) {
			
			if(tmp.isActive()) {
				gg.setFont(new Font(tmp.getFontFamily(), tmp.getFontType(), tmp.getTextSize()));
				gg.setColor(tmp.getTextColor());
				gg.drawString(tmp.getText(), tmp.getX(), tmp.getY());

			}
			
			
		}

	}
	
	private void ButtonDrawText(Text tmp, Button tmp2 ) {
		gg.setFont(new Font(tmp.getFontFamily(), tmp.getFontType(), tmp.getTextSize()));
		gg.setColor(tmp.getTextColor());
		int o = gg.getFontMetrics().stringWidth(tmp.getText());
		gg.drawString(tmp.getText(),tmp2.getX() + tmp2.getWidth()/2 - o/2, tmp2.getY() - 20 + tmp2.getHeight()/2 + tmp.getTextSize()/2 );
	}
	
	// ###########################################################
	// # Input Field #
	// ###########################################################
	
	private void Inputfield_Main() {
		
		for (InputField tmp : Window.getFormByID(Window.getAKT_FORM_ID()).getInputField()) {
			
			if(tmp.isActive()) {
				
				int x = calculateInputFieldString(tmp);
				Inputfield_Border(tmp, x);						
				Inputfield_Text(tmp);
				
				
			}
			
			
		}
		
	}
	
	private void Inputfield_Border(InputField i, int height) {
		
		if(i.isInputIsActive()) {
			gg.setColor(i.getActivatedColor());
		}else {
			gg.setColor(i.getBorderColor());
		}
			
			gg.fillRect(i.getX() - 2 * i.getBordersize(), i.getY() - i.getTextSize() - 2* i.getBordersize(), i.getWhitdh() + i.getBordersize(), height + i.getTextSize() + 2 * i.getBordersize());
			
			gg.setColor(Window.getFormByID(Window.getAKT_FORM_ID()).getBackground_Color());
			gg.clearRect(i.getX() - i.getBordersize(), i.getY() - i.getTextSize() - i.getBordersize(), i.getWhitdh() -i.getBordersize(), height  + i.getTextSize());
		
		
		
	}
	
	private void Inputfield_Text(InputField i) {
		gg.setFont(new Font(i.getFontFamily(), i.getFontType(), i.getTextSize()));
		if(i.getType() == InputTypes.TEXT ) {
			
			if(i.getText() == null) {
				gg.setColor(i.getHintColor());
				gg.drawString(i.getHint(), i.getX(), i.getY() +(i.getTextSize() /2));
			}else {
				gg.setColor(i.getTextColor());
				int l = 0;
				for (String row : Rows1) {
					
					gg.drawString(row, i.getX(), i.getY() + l * (i.getTextSize() + 5));
					l ++;
				}
			}
			
		}else if(i.getType() == InputTypes.NUMBER) {
			
				gg.setColor(i.getTextColor());
				int l = 0;
				
					
					gg.drawString(String.valueOf(i.getNumber()), i.getX(), i.getY() + l * (i.getTextSize() + 5));
					l ++;
				
			
		}
	}
	
	private int calculateInputFieldString(InputField i) {
		if(i.getText() != null) {
			
		
		String[] s1 = i.getText().split("");
		
		String tmpROW = "";
		String tmpLastWord = "";
		String tmpROWraw = "";
		
		int t = 0;
		
		Font tempFont = new Font(i.getFontFamily(), i.getFontType(), i.getTextSize());
		gg.setFont(tempFont);
		
		
		Rows1.clear();
		
		for (String word : s1) {
			i.setRows(i.getRows());
			tmpLastWord = word;
			tmpROWraw = tmpROW;
			tmpROW += word;
			t = gg.getFontMetrics().stringWidth(tmpROW);
			if(t >= i.getWhitdh()) {
				if(i.isCanGrow()) {
					
					
					if(i.getRows() <= Rows1.size()) {						
						i.setRows(i.getRows() + 1);
						
					}
					
					tmpROW = tmpLastWord;
					Rows1.add(tmpROWraw);
				}else {
					Rows1.add(tmpROWraw);
					
					break;
				}
				
				
			}
			
		
			
			
		} 
		
		
		if (t < i.getWhitdh()) {
			
			Rows1.add(tmpROW);
		}
		
		if(tmpROW.length() == 1 && Rows1.size() > 1) {
			Rows1.add(tmpROW);
		}
		
		i.setTmpx((Rows1.size() + 1) * (i.getTextSize() + 5)+ i.getTextSize() + 2 * i.getBordersize());
		return  Rows1.size() * (i.getTextSize() + 5);
		}else {
			
			i.setTmpx((Rows1.size() + 1) + 1 * (i.getTextSize() + 5) + i.getTextSize() + 2 * i.getBordersize());
			return i.getRows() * (i.getTextSize() + 5);
		}
	}
	
	

	// ###########################################################
	// # FORM #
	// ###########################################################

	private void Form_Main() {
		Form_RENDER_BG(gg);
	}

	private void Form_RENDER_BG(Graphics g) {
		if (GUI.Window.getFormByID(GUI.Window.getAKT_FORM_ID()).getBackground_Image() != null) {

			gg.drawImage(GUI.Window.getFormByID(GUI.Window.getAKT_FORM_ID()).getBackground_Image().getImg(), 0, 0,
					GUI.Window.getWINDOW_X(), GUI.Window.getWINDOW_Y(), null);

		} else {
			gg.setColor(GUI.Window.getFormByID(GUI.Window.getAKT_FORM_ID()).getBackground_Color());
			gg.fillRect(0, 0, GUI.Window.getWINDOW_X(), GUI.Window.getWINDOW_Y());
		}

	}

}