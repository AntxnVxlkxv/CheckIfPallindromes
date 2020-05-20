
public class Person {
	String birth;
	String expirationDate;
	int placeOfLiving;
	boolean visa;
	static boolean sex;
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getPlaceOfLiving() {
		return placeOfLiving;
	}
	public void setPlaceOfLiving(int placeOfLiving) {
		this.placeOfLiving = placeOfLiving;
	}
	public boolean isVisa() {
		return visa;
	}
	public void setVisa(boolean visa) {
		this.visa = visa;
	}
	public static boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Person(String birth, String expirationDate, int placeOfLiving, boolean visa, boolean sex) {
		super();
		this.birth = birth;
		this.expirationDate = expirationDate;
		this.placeOfLiving = placeOfLiving;
		this.visa = visa;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person birth = " + birth + "\n expirationDate = " + expirationDate + "\n placeOfLiving = " + placeOfLiving
				+ "\n visa = " + visa + "\n sex = " + Person.getSex() ;
	}
	
}
