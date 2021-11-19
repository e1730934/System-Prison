package quiz04BilalKhendaf;

public abstract class Etablissement {
	Coordonnee position;
	String nomEtablissement;
	float longeur, largeur, boundX,boundY;
	
	public Etablissement(Coordonnee position, String nomEtablissement, float longeur, float largeur) {
		super();
		this.position = position;
		this.nomEtablissement = nomEtablissement;
		this.longeur = longeur;
		this.largeur = largeur;
		this.boundX = this.position.x + this.largeur;
		this.boundY = this.position.y + this.longeur;

	}
	
	
	
}
