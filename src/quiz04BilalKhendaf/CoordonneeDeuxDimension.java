package quiz04BilalKhendaf;

public class CoordonneeDeuxDimension extends ICoordonnee {
	

	public CoordonneeDeuxDimension(Float x, Float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[X:" + x + ", Y:" + y + "]";
	}
	
	
}
