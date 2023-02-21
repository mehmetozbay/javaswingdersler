package ders7;

public class User {

	private int id;
	private static int nextID=0;
	private String ad;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}
	public User(String ad) {
		super();
		this.id=++nextID;
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getNextID() {
		return nextID;
	}
	public static void setNextID(int nextID) {
		User.nextID = nextID;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", ad=" + ad + "]";
	}
	
	
}
