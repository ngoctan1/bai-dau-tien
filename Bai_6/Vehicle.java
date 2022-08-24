package Bai_6;

public class Vehicle {
	private String TenChuXe;
	private String LoaiXe;
	private float TriGia;
	private int DungTich;
	
	public String getTenChuXe() {
		return TenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		this.TenChuXe = tenChuXe;
	}
	public String getLoaiXe() {
		return LoaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.LoaiXe = loaiXe;
	}
	public float getTriGia() {
		return TriGia;
	}
	public void setTriGia(float triGia) {
		if (triGia > 0){
			this.TriGia = triGia;
		}
		else{
			this.TriGia = 0;
		}
	}
	
	public int getDungTich() {
		return DungTich;
	}
	
	public void setDungTich(int dungTich) {
		if (dungTich > 0){
			this.DungTich = dungTich;
		}
		else{
			this.DungTich = 0;
		}
	}
	public double Thue() {
		if (DungTich < 100){
			return TriGia * 0.01;
		}
		else{
			if (DungTich <= 200){
				return TriGia * 0.03;
			}
			else{
				return TriGia * 0.05;
			}
		}
	}
	
	public Vehicle(){
	}
	
	public Vehicle(String TenChuXe, String LoaiXe,int DungTich,float TriGia){
		this.TenChuXe = TenChuXe;
		this.LoaiXe = LoaiXe;
		this.DungTich = DungTich;
		this.TriGia = TriGia;
	}
	
	public String ToString(){
		return (String.format("\n%-20s %-12s %11d %13.2f %14.2f",TenChuXe,LoaiXe,DungTich,TriGia,Thue()));
	}
}
