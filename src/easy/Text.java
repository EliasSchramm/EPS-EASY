package easy;

import java.awt.Color;
import java.awt.Font;

public class Text {

	private  int X = 0;
	private  int Y = 0;
	private  int TextSize = 30;
	private  int scroll = 0;
	private  Color TextColor = Color.BLACK;

	private String ID;
	private  String Text;
	private  String FontFamily = "Arial";
	
	private int FontType = Font.PLAIN;

	private boolean active = true;
	
private Boolean canScroll = false;
	
	
	
	
	
	public int getScroll() {
	return scroll;
}

public void setScroll(int scroll) {
	this.scroll = scroll;
}

	public Boolean getCanScroll() {
		return canScroll;
	}

	public void setCanScroll(Boolean canScroll) {
		this.canScroll = canScroll;
	}
	
	
	
	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public void setPos(int x, int y) {
		this.X = x;
		this.Y = y;
				
	}
	
	
	
	public int getFontType() {
		return FontType;
	}



	public void setFontType(int fontType) {
		FontType = fontType;
	}



	public int getX() {
		return this.X;
	}

	public void setX(int x) {
		this.X = x;
	}

	public  int getY() {
		return this.Y + this.scroll;
	}

	public  void setY(int y) {
		this.Y = y;
	}

	public  int getTextSize() {
		return this.TextSize;
	}

	public  void setTextSize(int textSize) {
		this.TextSize = textSize;
	}

	public  Color getTextColor() {
		return this.TextColor;
	}

	public  void setTextColor(Color textColor) {
		this.TextColor = textColor;
	}

	public  String getText() {
		return this.Text;
	}

	public  void setText(String text) {
		this.Text = text;
	}

	public  String getFontFamily() {
		return this.FontFamily;
	}

	public  void setFontFamily(String fontFamily) {
		this.FontFamily = fontFamily;
	}

	public  String getID() {
		return this.ID;
	}

	public Text(String id) {
		this.ID = id;
	}

}
