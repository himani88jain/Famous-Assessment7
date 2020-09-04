package co.grandcircus.Famouslab;

import java.util.List;

public class Famous {

	private List<Tiny> tiny;
	private List<Complete> complete;
	public List<Tiny> getTiny() {
		return tiny;
	}
	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}
	public List<Complete> getComplete() {
		return complete;
	}
	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
	@Override
	public String toString() {
		return "Famous [tiny=" + tiny + ", complete=" + complete + "]";
	}
	
	
}
