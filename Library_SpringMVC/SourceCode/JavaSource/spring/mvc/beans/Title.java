package spring.mvc.beans;

public class Title {
	
	private String titleValue;
	
	public Title(){
		
	}

	public Title(String titleValue) {
		super();
		this.titleValue = titleValue;
	}

	public String getTitleValue() {
		return titleValue;
	}

	public void setTitleValue(String titleValue) {
		this.titleValue = titleValue;
	}

}
