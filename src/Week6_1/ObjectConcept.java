package Week6_1;

public class ObjectConcept {

	String string;
	public ObjectConcept(String aString){
		string=aString;
	}
	String getString(){
		return string;
	}
	
	
	public static void main(String[] args) {
		
		    ObjectConcept reference;
		    
			reference=new ObjectConcept("java 11");
		System.out.println(reference.getString());
		//System.out.println(reference.string);
		
		


// Anonymous Object
//why we need anonymous object:if we want to use the object only one time ,we can create
		
		
		System.out.println(new ObjectConcept("java 8"  ).getString());
		
		
	}

}
