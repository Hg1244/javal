package WEEK6;

import java.time.LocalDateTime;
enum Berth{
	UPPER,
	LOWER,
	MIDDLE;
}

public class passenger {
	private int pid;
	private String passengerName;
	private Berth prefberth;
	private Berth allocatedberth;
	private LocalDateTime bkdt;
	private int bkdWlLimit;
	private int currentlimit;

	
	
	public int getCurrentlimit() {
		return currentlimit;
	}
	public void setCurrentlimit(int currentlimit) {
		this.currentlimit = currentlimit;
	}
	public int getBkdWlLimit() {
		return bkdWlLimit;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Berth getPrefberth() {
		return prefberth;
	}
	public void setPrefberth(Berth prefberth) {
		this.prefberth = prefberth;
	}
	public Berth getAllocatedberth() {
		return allocatedberth;
	}
	public void setAllocatedberth(Berth allocatedberth) {
		this.allocatedberth = allocatedberth;
	}
	public LocalDateTime getBkdt() {
		return bkdt;
	}
	public void setBkdt(LocalDateTime bkdt) {
		this.bkdt = bkdt;
	}
	@Override
	public String toString() {
		return "passenger [pid=" + pid + ", passengerName=" + passengerName + ", prefberth=" + prefberth
				+ ", allocatedberth=" + allocatedberth + ", bkdt=" + bkdt + "]";
	}
	public void setBkdWlLimit(int wlLimit) {
		
		
	}
	public String getBKdwlimit() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCurrentwlLimi() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object setCurrentwlLimit(int wlLimit) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(String pname) {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}