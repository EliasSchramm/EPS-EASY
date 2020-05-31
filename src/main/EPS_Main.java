package main;

import core.InputTypes;
import easy.*;

import java.awt.Color;
import java.awt.Graphics2D;

import core.EPS;
import core.RenderExtention;


public class EPS_Main {

	static Form main = new Form("Main");
	static Button b = new Button("b");
	static InputField i = new InputField("i");
	//static Image i = new Image("res/i.png", "i");

	public static void main(String[] args) {
		
		main.setMaxScroll(1000);
		main.setScrollMultiplyer(3);
		
		//i.setHeight(300);
		///i.setWidth(300);
		//main.add(i);
		
		Window.addForm(main);

		i.setType(InputTypes.TEXT);
		i.setPos(200,200);

		b.setText("Haööps");
		b.setPos(200, 200);
		b.setOnClick(new OnClick() {
			
			@Override
			public void OnClick() {
				System.out.println("Hi");
				
			}
			
		});
		b.setCanScroll(true);
		main.add(b);
		main.add(i);
		/*FormDrawer.renEx = new RenderExtention() {
			
			@Override
			public void render(Graphics2D g2) {
				g2.setColor(Color.BLACK);
				g2.fillRect(0, 0, 1000, 1000);
				
			}
		};*/
		
		EPS.start();
		
		
 

	}

	
}
