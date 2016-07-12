package PointVetorEx;

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x , int y){
		this.x = x;
		this.y = y;
		
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}
public class PointVector {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2, 3));
		v.add(new Point(-4, 6));
		v.add(new Point(7, -30));
		
		for(int i = 0 ; i<v.size();i++){
			Point p = v.get(i);
			System.out.println(p);
		}
	}

}
