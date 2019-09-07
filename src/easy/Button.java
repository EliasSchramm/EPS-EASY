package easy;

import java.awt.Color;

import core.BUTTON_STATES;

public class Button{

	
	private OnClick OnClick = null;
	private OnHover OnHover = null;
	
	
	
	private String ID;
	
	private int X = 0;
	private int Y = 0;
	private int Height = 100;
	private int Width = 300;
	private int state = 0;
	private  int scroll = 0;
	
	

	private Text Text;
	
	private Image img_normal;
	private Image img_hover;
	private Image img_pressed;
	private Image img_notActive;
	
	private Color color_normal = new Color(000, 149, 255, 215);;
	private Color color_hover = new Color(85, 184, 255, 190);
	private Color color_pressed = new Color(177, 208, 205, 190);
	private Color color_notActive = new Color(255, 255, 255, 255);
	
	
	private Boolean active = true;
	private Boolean canScroll = false;
	
	
	/**
	 * Returns the scrollvalue of this button.
	 * 
	 * @return int
	 */
	public int getScroll() {
		return scroll;
	}
	/**
	 * Set the scrollvalue of this button.
	 * 
	 * @param scroll
	 */
	public void setScroll(int scroll) {
		this.scroll = scroll;
	}
	
	/**
	 * Returns the can scroll bool.
	 * 
	 * @return
	 */
	
	public Boolean getCanScroll() {
		return canScroll;
	}
	
	
/**
	 * Set to true if you want to scroll this button.
	 * 
	 * @return
	 */
	public void setCanScroll(Boolean canScroll) {
		this.canScroll = canScroll;
	}
	/**
	 * Get the ID of this button.
	 * 
	 * @return
	 */
	public String getID() {
		return ID;
	}

	public OnClick getOnClick() {
		return OnClick;
	}

	public OnHover getOnHover() {
		return OnHover;
	}
	
	/**
	 * Returns the color of this button that shows if it isn´t active. 
	 * 
	 * @return
	 */
	
	public Color getColor_notActive() {
		return color_notActive;
	}
	/**
	 * Set the color that shows if it isn´t active.
	 * 
	 * @param color_notActive
	 */
	public void setNotActive(Color color_notActive) {
		this.color_notActive = color_notActive;
	}
	/**
	 * Set the image that shows if it isn´t actice.
	 * 
	 * @param img_notActive
	 */
	public void setNotActive(Image img_notActive) {
		this.img_notActive = img_notActive;
	}
	/**
	 * Returns the image that shows if it isn´t active.
	 * 
	 * @return
	 */
	public Image getImg_notActive() {
		return img_notActive;
	}
	
	/**
	 * Set the position of this Button.
	 * 
	 * @param X
	 * @param Y
	 */
	public void setPos(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	/**
	 * Uses the 'OnClick' function of the Button
	 */
	
	public void Do_OnClick() {
		OnClick.OnClick();
	}
	
	/**
	 * Uses the 'OnHover' function of the Button
	 */
	
	public void Do_OnHover() {
		OnHover.OnHover();
		
	}
	
	/**
	 * Set the 'OnClick' interface of this button
	 * 
	 * @param onClick
	 */
	
	public void setOnClick(OnClick onClick) {
		this.OnClick = onClick;
	}
	
	/**
	 * Set the 'OnHover' interface of the button
	 * 
	 * @param onHover
	 */
	public void setOnHover(OnHover onHover) {
		this.OnHover = onHover;
	}
	
	/**
	 * Set the image that shows in normal state
	 * 
	 * @param PATH
	 */
	
	public void setStateNormal(String PATH) {
		this.img_normal = new Image(PATH, PATH);
	}
	
	/**
	 * Set the color that shows if there isnt set a Image for normal state
	 * 
	 * @param Color
	 */
	
	public void setStateNormal(Color Color) {
		this.color_normal = Color;
	}
	
	/**
	 * Set the image that shows in hover state
	 * 
	 * @param PATH
	 */
	
	public void setStateHover(String PATH) {
		this.img_hover = new Image(PATH, PATH);
	}
	
	/**
	 * Set the color that shows if there isnt set a Image for hover state
	 * 
	 * @param Color
	 */
	
	public void setStateHover(Color Color) {
		this.color_hover = Color;
	}
	
	public void setStatePressed(String PATH) {
		this.img_pressed = new Image(PATH, PATH);
	}
	
	public void setStatePressed(Color Color) {
		this.color_pressed = Color;
	}
	
	
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y + this.scroll;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Text getText() {
		return Text;
	}

	public void setText(Text text) {
		Text = text;
	}
	
	public void setText(String text) {
		Text = new easy.Text("hu");
		Text.setText(text);
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Image getImg_normal() {
		return img_normal;
	}

	public Image getImg_hover() {
		return img_hover;
	}

	public Image getImg_pressed() {
		return img_pressed;
	}

	public Color getColor_normal() {
		return color_normal;
	}

	public Color getColor_hover() {
		return color_hover;
	}

	public Color getColor_pressed() {
		return color_pressed;
	}

	public Button(String ID) {
		this.ID = ID;
		
	}




	
}
