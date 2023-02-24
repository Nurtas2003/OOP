
public class StarTriangle {
	public int width;
	public String line;
	
	StarTriangle(int width){
		this.width=width;
		this.line="";
	}
	
	public String toString() {
		for(int i=0; i<width; i++) {
			for(int j=0; j<=i; j++) {
				line+="[*]";
			}
			line+='\n';
		}
		return line;
	}
}
