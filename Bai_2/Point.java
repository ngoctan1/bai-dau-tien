package Bai_2;

import java.lang.Math;

public class Point {
	private String ten;
	private float x;
	private float y;
	private float z;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public Point() {
		super();
	}
	public Point(String ten, float x, float y, float z) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String negate(){
		return String.format("%s(%.1f;%.1f;%.1f)","B",-x,-y,-z);
	}
	
	public double getDistance(){
		return Math.sqrt(x*x + y*y + z*z);
	}
	@Override
	public String toString() {
		return ten + "(" + x + ";" + y + ";" + z + ")"+ "\nKhoang cach den goc toc do: " + getDistance();
	}
	
}