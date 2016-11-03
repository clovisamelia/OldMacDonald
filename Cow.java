//class Cow //implements Animal 
//{     
    //Cow c = new Cow("cow", "moo");   
  //  System.out.println(c.getType() + " goes " + c.getSound());  }  
//}
    
   class Cow implements Animal {     
     protected String myType;     
     protected String mySound;     
     public Cow(String type, String sound){         
         myType = type;         
         mySound = sound;     
     }     
     public Cow()     {         
         myType = "unknown";         
         mySound = "unknown";  
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
	}  //your code here

