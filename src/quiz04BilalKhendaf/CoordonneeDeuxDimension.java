package quiz04BilalKhendaf;

public class CoordonneeDeuxDimension extends Coordonnee {
	

	public CoordonneeDeuxDimension(Float x, Float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Position [X:" + x + ", Y:" + y + "]";
	}
	
	
}
