
public class Rectangle implements Shape{
	private float ht,width;
	
	public Rectangle(float ht, float width) {
		this.ht = ht;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle ......");
		
	}

	@Override
	public double getArea() {
		
		return ( ht*width);
	}

}
