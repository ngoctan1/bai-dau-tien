package Bai_5;

public class testTamGiac{
	public static void main(String[] args){
		TamGiac TG1 = new TamGiac(-1,-2,3);
		TamGiac TG2 = new TamGiac(2,2,4);
		TamGiac TG3 = new TamGiac(5,6,7);
		TamGiac TG4 = new TamGiac(4,4,3);
		TamGiac TG5 = new TamGiac(3,4,5);
		System.out.print(String.format("%4s %4s %4s    %-19s %10s %10s","ma","mb","mc","KieuTamGiac","ChuVi","DienTich"));
		System.out.print(TG1.ToString());
		System.out.print(TG2.ToString());
		System.out.print(TG3.ToString());
		System.out.print(TG4.ToString());
		System.out.print(TG5.ToString());
	}
}
