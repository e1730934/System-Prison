package quiz04BilalKhendaf;

public abstract class Etablissement {
	ICoordonnee position;
	String nomEtablissement;
	float longeur, largeur, boundX,boundY;
	
	public Etablissement(ICoordonnee position, String nomEtablissement, float longeur, float largeur) {
		super();
		this.position =  position;
		this.nomEtablissement = nomEtablissement;
		this.longeur = longeur;
		this.largeur = largeur;
		this.boundX = ((CoordonneeDeuxDimension)position).x + this.largeur;
		this.boundY = ((CoordonneeDeuxDimension)position).y + this.longeur;

	}
	
	
	
}
