package warGame;

public class Card {
 
	
	public int value;
	public String name;
 
 
 
 
public void describe() {
	try {
		System.out.println(value + name);
	} catch (Exception e) {
		// TODO Auto-generated catch block
	}
}
 
 
 
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
}
