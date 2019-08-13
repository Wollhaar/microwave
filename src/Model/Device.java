package Model;

public class Device {
	private String name;
	private boolean tuerZu;
	private boolean roehreAn;
	private boolean lampeAn;
	
	public Device(String name){
		this.name = name;
		tuerZu = true;
		roehreAn = false;
		lampeAn = false;
	}
	
	public boolean isTuerZu() {
		return this.tuerZu;
	}
	
	public boolean isRoehreAn() {
		return this.roehreAn;
	}
	
	public boolean isLampeAn() {
		return this.lampeAn;
	}
	
	public void setTuerZu(boolean aufZu) {
		this.tuerZu = aufZu;
	}
	
	public void setRoehreAn(boolean anAus) {
		this.roehreAn = anAus;
	}
	
	public void setLampeAn(boolean anAus) {
		this.lampeAn = anAus;
	}
}
