package quiz04BilalKhendaf;

public class Test {
	public static void main(String[] args){
			
		CoordonneeDeuxDimension zerozero = new CoordonneeDeuxDimension(0f,0f);
		CoordonneeDeuxDimension unun = new CoordonneeDeuxDimension(1f,1f);
		CoordonneeDeuxDimension centUnCentUn = new CoordonneeDeuxDimension(101f,101f);
		CoordonneeDeuxDimension cinquanteCinquante = new CoordonneeDeuxDimension(50f,50f);
		Prison foxRiver = new Prison(zerozero, "Fox River", 100, 100);
		
		Policier police = new Policier("Policer1",1);
		Gendarme gendarme = new Gendarme("Gendarme1",1);
		
		
		Prisonnier michaelScofield = new Prisonnier(unun, "Scofield ", "Michael", foxRiver);
		
		michaelScofield.inscrire(police);
		michaelScofield.inscrire(gendarme);
		
		michaelScofield.changementPosition(centUnCentUn);
		michaelScofield.desinscrire(police);
		michaelScofield.changementPosition(cinquanteCinquante);
		
		 
		
		 
	}
}
