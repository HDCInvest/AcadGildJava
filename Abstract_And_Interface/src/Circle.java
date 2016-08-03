
public class Circle implements Shape {
	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle ......");
		
	}

	@Override
	public double getArea() {
		
		return ( Math.PI * radius*radius);
	}
	
	
}
