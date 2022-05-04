package mycontainers;

public class Node {
	String value;
	Node left,right;
	
	public String get() {
		return value;
	}
	
	public String getValue() {
		return value;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setValue(String newValue) {
		value=newValue;
	}
	
	public Node(String s){
		value = s;
		left = right = null;
	}
	
	public String toString() {
		String s= "Nodo "+ value;
		/*if(left==null) {
			s+="-"; 
		}else {
			s+="+";
		}
		*/
		s+=(right==null ? "/-":"/+");
		s+=(left==null ? "/-":"/+");
		s+="\n";
		
		return s;
	}
}
