package quiz04BilalKhendaf;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
			
		CoordonneeDeuxDimension zerozero = new CoordonneeDeuxDimension(0f,0f);
		CoordonneeDeuxDimension unun = new CoordonneeDeuxDimension(1f,1f);
		CoordonneeDeuxDimension centUnCentUn = new CoordonneeDeuxDimension(101f,101f);
		CoordonneeDeuxDimension cinquanteCinquante = new CoordonneeDeuxDimension(50f,50f);
		Prison foxRiver = new Prison(zerozero, "Fox River", 100, 100);
		
		Policier police = new Policier(1);
		Gendarme gendarme = new Gendarme(1);

		logTxt writeTxt = new logTxt();

		Prisonnier michaelScofield = new Prisonnier(unun, "Scofield ", "Michael", foxRiver,writeTxt);
		
		michaelScofield.inscrire(police);
		michaelScofield.inscrire(gendarme);
		
		michaelScofield.changementPosition(centUnCentUn);
		michaelScofield.desinscrire(police);
		michaelScofield.changementPosition(cinquanteCinquante);
		
		 
		
		 
	}
}
