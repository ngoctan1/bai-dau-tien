package Bai_5;

import java.lang.Math;

public class TamGiac 
{
	private float ma;
	private float mb;
	private float mc;
	
	public float getMa() {
		return ma;
	}
	
	public void setMa(float ma) {
		if (ma > 0)
		this.ma = ma;
	}
	
	public float getMb() 
	{
		return mb;
	}
	public void setMb(float mb) {
		if (mb > 0)
		this.mb = mb;
	}
	
	public float getMc() {
		return mc;
	}
	
	public void setMc(float mc) {
		if (mc > 0)
		this.mc = mc;
	}
	
	public TamGiac() {
	}
	
	public TamGiac(float ma, float mb, float mc) {
		if ((ma <= 0 || mb <=0 || mc <= 0) || (ma + mb <= mc || mb + mc <= ma || ma + mc <= mb)){
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
		else{
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}
	
	public float ChuVi(){
		return (ma + mb + mc);
	}
	
	public double DienTich(){
		float p = (ma + mb + mc) / 2;
		return (Math.sqrt((p - ma)*(p - mb) * (p - mc)));
	}
	
	public String KieuTamGiac(){
		if (ma + mb <= mc || ma + mc <= mb || mb + mc <= ma){
			return String.format("%s","Khong phai tam giac");
		}
		else {
			if (ma == mb && mb == mc && mc == ma) {
				return String.format("%s","Tam giac deu");
			}
			else {
				if (ma == mb || mb == mc || ma == mc){
					return String.format("%s", "Tam giac can");
				}
				else{
					if ((ma*ma + mb * mb == mc *mc) || (mb * mb + mc * mc == ma*ma) || (ma * ma + mc * mc == mb * mb)){
						return String.format("%s","Tam giac vuong");
					}
					else{
						if (((ma*ma + mb * mb == mc *mc) || (mb * mb + mc * mc == ma*ma) || (ma * ma + mc * mc == mb * mb)) && (ma == mb || mb == mc || ma == mc)){
							return String.format("%s","Tam giac vuong can");
						}
						else{
							return String.format("%s","Tam giac thuong");
						}
					}
				}
			}
		}
	}
	
	public String ToString(){
		return String.format("\n%4.1f %4.1f %4.1f    %-20s %9.2f %10.2f",ma,mb,mc,KieuTamGiac(),ChuVi(),DienTich());
	}
}
