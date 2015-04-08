package metier;

public class Compte
{
// attributs ( private )
private String numero ;
private float solde ;
private int decouvert ;
 //methodes
 /* constructeurs :
- m�me nom que la classe
- pas de valeur de retour )
- Il est appel� de fa�on implicite � chaque cr�ation */
 public Compte( String numero , float solde , int decouvert )
{
this.numero = numero ;
this.solde = solde ;
this.decouvert = decouvert ;
}

// surcharge du constructeur
// possibilit� d�avoir plusieurs m�thodes qui ont le m�me nom
public Compte( String numero )
{
this.numero = numero ;
}
//constructeur par d�faut n�cessaire pour en faire un "Java Bean".
// m�me si cela n'a pas de sens d'un point de vue m�tier
public Compte (){ }
// accesseurs en lecture
// doit toujours respecter la r�gle de nommage suivante :
// - getNomAttribut
public String getNumero ()
{
return numero ;
}
public float getSolde ()
{
return solde ;
}
public int getDecouvert ()
{
return decouvert ;
}
//accesseurs en �criture uniquement sur le d�couvert
 // on consid�re qu�on ne peut pas modifier le num�ro
public void setDecouvert ( int decouvert)
{
this.decouvert = decouvert ;
}
// services
public boolean crediter ( float somme )
{
boolean res = true ;
if ( somme >= 0 )
{
solde += somme ;
res = false ;
}
return res ;
}
/* debit d'un compte en fonction du solde et du decouvert */
public boolean debiter ( float somme )
{
boolean res = false ;
if ( somme >= 0 && somme <= solde + decouvert)
{
solde -= somme ;
res = true ;
}
return res ;
}
public boolean virement ( Compte c , float somme )
{
boolean res = false ;
res = this.debiter ( somme );
if ( res )
{
c.crediter ( somme );
res = true ;
}
return res ;
}
@Override
public String toString ()
{
return "numero " + numero + " solde " + solde +
 " decouvert autoris� " + decouvert ;
}
}

