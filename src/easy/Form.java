package easy;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Form {

	private String ID;
	private Color Background_Color = Color.LIGHT_GRAY;
	private Image Background_Image;
	private ScrollState ScrollState = new ScrollState(0);

	/*private Text[] Text = new Text[9999];
	private Image[] Image = new Image[9999];
	private Button[] Button = new Button[9999];
	private TextField[] TextField = new TextField[9999];
	
	*/
	
	private List<Text> Text = new ArrayList<Text>();
	private List<Image> Image = new ArrayList<Image>();
	private List<Button> Button = new ArrayList<Button>();
	private List<TextField> textField = new ArrayList<TextField>();
	private List<InputField> InputField = new ArrayList<InputField>();
	
	public void setScrollMultiplyer(int i) {
		this.ScrollState.setScrollmultiplyer(i);
	}
	/**
	 * Systemmethod
	 * 
	 * @param i
	 */
	public void updateScroll(int i) {
		
		ScrollState.addm(i);
		
		int j = ScrollState.rawState();
		
		if(j * ScrollState.getScrollmultiplyer() < 0) {
			j = 0;
		}
		
		if(j * ScrollState.getScrollmultiplyer() > ScrollState.getMax()) {
			j = ScrollState.getMax() / ScrollState.getScrollmultiplyer();
		}
		
		
		ScrollState.setState(j);
		
		for (Text text : Text) {
			if(text.getCanScroll()) {
				text.setScroll(ScrollState.getState());
			}
		}
		for (Image image : Image) {
			if(image.getCanScroll()) {
				image.setScroll(ScrollState.getState());
			}			
		}
		for (Button button : Button) {
			if(button.getCanScroll()) {
				button.setScroll(ScrollState.getState());
			}
		}
		for (TextField textfield : textField) {
			if (textfield.getCanScroll()) {
				textfield.setScroll(ScrollState.getState());
				
			}
		}
		for (InputField inputfield : InputField) {
			if(inputfield.getCanScroll()) {
				
				inputfield.setScroll(ScrollState.getState());
				System.out.println(inputfield.getScroll());
				
			}
		}
	}
	
	/**
	 * Returns the ScrollState class of this form.
	 * 
	 * @return ScrollState
	 */
	
	public ScrollState getScrollState() {
		return ScrollState;
	}
	
	/**
	 * Set the ScrollState of this form.
	 * 
	 * @param scrollState
	 */
	
	public void setScrollState(ScrollState scrollState) {
		ScrollState = scrollState;
	}
	
	/**
	 * Set the max scrollheight of this form.
	 * 
	 * @param max
	 */
	
	public void setMaxScroll(int max) {
		this.ScrollState.setMax(max);
	}
	
	
	/**
	 * Add an InputField to this form.
	 * 
	 * @param i InputField
	 */
	public void add(InputField i) {
		this.InputField.add(i);
	}
	
	/**
	 * Returns a list of all InputFields of this form.
	 * 
	 * @return List<InputField>
	 */
	
	public List<InputField> getInputField() {
		return InputField;
	}

	/**
	 * Set the InputField list of this form.
	 * 
	 * @param inputField List<InputField>
	 */
	
	public void setInputField(List<InputField> inputField) {
		InputField = inputField;
	}

	/**
	 * Returns the TextField List of this form.
	 * 
	 * @return List<TextField>
	 */

	public List<TextField> getTextField() {
		return textField;
	}

	/**
	 * Add a Button to this form.
	 * 
	 * @param Button
	 */

	public void add(Button Button) {

		this.Button.add(Button);

	}
	
	/**
	 * Add a TextField to this form.
	 * 
	 * @param TextField
	 */
	
	public void add(TextField TextField) {

		this.textField.add(TextField);

	}
	
	/**
	 * Returns a List of all Buttons in this form.
	 * 	
	 * @return List<Button>
	 */
	public List<Button> getButton() {
		return Button;
	}
	
	/**
	 * Returns a List of all Images in this form.
	 * 
	 * @return List<Image>
	 */

	public List<Image> getImage() {
		return Image;
	}

	/**
	 * Set the Background Image of this form.
	 * 
	 * @param background_Image
	 */

	public void setBackground_Image(Image background_Image) {
		Background_Image = background_Image;
	}
	
	/**
	 * Add a Image to this form.
	 * 
	 * @param Image
	 */
	
	public void add(Image Image) {
		
	
		this.Image.add(Image);

	}
	
	/**
	 * Add a Text to this form.
	 * 
	 * @param Text
	 */
	
	public void add(Text Text) {

		this.Text.add(Text);
	}
	
	/**
	 * Returns a list of all Text in this form.
	 * 
	 * @return List<Text>
	 */
	
	public List<Text> getText() {
		return this.Text;
	}

	
	/**
	 * Returns the background image of this form.
	 * 
	 * @return Image
	 */
	
	public Image getBackground_Image() {
		return this.Background_Image;
	}
	
	/**
	 * Set the Background Image of this form.	 
	 * 
	 * @param PATH String
	 */
	
	public void setBackground_Image(String PATH) {
		this.Background_Image = new Image(PATH, "sds");
	}
	
	/**
	 * A form.
	 * 
	 * @param id
	 */
	public Form(String id) {
		this.ID = id;
	}
	
	/**
	 * Returns the ID of this form.
	 * 
	 * @return
	 */
	
	public String getID() {
		return this.ID;
	}
	
	/**
	 * 	Set the ID of this form.
	 * 
	 *	@param iD
	 */
	
	public void setID(String iD) {
		this.ID = iD;
	}
	
	/**
	 * Returns the backgroundcolor of this form. 
	 * 
	 * @return
	 */
	
	public Color getBackground_Color() {
		return this.Background_Color;
	}

	/**
	 * Set the backgroundcolor of this form.
	 * 
	 * @param background_Color
	 */
	
	public void setBackground_Color(Color background_Color) {
		this.Background_Color = background_Color;
	}

}
