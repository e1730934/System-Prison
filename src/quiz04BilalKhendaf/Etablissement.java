package quiz04BilalKhendaf;

public abstract class Etablissement {
	Coordonnee position;
	String nomEtablissement;
	float longeur, largeur;
	
	public Etablissement(Coordonnee position, String nomEtablissement, float longeur, float largeur) {
		super();
		this.position = position;
		this.nomEtablissement = nomEtablissement;
		this.longeur = longeur;
		this.largeur = largeur;
	}
	
	
	
}
