package Bai_3;

import java.lang.Math;

public class Cylinder{
	private double BanKinh;
	private double ChieuCao;

	public double getBanKinh() {
		return BanKinh;
	}

	public void setBanKinh(double banKinh) {
		BanKinh = banKinh;
	}

	public double getChieuCao() {
		return ChieuCao;
	}

	public void setChieuCao(double chieuCao) {
		ChieuCao = chieuCao;
	}

	public Cylinder() {
		super();
	}

	public Cylinder(double banKinh, double chieuCao) {
		super();
		BanKinh = banKinh;
		ChieuCao = chieuCao;
	}
	
	public double sXungQuanh(){
		return (2 * Math.PI * BanKinh * ChieuCao );
	}
	
	public double sToanPhan() {
		return (2 * Math.PI * BanKinh*(BanKinh + ChieuCao));
	}
	
	public double TheTich() {
		return (Math.PI * BanKinh * BanKinh * ChieuCao);
	}

	public String toString() {
		return String.format("Dien tich xung quanh la: %.2f\nDien tich toan phan la: %.2f\nThe tich la: %.2f\n",sXungQuanh(),sToanPhan(),TheTich());
	}
}