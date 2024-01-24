package gestionbibliotheque;


public class Livre {
    private String titre;
    private String auteur;
    private String ISBN;// International Standard Book Number
    private int copiesDisponibles;
    private String genre;
    private int anneePublication;
    private double prixEmprunt;

    public Livre(String titre, String auteur, String ISBN, int copiesDisponibles, String genre, int anneePublication, double prixEmprunt) {
        this.titre = titre;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.copiesDisponibles = copiesDisponibles;
        this.genre = genre;
        this.anneePublication = anneePublication;
        this.prixEmprunt = prixEmprunt;
    }
    // Start Getter et setter 

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopiesDisponibles() {
        return copiesDisponibles;
    }

    public void setCopiesDisponibles(int copiesDisponibles) {
        this.copiesDisponibles = copiesDisponibles;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public double getPrixEmprunt() {
        return prixEmprunt;
    }

    public void setPrixEmprunt(double prixEmprunt) {
        this.prixEmprunt = prixEmprunt;
    }
    //End Getter et setter
    // Méthode RechercheLivre
    public boolean RechercheTitre(String chaine) {
	if(titre.toLowerCase().equals(chaine.toLowerCase())){
            return true;
        }
	return false;
    }
    public void incrementerCopiesDisponibles() {
        copiesDisponibles++;
    }
    public void decrementerCopiesDisponibles() {
        copiesDisponibles--;
    }
    // Méthode pour afficher les détails du livre
    public void afficherDetails() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Copies disponibles: " + copiesDisponibles);
        System.out.println("Genre: " + genre);
        System.out.println("Année de publication: " + anneePublication);
    }
}
