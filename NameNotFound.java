class NameNotFound extends Exception{
	String name;
	NameNotFound(String name){
		this.name=name;
	}
	public String toString(){
		return("Name "+name+" not found");
	}
}