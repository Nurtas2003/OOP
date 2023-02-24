package Problem3;

public abstract class Piece {
	private Position p;
	private char fig;
	public Piece(Position p, char fig){
		this.p=p;
		this.fig=fig;
	}
	
	public Position getPos() {
		return this.p;
	}
	
	public char getFig() {
		return this.fig;
	}
	
	public void move(Position b) {
		if(this.isLegalMove(b))this.p=b;
		else System.out.println("ERROR");
	}
	
	public boolean checkBounds(Position b) {
		if(((int)(b.c)<'A' || (int)(b.c)>'H') || (b.pos<1 || b.pos>8)) {
			System.out.println("ERROR");
			return false;
		}
		return true;
	}
	
	public abstract boolean isLegalMove(Position b);
	
	public String toString() {
		return this.fig + " ";
	}
}
