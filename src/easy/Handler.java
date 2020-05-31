package easy;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import core.HandlerExtention;
import core.InputTypes;

public class Handler implements KeyListener, MouseListener, MouseWheelListener, MouseMotionListener {

	private HandlerExtention ex = null;

	public void checkInputfieldInput(char s, int b) {
		List<InputField> in = Window.getFormByID(Window.getAKT_FORM_ID()).getInputField();

		String[] str;
		for (InputField iF : in) {
			if (iF.isInputIsActive()) {
				if (iF.getType() == InputTypes.TEXT) {
					str = iF.getText().split("");
					if (b == 8) {

						int j = str.length - 1;
						if (j >= 0) {
							int i = 0;
							String[] tmp = new String[9000];
							while (i < j) {

								tmp[i] = str[i];
								i++;
							}

							StringBuilder sss = new StringBuilder();
							for (String ss : tmp) {
								if (ss != null) {
									sss.append(ss);
								}
							}
							iF.setText(sss.toString());
						}

					} else {
						String mss = Character.toString(s);

						iF.setText(iF.getText() + mss);

					}
				} else if (iF.getType() == InputTypes.TEXT) {
					if (b == 8) {
						iF.setNumber(iF.getNumber() / 10);
					} else {
						switch (Character.toString(s)) {

						case "0":
							iF.setNumber(iF.getNumber() * 10 + 0);
							break;
						case "1":
							iF.setNumber(iF.getNumber() * 10 + 1);
							break;
						case "2":
							iF.setNumber(iF.getNumber() * 10 + 2);
							break;
						case "3":
							iF.setNumber(iF.getNumber() * 10 + 3);
							break;
						case "4":
							iF.setNumber(iF.getNumber() * 10 + 4);
							break;
						case "5":
							iF.setNumber(iF.getNumber() * 10 + 5);
							break;
						case "6":
							iF.setNumber(iF.getNumber() * 10 + 6);
							break;
						case "7":
							iF.setNumber(iF.getNumber() * 10 + 7);
							break;
						case "8":
							iF.setNumber(iF.getNumber() * 10 + 8);
							break;
						case "9":
							iF.setNumber(iF.getNumber() * 10 + 9);
							break;
						}
					}

				}

			}
		}
	}

	MouseCollision c = new MouseCollision();

	public HandlerExtention getEx() {
		return ex;
	}

	public void setEx(HandlerExtention ex) {
		this.ex = ex;
	}

	public Handler() {

	}

	public void inputfield_paste(){
		List<InputField> list = Window.getFormByID(Window.getAKT_FORM_ID()).getInputField();
		for(InputField i : list){
			if(i.isActive()){
				String data = null;
				try {
					data = (String) Toolkit.getDefaultToolkit()
							.getSystemClipboard().getData(DataFlavor.stringFlavor);
				} catch (UnsupportedFlavorException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				//i.setText(i.getText()+data);
			}
		}
	}

	public void keyTyped(KeyEvent e) {

		if((e.getKeyCode() == KeyEvent.VK_V) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)){
			//inputfield_paste();
			System.out.println("lol");
		}else{
			checkInputfieldInput(e.getKeyChar(), KeyEvent.getExtendedKeyCodeForChar(e.getKeyChar()));
		}



	}

	public void keyPressed(KeyEvent e) {
		if (ex != null) {
			ex.extend(e, "press");
		}
	}

	public void keyReleased(KeyEvent e) {
		if (ex != null) {
			ex.extend(e, "realesed");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		c.checkClolision(e.getX(), e.getY(), true);
		c.checkClolision2(e.getX(), e.getY(), true);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		c.checkClolision2(e.getX(), e.getY(), true);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		c.checkClolision2(e.getX(), e.getY(), true);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {

		c.checkClolision(e.getX(), e.getY(), false);

	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

		Window.getFormByID(Window.getAKT_FORM_ID()).updateScroll(e.getWheelRotation());

	}

}
