package exm_interface;

class Shape{
	protected int x,y;
}

interface Drawable{
	public abstract void draw();
}



public class Rectangle extends Shape implements Drawable{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
		
	}
	

}
