package Problem3;

public class Position {
	public char c;
	public int pos;
	
	Position(){
		
	}
	
	Position(char c, int pos){
		this.c=c;
		this.pos=pos;
	}
	
	public String toString() {
		return this.c+" " + this.pos;
	}
}
