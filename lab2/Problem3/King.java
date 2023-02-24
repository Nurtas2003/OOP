package Problem3;

public class King extends Piece {
	King(Position p, char fig){
		super(p ,fig);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.checkBounds(b)) return false;
		if(Math.abs((int)this.getPos().c-(int)(b.c))==0 && Math.abs(this.getPos().pos-b.pos)==1) return true;
		else if(Math.abs((int)this.getPos().c-(int)(b.c))==1 && Math.abs(this.getPos().pos-b.pos)==0) return true;
		else if(Math.abs((int)this.getPos().c-(int)(b.c))==1 && Math.abs(this.getPos().pos-b.pos)==1) return true;
		return false;
	}
	
}
