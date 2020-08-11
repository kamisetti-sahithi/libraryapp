package org.dxctraining.entities;



public class Author {
	private String id;
	private String name;
	public Author(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
    public int hashCode() {
		int hash=id.hashCode();
		return hash;
		
		
	}
	
	
	@Override
	
	  public boolean equals(Object argument) {
		if(this==argument)
		{
			return true;
		}
		if(argument==null ||!(argument instanceof Author)) {
			return false;
		}
		Author that=(Author)argument;
		boolean equals=this.id.equals(that.id);
		return equals;
		

		
		

	}
	

}
