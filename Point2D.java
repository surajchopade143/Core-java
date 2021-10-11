package basics;

public class Point2D {

	private int x,y;
	Point2D(){
		x=10;
		y=20;
	}
	Point2D(int a, int b){
		x=a;
		y=b;
	}
	public String getDeatails() {
		return "Point ("+x+","+y+")";
	}

	/*
	  boolean isEqual(Point2D point) { if(point==p1) { re } }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1=new Point2D();
		Point2D p2=new Point2D(40,50);
		System.out.println(p1.getDeatails());
		System.out.println(p2.getDeatails());
	}

}
