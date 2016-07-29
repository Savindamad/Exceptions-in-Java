import java.util.*;

class testException{

 	public void setAge(float age) throws ExceptionInteger{
 		if(this.exceptionControl(age)){
 			throw new ExceptionInteger();
 		}
 		else{
 			System.out.println("Your age is "+(int)age);
 		}
 	}
 	public Boolean exceptionControl(float age){
 		float a=age%1.0f;
 		if(0<a && a<1){
 			return true;
 		}
 		else{
 			return false;
 		}
 	}
 	public float getAge(){
 			Scanner num = new Scanner(System.in);
			System.out.print("Enter your age : ");
			float f = Float.parseFloat(num.next());
			num.close();
			return f;
 	}
	public static void main(String arg[]){
		try{
			testException txt = new testException();
			txt.setAge(txt.getAge());	
		}
		catch(Exception e){
			System.out.println(e);
		}
		/*finally{

		}*/
		
	}
}