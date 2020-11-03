package covid_19;

import java.util.Date;

public class Utilisateur extends Personne{
	
	private String identifiant, motDePass;
	/**
	 * Constructeur de la classe Utilisateur;
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param numeroTel
	 * @param date
	 * @param identifiant
	 * @param motDePass
	 */
	public Utilisateur(String nom, String prenom, String email, String numeroTel, Date date, String identifiant, String motDePass) {
		super(nom, prenom, email, numeroTel, date);
		this.identifiant=identifiant;
		this.motDePass=motDePass;
	}

	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String id) {
		this.identifiant =id;
	}
	
	public String getMotDePass() {
		return motDePass;
	}
	public void setMDP(String mdp) {
		this.motDePass =mdp;
	}
	
	
	public void connexion() {
		/**
		 * a faire 
		 */
	}
	
	public void deconnexion() {
		/**
		 * a faire 
		 */
	}
	
	public void ChangeMDP(String mdp) {
		this.motDePass = mdp;
	}
	
	
}
