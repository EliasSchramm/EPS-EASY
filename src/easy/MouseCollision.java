package easy;

import java.util.List;

import core.BUTTON_STATES;

public class MouseCollision {

	int mouseX, mouseY, x, y, width, height;

	public boolean inside(int mouseX, int mouseY, Button btn) {

		this.mouseX = mouseX;
		this.mouseY = mouseY;
		this.x = btn.getX();
		this.y = btn.getY();
		this.width = btn.getWidth();
		this.height = btn.getHeight();

		if (this.mouseX >= this.x && this.mouseX <= this.x + this.width && this.mouseY > this.y && this.mouseY <= this.y + this.height) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean inside(int mouseX, int mouseY, InputField btn) {

		this.mouseX = mouseX;
		this.mouseY = mouseY;
		this.x = btn.getX();
		this.y = btn.getY();
		this.width = btn.getWhitdh();
		this.height = btn.getTmpx()  * 2;
		

		if (this.mouseX >= this.x && this.mouseX <= this.x + this.width && this.mouseY > this.y && this.mouseY <= this.y + this.height) {
			return true;
		} else {
			return false;
		}

	}
	
	
	public void checkClolision2(int mouseX, int mouseY, Boolean b) {
		List<InputField> n = GUI.Window.getFormByID(GUI.Window.getAKT_FORM_ID()).getInputField();
		int i = 0;
		
		
		for(InputField btn : n) {
			if(btn.isActive()) {
				if(inside(mouseX, mouseY, btn)) {
					btn.setInputIsActive(true);
				}else {
					btn.setInputIsActive(false);
				}
			}
		}
		
	
			
			
			
			
			
		}
	
	public void checkClolision(int mouseX, int mouseY, Boolean b) {
		List<Button> n = GUI.Window.getFormByID(GUI.Window.getAKT_FORM_ID()).getButton();
		int i = 0;
		
		
		for(Button btn : n) {
			if(btn.getActive()) {
				if(b) {
					
					if(inside(mouseX, mouseY, btn)) {
						
						btn.setState(2);
						
						if(btn.getOnClick() != null) {
							btn.Do_OnClick();
							this.checkClolision(mouseX, mouseY, false);
							}
					
					}else {
						btn.setState(1);
						
					}
					
				}else {
					if(inside(mouseX, mouseY, btn)) {
						
						btn.setState(1);
						
						if(btn.getOnHover() != null) {
							btn.Do_OnHover();
						}
						
						
						
					}else {
						btn.setState(0);
					}
				}
			}
		}
		
	
			
			
			
			
			
		}
	
	
		
	
	

}
