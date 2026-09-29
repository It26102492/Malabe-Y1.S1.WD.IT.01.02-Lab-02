public class  IT26102492Lab2Q1 
{
   public static void main(String[] args)
   {
   
     double length,width;
	 double width_ratio=0.75;
	 int perimeter= 100;  
	    
   length= perimeter/ (2* (1+ width_ratio));
   width= width_ratio*length; 
	 
      System.out.println("Width of the fence is :" + width) ; 
	  System.out.println("Length of the fence is :" + length) ; 
   }
}