package Model.BEAN;

public class VacXin {
	private String Mavacxin;
	private String tenvacxin;
	private String somui;
	private String mota;
	private String gia;
	private String tensx;

	public String getmvc () {
		return Mavacxin;}
	public void setmvc (String mavacxin) {
		this.Mavacxin = mavacxin;
	}
	public String getten () { 
		return tenvacxin; }
	
	public void setten (String ten) {
		this.tenvacxin = ten;
	}public String getmota () { 
		return mota; }
	
	public void setmota (String mota) {
		this.mota = mota;
	}
	
	public String getmui () {
		return somui;}
	public void setmui (String mui) {
		this.somui = mui;
	}
	public String getgia () { 
		return gia ; }
	
	public void setgia (String giaFloat) {
		this.gia = gia;
	}
	public String gethang () { 
		return tensx ; }
	
	public void sethag (String hang) {
		this.tensx = hang;
	}
}
