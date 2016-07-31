
public class Assignment1 {
	public int length;
	public int width;
	public Assignment1(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public float rectArea() {
		return (length * width);
	}
	
	public float triArea() {
		return (float) (.5 * length * width);
	}
	
}
