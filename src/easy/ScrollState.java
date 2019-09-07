package easy;

public class ScrollState {
	private int state = 0;
	private int max = 0;
	private int scrollmultiplyer = 1;
	public void addm(int i) {
		this.state = this.state + i;
	}
	public int getState() {
		return state * scrollmultiplyer;
	}
	public int rawState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	public ScrollState(int max) {
		this.max = max;
	}
	public int getScrollmultiplyer() {
		return scrollmultiplyer;
	}
	public void setScrollmultiplyer(int scrollmultiplyer) {
		this.scrollmultiplyer = scrollmultiplyer;
	}
	
	
}
