package easy;

import java.awt.Color;
import java.awt.Font;

import core.InputTypes;

public class InputField {
	private int rows = 1;
	private int whitdh = 400;
	private InputTypes type = InputTypes.TEXT;
	private int x = 0;
	private int y = 0;
	private int bordersize = 3;
	private int textsize = 30;
	private int tmpx = 0;
	private  int scroll = 0;
	
	private long Number = 0;
	
	public int getScroll() {
		return scroll;
	}

	public void setScroll(int scroll) {
		this.scroll = scroll;
	}

	private boolean active = true;
	private boolean inputIsActive = false;
	private boolean canGrow = false;
	private boolean Visible = true;
	private Boolean canScroll = false;
	
	
	
	

	
	
	private Color borderColor = Color.DARK_GRAY;
	private Color TextColor = Color.BLACK;
	private Color activatedColor = Color.RED;
	private Color HintColor = Color.LIGHT_GRAY;
	
	private String fontFamily = "Arial";
	private String Text = "";
	private String Hint = null;
	private String ID;
	
	private int FontType = Font.PLAIN;
	
	
	public Boolean getCanScroll() {
		return canScroll;
	}

	public void setCanScroll(Boolean canScroll) {
		this.canScroll = canScroll;
	}
	
	
	
	public long getNumber() {
		return Number;
	}

	public void setNumber(long number) {
		Number = number;
	}

	public int getTmpx() {
		
		return tmpx;
	}

	public void setTmpx(int tmpx) 
	{
		
		this.tmpx = tmpx;
	}

	public Color getHintColor() {
		return HintColor;
	}

	public void setHintColor(Color hintColor) {
		HintColor = hintColor;
	}

	public Color getActivatedColor() {
		return activatedColor;
	}

	public void setActivatedColor(Color activatedColor) {
		this.activatedColor = activatedColor;
	}

	public int getTextsize() {
		return textsize;
	}

	public void setTextsize(int textsize) {
		this.textsize = textsize;
	}

	public int getFontType() {
		return FontType;
	}

	public void setFontType(int fontType) {
		FontType = fontType;
	}

	public int getTextSize() {
		return textsize;
	}

	public void setTextSize(int textsize) {
		this.textsize = textsize;
	}

	public int getBordersize() {
		return bordersize;
	}

	public void setBordersize(int bordersize) {
		this.bordersize = bordersize;
	}

	public InputTypes getType() {
		return type;
	}

	public void setType(InputTypes type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y+ this.scroll;
	}

	public void setY(int y) {
		this.y = y ;
	}

	public InputField(String ID) {
		this.ID = ID;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getWhitdh() {
		return whitdh;
	}

	public void setWhith(int whith) {
		this.whitdh = whith;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isInputIsActive() {
		return inputIsActive;
	}

	public void setInputIsActive(boolean inputIsActive) {
		this.inputIsActive = inputIsActive;
	}

	public boolean isCanGrow() {
		return canGrow;
	}

	public void setCanGrow(boolean canGrow) {
		this.canGrow = canGrow;
	}

	public boolean isVisible() {
		return Visible;
	}

	public void setVisible(boolean visible) {
		Visible = visible;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public Color getTextColor() {
		return TextColor;
	}

	public void setTextColor(Color textColor) {
		TextColor = textColor;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public String getHint() {
		return Hint;
	}

	public void setHint(String hint) {
		Hint = hint;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setPos(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	
	
	
	
	
}
