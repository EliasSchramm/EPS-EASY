package easy;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {

	private BufferedImage img;

	private String PATH;

	private int x = 0;
	private int y = 0;
	private int width;
	private  int height;
	private  int layer = 0;
	private int BorderPX = 2;
	private  int scroll = 0;
	
	private float rotation = 30f;



	private Color BorderColor = Color.BLACK;
	
	private Boolean hasBorder = false;
	
	private String ID;
	
	private boolean active = true;
private Boolean canScroll = false;
	
	
	public int getScroll() {
		return scroll;
	}

	public void setScroll(int scroll) {
		this.scroll = scroll;
	}
	
	
	
	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
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

	public void setPos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public int getBorderPX() {
		return BorderPX;
	}



	public void setBorderPX(int borderPX) {
		BorderPX = borderPX;
	}



	public Color getBorderColor() {
		return BorderColor;
	}



	public void setBorderColor(Color borderColor) {
		BorderColor = borderColor;
	}



	public Boolean getHasBorder() {
		return hasBorder;
	}



	public void setHasBorder(Boolean hasBorder) {
		this.hasBorder = hasBorder;
	}



	public void setImg(BufferedImage img) {
		this.img = img;
	}



	public void setPATH(String pATH) {
		PATH = pATH;
	}



	public Image(String PATH, String ID) {
		this.ID = ID;
		this.PATH = PATH;

		try {

			img = ImageIO.read(new File(PATH));

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		this.width = this.img.getWidth();
		this.height = this.img.getHeight();

	}

	
	
	public String getPATH() {
		return PATH;
	}



	public  int getLayer() {
		return layer;
	}

	public  void setLayer(int layer) {
		this.layer = layer;
	}

	public  int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public  int getY() {
		return y + this.scroll;
	}

	public  void setY(int y) {
		this.y = y;
	}

	public  int getWidth() {
		return width;
	}

	public  void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}



	public  BufferedImage getImg() {
		return img;
	}

	
}
