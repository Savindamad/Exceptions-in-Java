class testException{
	public void text(String name) throws NameNotFound{
		try{
			if(name.equals("savinda")){
				System.out.println("welcome");
			}
			else{
				throw new NameNotFound(name);
			}
		}
		catch(Exception e){
			System.out.println("Exception found");
			System.out.println("Exception---->"+e);
		}

	}
	public static void main(String arg[]){
		try{
			testException txt = new testException();
			txt.text("savda");
			System.out.println("test 1");
		}
		catch(Exception e){
			System.out.println("exception");
		}
	}
}