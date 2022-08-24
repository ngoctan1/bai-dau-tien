package Bai_6;

public class testVehicle {
	public static void main(String[] args){
		Vehicle xe1 = new Vehicle("Nguyen Thu Loan","Future Neo",100,35000000);
		Vehicle xe2 = new Vehicle("Le Minh Tinh","Ford Ranger",3000,250000000);
		Vehicle xe3 = new Vehicle("Nguyen Minh Triet","Lanscape",1500,1000000000);
		System.out.printf("%-20s %-12s %11s %13s %14s\n","Ten chu xe","Loai xe","Dung Tich","Tri Gia","Thue phai nop");
		for (int i=0;i<74;i++)
		{
			System.out.printf("%s","=");
		}
		System.out.print(xe1.ToString());
		System.out.print(xe2.ToString());
		System.out.print(xe3.ToString());
	}
}