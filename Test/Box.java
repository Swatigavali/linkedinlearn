
public class Box {

	double height,width,depth;
	public Box() {//WITHOUT ARG CONSTRUCTOR
		height=10;
		width=20;
		depth=30;
	}
//made changes in test branch file
//constustor
	public Box (double ht,double wt,double dpt) {//WITH ARG PASSING VALUES
		height=ht;
		width=wt;
		depth=dpt;
	}
	public void calcvolum() {
		double volume=height * width * depth;
		System.out.println("Volum of the box is :" + volume);
	}
	public static void main (String args[]) {
		Box box1,box2,box3;//
		box1 =new Box();
		box2= new Box(100,200,300);
		box3=new Box(123,12,124);
		box1.calcvolum();
		box2.calcvolum();
		box3.calcvolum();

	}
}

