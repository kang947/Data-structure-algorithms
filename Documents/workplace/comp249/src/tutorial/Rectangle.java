package tutorial;

public class Rectangle extends Shape {
	
	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public Rectangle(){
		height=0.0;
		width =0.0;
	}
	
	public void setHeight(double h){
		height = h;
	}
	
	public void setWidth(double w){
		width = w;
	}
	
	public double getArea(){
		return(height*width);
	}
	
	public String toString (){
		return ("Area of the Rectangle: "+getArea());
	}

}
