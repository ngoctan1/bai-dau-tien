package Bai_4;

import java.util.Scanner;

public class testSinhVien {
	public static void main(String[] args){
		SinhVien sv1 = new SinhVien(1,"HoangNgocTan",8,8);
		SinhVien sv2 = new SinhVien(2,"Nguyen Van A",8,8);
		SinhVien sv3 = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so cua sinh vien 3: ");
		int masv = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten cua sinh vien 3: ");
		String hoten = sc.nextLine();
		while (hoten.compareTo("") == 0){
			System.out.print("Nhap sai, vui long nhap lai ho ten cua sinh vien 3: ");
			hoten = sc.nextLine();
		}
		System.out.print("Nhap diem ly thuyet cua sinh vien 3: ");
		float diemlt = sc.nextFloat();
		System.out.print("Nhap diem thuc hanh cau sinh vien 3: ");
		float diemth = sc.nextFloat();
		sv3.setMaSV(masv);
		sv3.setHoTen(hoten);
		sv3.setDiemLT(diemlt);
		sv3.setDiemTH(diemth);
		System.out.println(String.format("%-5s %-30s %10s %10s %10s","masv","hoten","diemlt","diemth","diemtb"));
		System.out.println(sv1.ToString());
		System.out.println(sv2.ToString());
		System.out.println(sv3.ToString());
		sc.close();
	}
}
