package gestionbibliotheque;

import java.util.ArrayList;

public class Membre {
    private String nom;
    private String numeroAdherent;
    private ArrayList <Livre> livresEmpruntes= new ArrayList<Livre>();
    private String dateAdhesion;

    public Membre(String nom, String numeroAdherent, String dateAdhesion) {
        this.nom = nom;
        this.numeroAdherent = numeroAdherent;
        this.dateAdhesion = dateAdhesion;
    }
    public void ajouterLivreEmprunte(Livre livre) {
        if(!livresEmpruntes.contains(livre)){
            livresEmpruntes.add(livre); 
        }
    }
    public void supprimerLivreEmprunte(Livre livre) {
        if(livresEmpruntes.contains(livre)){
            livresEmpruntes.remove(livre); 
        }
    }
    public boolean RechercheLivresEmpruntes(Livre l) {
        for(int i=0;i<livresEmpruntes.size();i++){
            if(livresEmpruntes.get(i).equals(l)){
                return(true);
            }
        }
        return(false);
    }
    public boolean RechercheNomMembre(String nm, String prnm,String numAdr) {
        nom=nom.toLowerCase();
	String[] tab = nom.split(" ");
	nm=nm.toLowerCase();
        prnm=prnm.toLowerCase();
        boolean a=false,b=false;
	for(String x:tab) {
            if(x.equals(nm)){
                a=true;
            }
            if(x.equals(prnm)){
                b=true;
            }
	}
        if(a==true && b==true && numAdr.equals(numeroAdherent)){
            return(true);
        }
        return(false);
    }
    // Start Getter et setter 
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroAdherent() {
        return numeroAdherent;
    }

    public void setNumeroAdherent(String numeroAdherent) {
        this.numeroAdherent = numeroAdherent;
    }

    public ArrayList<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    public void setLivresEmpruntes(ArrayList<Livre> livresEmpruntes) {
        this.livresEmpruntes = livresEmpruntes;
    }

    public String getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(String dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }
    // End Getter et setter 

    

    //Méthode pour afficher les détails du membre
    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("Numéro d'adhérent : " + numeroAdherent);
        System.out.println("Date d'adhésion : " + dateAdhesion);
        System.out.println("Livres empruntés : ");
        for (Livre livre : livresEmpruntes) {
            System.out.println("- " + livre.getTitre());
        }
    }
}



