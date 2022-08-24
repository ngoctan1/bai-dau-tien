package Bai_1;

public class ToaDo{
	private float x;
	private float y;
	private String name;
	
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
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ToaDo(){
	}
	
	public ToaDo(float x,float y,String Name){
		this.x = x;
		this.y = y;
		this.name = Name;
	}
	public String toString() {
		return (name + "(" + x+ "," + y + ")");
	}
}