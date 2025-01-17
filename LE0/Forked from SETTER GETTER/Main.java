/******************************************************************************

SATTAR GATTAR CLASSES 
set name function 2
get name function 2
*******************************************************************************/
class Useless
{    
    String  naam ;
    int     umar ;
    
	void setname(String naam) {
		this.naam = naam;
	}
	void setage(int umar){
	    this.umar = umar;
	}
	String getname(){
	    return naam;
	}
	int getage(){
	    return umar;
	}
}

public class Main{
    public static void main(String[] args){
        Useless person1 = new Useless();
        Useless person2 = new Useless();
        
        person1.setname("Om");
        person2.setname("mishra");
        person1.setage(21);
        person2.setage(21);
        
        System.out.println(person1.getname());
        System.out.println(person1.getage());
        System.out.println(person2.getname());
        System.out.println(person2.getage());
    }
}