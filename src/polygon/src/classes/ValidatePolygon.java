package polygon.src.classes;
import java.util.*;

public class ValidatePolygon {
	
	//define the size of the polygon
	public int N=3;//triangle case
	
	public ValidatePolygon() {
		// TODO Auto-generated constructor stub				
		
	}	
	
	public List readSizes() {
		Scanner scanner = new Scanner(System.in);
		List<Float> sides = new ArrayList<Float>(); 
		Float input;
		
		for(int i=1;i<=N;i++) {					
		 	try {
				 System.out.println("Insert the lenght of the "+i+" size:");					 
				 input=Float.parseFloat(scanner.next());					 
				 
				 if(input<0) {
					System.err.println("A lenght by definition must be at least equal to 0. Please try again!");						
					i--;				        	
				 }else {
			       	sides.add(input);  	     				       	
			     }
			 } catch (NumberFormatException | NullPointerException nfe) {
			   	System.err.println("Please insert a numeric value!");				    	
			    i--;
			 }
		}		
	    scanner.close();
	    
	 return sides;	    
	}
	
	public boolean validateTriangleConidition(List<Float> sides) {
		//Sort list
		Collections.sort(sides); 
		
	    //Check if the sides can form a triangle
		if((sides.get(0)+sides.get(1)) > sides.get(2))
			return true;
		
	return false;
		
	}
	
	public String polygonType(){
		List<Float> sidesLengths = readSizes();    
			
		if(N==3) {
		    if(validateTriangleConidition(sidesLengths)){
		   
		       //Map occurences of the sides lengths
			   HashMap<Float, Float> occurences = new HashMap<>();
			   
			   for (int i = 0; i < sidesLengths.size(); i++) {			   
				    occurences.put(sidesLengths.get(i), occurences.get(i) == null ? 1 : occurences.get(i) + 1);
			   }		    
			   int size = occurences.size();
			   
			   switch(size){
			   
				   case 1:
					   return ("Equilateral");
					   
				   case 2:
					   return ("Isocoles");
					   
				   case 3:
					   return ("Scalene");
					  
			   }		    
			   
			} 
		 
		 return("NOT A TRIANGLE");	
		  
		}
		return ("Your polygon could not be determined");
	}
	
	public String polygonType(List<Float> sidesLengths){
	
		if(N==3) {
		    if(validateTriangleConidition(sidesLengths)){
		   
		       //Map occurences of the sides lengths
			   HashMap<Float, Float> occurences = new HashMap<>();
			   
			   for (int i = 0; i < sidesLengths.size(); i++) {			   
				    occurences.put(sidesLengths.get(i), occurences.get(i) == null ? 1 : occurences.get(i) + 1);
			   }		    
			   int size = occurences.size();
			   
			   switch(size){
			   
				   case 1:
					   return ("Equilateral");
					   
				   case 2:
					   return ("Isocoles");
					   
				   case 3:
					   return ("Scalene");
					  
			   }		    
			   
			} 
		 
		 return("NOT A TRIANGLE");	
		  
		}
		return ("Your polygon could not be determined");
	}	
		
	public static void main(String[] args) {				
		ValidatePolygon validate=new ValidatePolygon();
			System.out.println(validate.polygonType());
	}

}
