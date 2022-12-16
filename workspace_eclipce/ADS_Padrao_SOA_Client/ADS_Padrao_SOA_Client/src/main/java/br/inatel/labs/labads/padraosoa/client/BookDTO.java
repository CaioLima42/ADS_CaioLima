package br.inatel.labs.labads.padraosoa.client;

public class BookDTO {
	private Long id;
	private String title;
	private String catagory;
	public Long getId() {
		return id;
	}
	
	//getters and setters
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	
	//ToString
	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", catagory=" + catagory + "]";
	}
	
	

}
