package easy;

import java.awt.Color;
import java.awt.Font;

public class TextField {
	private  int X = 0;
	private  int Y = 0;
	private  int TextSize = 20;
	private  int scroll = 0;
	private int calculatedHeight = 0;
	
	private int maxWidth = 500;
	private int bordersize = 4;
	
	private boolean hasBackground = false;
	private boolean hasBorder = true;
	private boolean active = true;
	
	private Color BorderColor = Color.BLACK;
	private Color BackgroundColor= Color.WHITE;
	private Color TextColor = Color.BLACK;
	

	private String ID;
	private  String Text;
	private  String FontFamily = "Arial";
	
	private int FontType = Font.PLAIN;

	public void setPos(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	private Boolean canScroll = false;
	
	
	
	
	
	public int getCalculatedHeight() {
		return calculatedHeight;
	}

	public void setCalculatedHeight(int calculatedHeight) {
		this.calculatedHeight = calculatedHeight;
	}

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



	public int getMaxWidth() {
		return maxWidth;
	}



	public void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}



	public int getBordersize() {
		return bordersize;
	}



	public void setBordersize(int bordersize) {
		this.bordersize = bordersize;
	}



	public boolean isHasBackground() {
		return hasBackground;
	}



	public void setHasBackground(boolean hasBackground) {
		this.hasBackground = hasBackground;
	}



	public boolean isHasBorder() {
		return hasBorder;
	}



	public void setHasBorder(boolean hasBorder) {
		this.hasBorder = hasBorder;
	}



	public Color getBorderColor() {
		return BorderColor;
	}



	public void setBorderColor(Color borderColor) {
		BorderColor = borderColor;
	}



	public Color getBackgroundColor() {
		return BackgroundColor;
	}



	public void setBackgroundColor(Color backgroundColor) {
		BackgroundColor = backgroundColor;
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

	public TextField(String id) {
		this.ID = id;
	}
}
