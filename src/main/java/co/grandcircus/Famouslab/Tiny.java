package co.grandcircus.Famouslab;

public class Tiny {
	
	private String name;
	private String invented;
	private Long year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Tiny [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}
	
	
}
