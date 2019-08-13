package Controller;
import Model.Device;

public class deviceController {
	private Device device;
	
	public void deviceController(){
		this.device = new Device("microwave");
	}
	
	public boolean startDevice(){
		this.device.setTuerZu(true);
		this.device.setLampeAn(true);
		this.device.setRoehreAn(true);
		
		return true;
	}
	
	public boolean schlieﬂen() {
		this.device.setTuerZu(true);
		this.device.setLampeAn(false);
		this.device.setRoehreAn(false);
		
		return true;
	}
	
	public boolean oeffnen() {
		this.device.setTuerZu(false);
		this.device.setLampeAn(true);
		this.device.setRoehreAn(false);
		
		return true;
	}
	
	public boolean endeProgramm() {
		this.device.setTuerZu(true);
		this.device.setLampeAn(true);
		this.device.setRoehreAn(true);
		
		return true;
	}
}
