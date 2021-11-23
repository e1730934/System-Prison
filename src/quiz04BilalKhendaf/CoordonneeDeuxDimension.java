package quiz04BilalKhendaf;

public class CoordonneeDeuxDimension extends ICoordonnee {
    Float x, y;

    public CoordonneeDeuxDimension(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[X:" + x + ", Y:" + y + "]";
    }


}
