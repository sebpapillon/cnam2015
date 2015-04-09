package metier;

public class Compte
{
// attributs ( private )
private String numero ;
private float solde ;
private int decouvert ;
 //methodes
 /**
  * Constructeur complet
  * @param numero numéro du compte
  * @param solde solde du compte
  * @param decouvert montant du découvert autorisé
  *  
  */
 public Compte( String numero , float solde , int decouvert )
{
this.numero = numero ;
this.solde = solde ;
this.decouvert = decouvert ;
}

// surcharge du constructeur
// possibilité d’avoir plusieurs méthodes qui ont le même nom
public Compte( String numero ) {
	this.numero = numero ;
}

// accesseurs en lecture
// doit toujours respecter la règle de nommage suivante :
// - getNomAttribut
public String getNumero () {
	return numero ;
}

public float getSolde () {
	return solde ;
}

/**
 * Récupération du montant du découvert
 * @return entier montant découvert
 */
public int getDecouvert () {
	return decouvert ;
}
//accesseurs en écriture uniquement sur le découvert
 // on considère qu’on ne peut pas modifier le numèro
public void setDecouvert ( int decouvert) {
	this.decouvert = decouvert ;
}

// services
public boolean crediter ( float somme ) {
	boolean res = true ;
	if ( somme >= 0 ) {
		solde += somme ;
		res = false ;
	}
return res ;
}

/* debit d'un compte en fonction du solde et du decouvert */
public boolean debiter ( float somme ) {
	boolean res = false ;
	if ( somme >= 0 && somme <= solde + decouvert) {
		solde -= somme ;
		res = true ;
	} else {
		Journal journ = Journal.getInstance();
		journ.rejet(this.numero);
	}
	return res ;
}

public boolean virement ( Compte c , float somme ) {
	boolean res = false ;
	res = this.debiter ( somme );
	if ( res ) {
		c.crediter ( somme );
		res = true ;
	}
	return res ;
}

@Override
public String toString () {
	return "numero " + numero + " solde " + solde + " decouvert autorisé " + decouvert ;
	}
}

