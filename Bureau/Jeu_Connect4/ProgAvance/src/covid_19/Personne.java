package covid_19;

import java.util.Date;

/**
 * 
 * @author bouredjioua
 *
 */
public class Personne {

	private String nom,prenom, email, numeroTel;
	private Date date;
	/**
	 * Constructeur de la classe Personne:
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param numeroTel
	 * @param date
	 */
	public Personne(String nom, String prenom, String email, String numeroTel, Date date) {
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.numeroTel=numeroTel;
		this.date=date;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String n) {
		this.nom =n;
	}
	/************************************/
	public String getprenom() {
		return prenom;
	}
	public void setprenom(String pren) {
		this.prenom =pren;
	}	
	/************************************/
	public String getEmai() {
		return email;
	}
	public void setEmail(String em) {
		this.email =em;
	}
	/************************************/
	public Date getDate() {
		return date;
	}
	public void setDate(Date d) {
		this.date =d;
	}
	/************************************/
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numtel) {
		this.numeroTel =numtel;
	}
	/************************************/

	
	
}
