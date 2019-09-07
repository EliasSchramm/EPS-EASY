package button_scripts;

import easy.OnClick;
import easy.Form;
import easy.Window;

public class ChangeForm implements OnClick{
	
	private String target;
	
	public ChangeForm(String t) {
		this.target = t;
	}
	public ChangeForm(Form t) {
		this.target = t.getID();
	}

	@Override
	public void OnClick() {
		
		Window.setAKT_FORM_ID(target);
		
	}
	
}
