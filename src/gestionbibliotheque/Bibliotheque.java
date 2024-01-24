package gestionbibliotheque;

import java.util.ArrayList;


public class Bibliotheque {
    private int id;
    private String nom;
    private ArrayList <Livre> livres= new ArrayList<Livre>();
    private ArrayList <Membre> membres= new ArrayList<Membre>();
    private double caisse=0;
    
    public Bibliotheque(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    //Start Getter et setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void setLivres(ArrayList<Livre> livres) {
        this.livres = livres;
    }

    public ArrayList<Membre> getMembres() {
        return membres;
    }

    public void setMembres(ArrayList<Membre> membres) {
        this.membres = membres;
    }

    public double getCaisse() {
        return caisse;
    }

    public void setCaisse(double caisse) {
        this.caisse = caisse;
    }
    //End Getter et setter
    // Méthode pour ajouter un livre à la bibliothèque
    public void ajouterLivre(Livre livre) {
        if(livres.contains(livre)){
            System.out.println("Le livre existe déjà dans la bibliothèque");
        }
        else {
            livres.add(livre);
            System.out.println("Le livre " + livre.getTitre() + " a été ajouté à la bibliothèque.");
        }
        
    }

    // Méthode pour supprimer un livre de la bibliothèque
    public void supprimerLivre(Livre livre) {
        if(livres.contains(livre)){
            livres.remove(livre);
            System.out.println("Le livre " + livre.getTitre() + " a été supprimé de la bibliothèque.");
        }
        else{
            System.out.println("Le livre n'existe pas dans la bibliothèque");
        }
    }

    // Méthode pour ajouter un membre à la bibliothèque
    public void ajouterMembre(Membre membre) {
        if(membres.contains(membre)){
            System.out.println("Le membre existe déjà");
        }
        else {
            membres.add(membre);
        }
        
    }

    // Méthode pour supprimer un membre de la bibliothèque
    public void supprimerMembre(Membre membre) {
        if(membres.contains(membre)){
            membres.remove(membre);
        }
        else{
            System.out.println("Le membre il n'existe pas dans la bibliothèque");
        }
        
    }
    public boolean estMembre(String nom,String prenom,String numAdr ) {
	for(Membre m : membres) {
            if (m.RechercheNomMembre(nom, prenom,numAdr)) {
                return(true);
            }
        }
        return(false);
    }
    public Membre avoirMembre(String nom,String prenom,String numAdr ) {
	for(Membre m : membres) {
            if (m.RechercheNomMembre(nom, prenom,numAdr)) {
                return(m);
            }
        }
        return(null);
    }
    public void AfficherLivresEmpruntes(Membre m) {
        ArrayList<Livre> LO= m.getLivresEmpruntes();
        if(LO.isEmpty()){
            System.out.println("Vous n'avez emprunté aucun livre!");
        }
        else {
            int i;
            System.out.println("Les livres que vous avez empruntés :");
            for(Livre l : LO) {
               System.out.println("-"+l.getTitre()); 
            }
        }
        
    }
    // Méthode pour afficher la liste des livres disponibles
    public void afficherLivresDisponibles() {
        System.out.println("Livres disponibles dans la bibliothèque : ------------------------------------------------------------------------- ");
        for(Livre livre : livres) {
            if (livre.getCopiesDisponibles() > 0) {
                System.out.println("- " + livre.getTitre());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }
    public void RechercheLivreGenre(String Genre) {
        System.out.println("Livres disponibles dans la bibliothèque : ");
        for(Livre livre : livres) {
            if (livre.getCopiesDisponibles() > 0 && livre.getGenre().toLowerCase().equals(Genre)) {
                System.out.println("- " + livre.getTitre());
            }
        }
        
    }
    // Méthode pour afficher la liste des membres de la bibliothèque
    public void afficherMembres() {
        System.out.println("Membres de la bibliothèque :------------------------------------------------------------------------- ");
        for(Membre membre : membres) {
            membre.afficherDetails();
            System.out.println("--------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    public boolean livreExiste(String chaine) {
	for(Livre livre : livres) {
            if (livre.RechercheTitre(chaine)) {
                return(true);
            }
        }
        return(false);
    }
    public Livre rechercheLivre(String chaine) {
    for (Livre livre : livres) {
        if (livre.RechercheTitre(chaine)) {
            return livre;
        }
    }
    return null;
    }
    // Méthode pour emprunter un livre
    public boolean emprunterLivre(Membre M,String nomlivre) {
        if(livreExiste(nomlivre)){
            Livre l=rechercheLivre(nomlivre);
            if (l.getCopiesDisponibles() > 0) {
                l.decrementerCopiesDisponibles();
                M.ajouterLivreEmprunte(l);
                System.out.println("-->Livre emprunté avec succès, Bonne lecture !");
                return(true);
            } 
            else {
                System.out.println("-->Aucune copie disponible pour emprunt.");
                return(false);
            }
        }
            System.out.println("-->Le livre n'existe pas dans la bibliothèque!"); 
            return(false);
    }
    // Méthode pour retourner un livre
    public boolean retournerLivre(Membre M,String nomlivre) {
        System.out.println(nomlivre);
        System.out.println(livreExiste(nomlivre));
        if(livreExiste(nomlivre)){
            Livre l=rechercheLivre(nomlivre);
            if(M.RechercheLivresEmpruntes(l)){
                l.incrementerCopiesDisponibles();
                M.supprimerLivreEmprunte(l);
                System.out.println("-->Livre retourné avec succès, Merci pour votre confiance !");
                return(true);
            }
            else {
                System.out.println("-->Le livre n'est pas dans la liste des livres que vous avez empruntés");
                return(false);
            }
        }
        System.out.println("-->Le livre n'existe pas dans la bibliothèque!"); 
            return(false);
    }
    public String concatenerNom(String nm, String prnm) {
        String nomComplet = nm + " " + prnm;
        return (nomComplet);
    }
    public void incrementerCaisse() {
        caisse+=10;
    }
    public void afficherCaisse() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Le montant actuellement disponible dans la caisse : "+caisse+" DH");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
    }
    public void afficherDetails() {
        System.out.println("id : " + id);
        System.out.println("Nom Bibliothéque : " + nom);
        System.out.println("caisse : "+caisse);
    }
    
}
