package assignment;

public final class Immutable1
{
	
	    final String name; 
	    final int regNo; 
	  
	    public Immutable1(String name, int regNo) 
	    { 
	        this.name = name; 
	        this.regNo = regNo; 
	    }
	    public void setname(String name, int regNo)
	    {

	        this.name = name; 
	        this.regNo = regNo;
	    }
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public int getRegNo() 
	    { 
	        return regNo; 
	    } 

	 
	    public static void main(String args[]) 
	    { 
	    	Immutable1 s = new Immutable1("ABC", 101); 
	        System.out.println(s.getName()); 
	        System.out.println(s.getRegNo()); 
	  s.setname("bb",104);
	    } 

}