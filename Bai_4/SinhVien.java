package Bai_4;

public class SinhVien{
	private int MaSV;
	private String HoTen;
	private float DiemLT;
	private float DiemTH;

	public int getMaSV() {
		return MaSV;
	}
	
	public void setMaSV(int maSV) {
		if (maSV < 0) {
			this.MaSV = 0;
		}
		else {
			this.MaSV = maSV;
		}
	}


	public String getHoTen() {
		return HoTen;
	}


	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	}


	public float getDiemLT() {
		return DiemLT;
	}


	public void setDiemLT(float DiemLT) {
		if (DiemLT >= 0 && DiemLT <= 10){
			this.DiemLT = DiemLT;
		}
		else{
			this.DiemLT = 0;
		}
	}


	public float getDiemTH(){
		return DiemTH;
	}


	public void setDiemTH(float DiemTH){
		if (DiemTH >= 0 && DiemTH <= 10){
			this.DiemTH = DiemTH;
		}
		else {
			this.DiemTH = 0;
		}
	}


	public SinhVien(){
		this(0," ",0,0);
	}
	
	public float getDTB(){
		return (DiemLT + DiemTH)/2;
	}
	
	public String ToString(){
		return String.format("%-5d %-30s %10.2f %10.2f %10.2f",MaSV,HoTen,DiemLT,DiemTH,getDTB());
	}
	
	public SinhVien(int maSV,String HoTen,float DiemLT,float DiemTH){
		setMaSV(maSV);
		setHoTen(HoTen);
		setDiemLT(DiemLT);
		setDiemTH(DiemTH);
	}
	
	
}