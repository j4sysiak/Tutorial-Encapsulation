
public class Plant {

	public static final int ID=19;
	private String name;
	
	public String getPublicData(){
		
		 String data = "some staff " + calculateGrowth();
		 
		 return data;
	}
	
	private int calculateGrowth(){
		return 9+ID*ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
