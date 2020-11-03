package covid_19;

import java.util.Date;

public class Etudiant extends Utilisateur{

	private String numeroEtudiant;

	
	public Etudiant(String nom, String prenom, String email, String numeroTel, Date date,
			String identifiant, String motDePass, String numeroEtudiant) {
		super(nom, prenom, email, numeroTel, date, identifiant, motDePass);
		this.numeroEtudiant= numeroEtudiant;
	
	}
	
	
		

	
	
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(String num) {
		this.numeroEtudiant =num;
	}
	
}
