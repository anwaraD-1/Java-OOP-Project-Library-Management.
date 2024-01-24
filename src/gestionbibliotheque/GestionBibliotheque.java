
package gestionbibliotheque;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

public class GestionBibliotheque {
    public static void main(String[] args) {
        
        //Roman
        //Livre(titre,auteur,ISBN,copiesDisponibles,genre,anneePublication,prixEmprunt);
        Livre l1=new Livre("L'Ombre du Vent", "Carlos Ruiz Zafon", "978-2-7654-3210-1", 8, "Roman", 2001,20);
        Livre l2=new Livre("Les Miserables", "Victor Hugo", "978-1-2345-6789-0", 20, "Roman", 1862,20);
        Livre l3=new Livre("Harry Potter a l'ecole des sorciers", "J.K. Rowling", "978-9-8765-4321-0", 10, "Roman", 1997,20);
        //Mathématiques
        Livre l4=new Livre("Theoreme vivant", "Cedric Villani", "978-3-2109-8765-4", 5, "Mathematiques", 2012,10);
        Livre l5=new Livre("L'elegance du herisson", "Muriel Barbery", "978-2-9876-5432-1", 5, "Mathematiques", 2006,10);
        Livre l6=new Livre("Le Theoreme du perroquet", "Denis Guedj", "978-1-8765-4321-0", 5, "Mathematiques", 1998,10);
        //Économie
        Livre l7=new Livre("Freakonomics", "Steven D. Levitt, Stephen J. Dubner", "978-6-5432-1098-7", 4, "economie", 2005,10);
        Livre l8=new Livre("Le Capital au XXIe siecle", "Thomas Piketty", "978-5-4321-8765-0", 3, "economie", 2013,10);
        Livre l9=new Livre("Misbehaving: The Making of Behavioral Economics", "Richard H. Thaler","978-4-5678-9876-2", 6, "economie", 2015,10);
        //Comptable
        Livre l10=new Livre("Comptabilite pour les Nuls", "Kenneth W. Boyd", "978-8-7654-3210-1", 5, "Comptabilite", 2005,10);
        Livre l11=new Livre("Financial Accounting: Tools for Business Decision Making", "Paul D. Kimmel, Jerry J. Weygandt, Donald E. Kieso", "978-1-2345-6789-0", 5, "Comptabilite", 2005,10);
        Livre l12=new Livre("Management Accounting: Information for Decision-Making and Strategy Execution", "Anthony A. Atkinson,Robert S. Kaplan,Ella Mae Matsumura,S. Mark Young", "978-9-8765-4321-0", 4, "Comptabilite", 2010,10);
        //Géographie
        Livre l13=new Livre("Atlas Obscura: An Explorer's Guide to the World's Hidden Wonders", "Joshua Foer,Dylan Thuras,Ella Morton", "978-3-2109-8765-4", 2, "Geographie", 2016,10);
        Livre l14=new Livre("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "978-2-9876-5432-1", 2, "Geographie", 2014,10);
        Livre l15=new Livre("Prisoners of Geography: Ten Maps That Tell You Everything You Need to Know About Global Politics", "Tim Marshall", "978-1-8765-4321-0", 2, "Geographie", 2015,10);
        //Sciences météorologiques
        Livre l16=new Livre("The Complete Idiot's Guide to Weather", "Mel Goldstein", "978-6-5432-1098-7", 7, "Sciences meteorologiques", 2002,10);
        Livre l17=new Livre("The AMS Weather Book: The Ultimate Guide to America's Weather", "Jack Williams", "978-5-4321-8765-0", 2, "Sciences meteorologiques", 2009,10);
        Livre l18=new Livre("The Cloudspotter's Guide: The Science, History, and Culture of Clouds", "Gavin Pretor-Pinney", "978-4-5678-9876-2", 2, "Sciences meteorologiques", 2006,10);
        //Biographie personnelle
        Livre l19=new Livre("Steve Jobs", "Walter Isaacson", "978-8-7654-3210-1", 4, "Biographie personnelle", 2011,10);
        Livre l20=new Livre("The Diary of a Young Girl", "Anne Frank", "978-1-2345-6789-0", 2000, "Biographie personnelle", 1947,10);
        Livre l21=new Livre("The Glass Castle: A Memoir", "Jeannette Walls", "978-9-8765-4321-0", 2000, "Biographie personnelle", 2005,10);
        //Histoire
        Livre l22=new Livre("A People's History of the United States", "Howard Zinn", "978-3-2109-8765-4", 10, "Histoire", 1980,10);
        Livre l23=new Livre("The Guns of August", "Barbara W. Tuchman", "978-2-9876-5432-1", 2, "Histoire", 1962,10);
        Livre l24=new Livre("SPQR: A History of Ancient Rome", "Mary Beard", "978-1-8765-4321-0", 5, "Histoire", 2015,10);
        //Informatique
        Livre l25=new Livre("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "978-3-2109-8765-4", 6, "Informatique", 2008,10);
        Livre l26=new Livre("Introduction to Algorithms", "Thomas H. Cormen,Charles E. Leiserson,Ronald L. Rivest,Clifford Stein", "978-2-9876-5432-1", 8, "Informatique", 2090,10);
        Livre l27=new Livre("Code : The Hidden Language of Computer Hardware and Software", "Charles Petzold", "978-1-8765-4321-0", 2000, "Informatique", 1999,10);
        //Cuisine
        Livre l28=new Livre("Mastering the Art of French Cooking", "Julia Child,Louisette Bertholle,Simone Beck", "978-2-7654-3210-1", 5, "Cuisine", 1961,10);
        Livre l29=new Livre("Essentials of Classic Italian Cooking", "Marcella Hazan", "978-1-2345-6789-0", 5, "Cuisine", 1992,10);
        Livre l30=new Livre("Japanese Cooking: A Simple Art", "Shizuo Tsuji", "978-9-8765-4321-0", 7, "Cuisine", 1980,10);
        Bibliotheque B1=new Bibliotheque(1, "IGA-Library");
        B1.ajouterLivre(l1);
        B1.ajouterLivre(l2);
        B1.ajouterLivre(l3);
        B1.ajouterLivre(l4);
        B1.ajouterLivre(l5);
        B1.ajouterLivre(l6);
        B1.ajouterLivre(l7);
        B1.ajouterLivre(l8);
        B1.ajouterLivre(l9);
        B1.ajouterLivre(l10);
        B1.ajouterLivre(l11);
        B1.ajouterLivre(l12);
        B1.ajouterLivre(l13);
        B1.ajouterLivre(l14);
        B1.ajouterLivre(l15);
        B1.ajouterLivre(l16);
        B1.ajouterLivre(l17);
        B1.ajouterLivre(l18);
        B1.ajouterLivre(l19);
        B1.ajouterLivre(l20);
        B1.ajouterLivre(l21);
        B1.ajouterLivre(l22);
        B1.ajouterLivre(l23);
        B1.ajouterLivre(l24);
        B1.ajouterLivre(l25);
        B1.ajouterLivre(l26);
        B1.ajouterLivre(l27);
        B1.ajouterLivre(l28);
        B1.ajouterLivre(l29);
        B1.ajouterLivre(l30);
        String quitter="non";
    do {
        String choix1;
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Bienvenue à IGA-Library !");
        System.out.println("IGA-Labrary vous propose une variété de livres dans différents domaines. Empruntez votre livre préféré!");
        System.out.println("Pour consulter les livres que vous avez empruntés, saisissez le numéro 1.");
        System.out.println("Pour emprunter un livre, saisissez le numéro 2.");
        System.out.println("Pour retourner un livre emprunté, saisissez le numéro 3.");
        System.out.println("Pour quitter complètement, saisissez le numéro 4.");
        System.out.println("");
        System.out.println("Veuillez saisir un choix entre [1 et 4] :");
            Scanner s1 = new Scanner(System.in);
            choix1=s1.next();
            while(!choix1.equals("1") && !choix1.equals("2") && !choix1.equals("3") && !choix1.equals("4")){
            System.out.println("Veuillez saisir un choix entre [1 et 4] :");
            System.out.println("Pour consulter les livres que vous avez empruntés, saisissez le numéro 1.");
            System.out.println("Pour emprunter un livre, saisissez le numéro 2.");
            System.out.println("Pour retourner un livre emprunté, saisissez le numéro 3.");
            System.out.println("Pour quitter complètement, saisissez le numéro 4.");
            choix1=s1.next();
            }
            switch (choix1) {
            case "1":
            System.out.println("-------------------------------------------------------------------------");
            //Scanner s2 = new Scanner(System.in);
            Scanner s3 = new Scanner(System.in);
            System.out.println("Êtes-vous membre de la Bibliothèque IGA? (OUI/NON)");
            String rep=s3.next();
            rep=rep.toLowerCase();
            while(!rep.equals("oui") && !rep.equals("non")){
            s3 = new Scanner(System.in);
            System.out.println("SVP,Êtes-vous membre de la Bibliothèque IGA? , Entrez (OUI/NON)");
            rep=s3.next();
            rep=rep.toLowerCase();
            }
            if(rep.equals("oui")){
                Scanner s4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=s4.next();  
                Scanner s5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=s5.next();  
                Scanner s6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=s6.next();  
                if(B1.estMembre(nm, prnm, nAdr)){
                    Membre m=B1.avoirMembre(nm, prnm, nAdr);
                    B1.AfficherLivresEmpruntes(m);
                }
                else {
                    System.out.println("Malheureusement, vous n'êtes pas membre de IGA-Library. Veuillez réserver un livre !");
                }
            }
            else{
                System.out.println("Malheureusement, vous n'êtes pas membre de IGA-Library. Veuillez réserver un livre !");
            }
            Scanner s7 = new Scanner(System.in); 
            System.out.println("Voulez-vous continuer avec l'application ? (OUI/NON)");
            String rep1=s7.next();
            rep1=rep1.toLowerCase();
            while(!rep1.equals("oui") && !rep1.equals("non")){
            s7 = new Scanner(System.in);
            System.out.println("SVP,Voulez-vous continuer avec l'application ?, Entrez (OUI/NON)");
            rep1=s7.next();
            rep1=rep1.toLowerCase();
            }
            if(rep1.equals("non")){
                quitter="oui";
                System.out.println("-----------------------Fin de l'application--------------------------------");
            }
            else{
                quitter="non";
            }
            break;
            case "2":
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Bienvenue à IGA-Library !");
                System.out.println("IGALabrary vous propose une variété de livres dans différents domaines. Empruntez votre livre préféré!");
                System.out.println("Voici les genres disponibles :");
                System.out.println("1-Roman");
                System.out.println("2-Mathematiques");
                System.out.println("3-Economie");
                System.out.println("4-Comptabilite");
                System.out.println("5-Geographie");
                System.out.println("6-Sciences meteorologiques");
                System.out.println("7-Biographie personnelle");
                System.out.println("8-Histoire");
                System.out.println("9-Informatique");
                System.out.println("10-Cuisine");
                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez entrer le nom du genre de livres que vous souhaitez explorer.\n" +
                                   "\n" +
                                   "En attente de votre choix...");
                String rep2=sc.nextLine();
                rep2=rep2.toLowerCase();
                while(!rep2.equals("Roman".toLowerCase()) && !rep2.equals("Mathematiques".toLowerCase())&& 
                    !rep2.equals("Economie".toLowerCase())&& !rep2.equals("Comptabilite".toLowerCase()) && 
                    !rep2.equals("Geographie".toLowerCase())&& !rep2.equals("Sciences meteorologiques".toLowerCase()) && 
                    !rep2.equals("Biographie personnelle".toLowerCase())&& !rep2.equals("Histoire".toLowerCase()) && 
                    !rep2.equals("Informatique".toLowerCase())&& !rep2.equals("Cuisine".toLowerCase())){
                    sc = new Scanner(System.in);
                    System.out.println("SVP,Veuillez entrer le nom du genre de livres que vous souhaitez explorer :");
                    rep2=sc.nextLine();
                    rep2=rep2.toLowerCase();
                }
                switch (rep2) {
                case "roman":
                System.out.println("-------------------------------------------------------------------------");
                Scanner sc1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("roman");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String rep3=sc1.next(); 
                while(!rep3.equals("1") && !rep3.equals("2") && !rep3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                rep3=sc1.next();
                }
                if(rep3.equals("1")){
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String rep5=sc2.nextLine();
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String rep4=sc3.next();
                rep4=rep4.toLowerCase();
                while(!rep4.equals("oui") && !rep4.equals("non")){
                sc3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                rep4=sc3.next();
                rep4=rep4.toLowerCase();
                }
                if(rep4.equals("oui")){
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=sc4.next();  
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=sc5.next();  
                Scanner sc6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=sc6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rep5);
                        if(B1.emprunterLivre(m,rep5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else { 
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rep5);
                        if(B1.emprunterLivre(Mbr,rep5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=sc4.next();  
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=sc5.next();  
                Scanner sc6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=sc6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rep5);
                        if(B1.emprunterLivre(m,rep5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rep5);
                        if(B1.emprunterLivre(Mbr,rep5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                
                }
                }
                else if(rep3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                quitter="non";
                }
                break;
                case "mathematiques":
                System.out.println("-------------------------------------------------------------------------");
                Scanner scn1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("mathematiques");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String rp3=scn1.next(); 
                while(!rp3.equals("1") && !rp3.equals("2") && !rp3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                rp3=scn1.next();
                }
                if(rp3.equals("1")){
                Scanner scn2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String rp5=scn2.nextLine();
                Scanner scn3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String rp4=scn3.next();
                rp4=rp4.toLowerCase();
                while(!rp4.equals("oui") && !rp4.equals("non")){
                scn3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                rp4=scn3.next();
                rp4=rp4.toLowerCase();
                }
                if(rp4.equals("oui")){
                Scanner scn4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=scn4.next();  
                Scanner scn5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=scn5.next();  
                Scanner scn6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=scn6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rp5);
                        if(B1.emprunterLivre(m,rp5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rp5);
                        if(B1.emprunterLivre(Mbr,rp5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner scn4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=scn4.next();  
                Scanner scn5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=scn5.next();  
                Scanner scn6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=scn6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rp5);
                        if(B1.emprunterLivre(m,rp5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rp5);
                        if(B1.emprunterLivre(Mbr,rp5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(rp3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
                break;
                case "economie":
                System.out.println("-------------------------------------------------------------------------");
                Scanner scnn1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("economie");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String rpp3=scnn1.next(); 
                while(!rpp3.equals("1") && !rpp3.equals("2") && !rpp3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                rpp3=scnn1.next();
                }
                if(rpp3.equals("1")){
                Scanner scnn2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String rpp5=scnn2.nextLine();
                Scanner scnn3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String rpp4=scnn3.next();
                rpp4=rpp4.toLowerCase();
                while(!rpp4.equals("oui") && !rpp4.equals("non")){
                scnn3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                rpp4=scnn3.next();
                rpp4=rpp4.toLowerCase();
                }
                if(rpp4.equals("oui")){
                Scanner scnn4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=scnn4.next();  
                Scanner scnn5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=scnn5.next();  
                Scanner scnn6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=scnn6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rpp5);
                        if(B1.emprunterLivre(m,rpp5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rpp5);
                        if(B1.emprunterLivre(Mbr,rpp5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner scnn4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=scnn4.next();  
                Scanner scnn5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=scnn5.next();  
                Scanner scnn6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=scnn6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rpp5);
                        if(B1.emprunterLivre(m,rpp5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rpp5);
                        if(B1.emprunterLivre(Mbr,rpp5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(rpp3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
                break;
                case "comptabilite":
                System.out.println("-------------------------------------------------------------------------");
                Scanner sccn1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("comptabilite");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String rrp3=sccn1.next(); 
                while(!rrp3.equals("1") && !rrp3.equals("2") && !rrp3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                rrp3=sccn1.next();
                }
                if(rrp3.equals("1")){
                Scanner sccn2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String rrp5=sccn2.nextLine();
                Scanner sccn3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String rrp4=sccn3.next();
                rrp4=rrp4.toLowerCase();
                while(!rrp4.equals("oui") && !rrp4.equals("non")){
                sccn3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                rrp4=sccn3.next();
                rrp4=rrp4.toLowerCase();
                }
                if(rrp4.equals("oui")){
                Scanner sccn4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=sccn4.next();  
                Scanner sccn5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=sccn5.next();  
                Scanner sccn6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=sccn6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rrp5);
                        if(B1.emprunterLivre(m,rrp5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rrp5);
                        if(B1.emprunterLivre(Mbr,rrp5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner sccn4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=sccn4.next();  
                Scanner sccn5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=sccn5.next();  
                Scanner sccn6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=sccn6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,rrp5);
                        if(B1.emprunterLivre(m,rrp5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,rrp5);
                        if(B1.emprunterLivre(Mbr,rrp5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(rrp3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
                break;
                case "geographie":
                System.out.println("-------------------------------------------------------------------------");
                Scanner c1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("geographie");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String r3=c1.next(); 
                while(!r3.equals("1") && !r3.equals("2") && !r3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                r3=c1.next();
                }
                if(r3.equals("1")){
                Scanner c2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String r5=c2.nextLine();
                Scanner c3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String r4=c3.next();
                r4=r4.toLowerCase();
                while(!r4.equals("oui") && !r4.equals("non")){
                c3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                r4=c3.next();
                r4=r4.toLowerCase();
                }
                if(r4.equals("oui")){
                Scanner c4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=c4.next();  
                Scanner c5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=c5.next();  
                Scanner c6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=c6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,r5);
                        if(B1.emprunterLivre(m,r5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,r5);
                        if(B1.emprunterLivre(Mbr,r5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner c4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=c4.next();  
                Scanner c5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=c5.next();  
                Scanner c6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=c6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,r5);
                        if(B1.emprunterLivre(m,r5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,r5);
                        if(B1.emprunterLivre(Mbr,r5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(r3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
                break;
                case "sciences meteorologiques":
                System.out.println("-------------------------------------------------------------------------");
                Scanner a1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("sciences meteorologiques");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String p3=a1.next(); 
                while(!p3.equals("1") && !p3.equals("2") && !p3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                p3=a1.next();
                }
                if(p3.equals("1")){
                Scanner a2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String p5=a2.nextLine();
                Scanner a3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String p4=a3.next();
                p4=p4.toLowerCase();
                while(!p4.equals("oui") && !p4.equals("non")){
                a3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                p4=a3.next();
                p4=p4.toLowerCase();
                }
                if(p4.equals("oui")){
                Scanner a4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=a4.next();  
                Scanner a5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=a5.next();  
                Scanner a6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=a6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,p5);
                        if(B1.emprunterLivre(m,p5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,p5);
                        if(B1.emprunterLivre(Mbr,p5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner a4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=a4.next();  
                Scanner a5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=a5.next();  
                Scanner a6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=a6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,p5);
                        if(B1.emprunterLivre(m,p5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,p5);
                        if(B1.emprunterLivre(Mbr,p5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(p3.equals("2")){
                    quitter="oui";
                }
                else{
                    quitter="non";
                }
                break;
                case "biographie personnelle":
                System.out.println("-------------------------------------------------------------------------");
                Scanner b1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("biographie personnelle");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String o3=b1.next(); 
                while(!o3.equals("1") && !o3.equals("2") && !o3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                o3=b1.next();
                }
                if(o3.equals("1")){
                Scanner b2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String o5=b2.nextLine();
                Scanner b3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String o4=b3.next();
                o4=o4.toLowerCase();
                while(!o4.equals("oui") && !o4.equals("non")){
                b3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                o4=b3.next();
                o4=o4.toLowerCase();
                }
                if(o4.equals("oui")){
                Scanner b4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=b4.next();  
                Scanner b5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=b5.next();  
                Scanner b6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=b6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,o5);
                        if(B1.emprunterLivre(m,o5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,o5);
                        if(B1.emprunterLivre(Mbr,o5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner b4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=b4.next();  
                Scanner b5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=b5.next();  
                Scanner b6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=b6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,o5);
                        if(B1.emprunterLivre(m,o5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,o5);
                        if(B1.emprunterLivre(Mbr,o5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(o3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
                break;
                case "histoire":
                System.out.println("-------------------------------------------------------------------------");
                Scanner C1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("histoire");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String n3=C1.next(); 
                while(!n3.equals("1") && !n3.equals("2") && !n3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                n3=C1.next();
                }
                if(n3.equals("1")){
                Scanner C2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String n5=C2.nextLine();
                Scanner C3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String n4=C3.next();
                n4=n4.toLowerCase();
                while(!n4.equals("oui") && !n4.equals("non")){
                C3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                n4=C3.next();
                n4=n4.toLowerCase();
                }
                if(n4.equals("oui")){
                Scanner C4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=C4.next();  
                Scanner C5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=C5.next();  
                Scanner C6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=C6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,n5);
                        if(B1.emprunterLivre(m,n5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,n5);
                        if(B1.emprunterLivre(Mbr,n5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner C4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=C4.next();  
                Scanner C5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=C5.next();  
                Scanner C6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=C6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,n5);
                        if(B1.emprunterLivre(m,n5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,n5);
                        if(B1.emprunterLivre(Mbr,n5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(n3.equals("2")){
                quitter="oui";
                System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                quitter="non";
                }
                break;
                case "informatique":
                System.out.println("-------------------------------------------------------------------------");
                Scanner d1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("informatique");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String m3=d1.next(); 
                while(!m3.equals("1") && !m3.equals("2") && !m3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                m3=d1.next();
                }
                if(m3.equals("1")){
                Scanner d2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String m5=d2.nextLine();
                Scanner d3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library? (OUI/NON)");
                String m4=d3.next();
                m4=m4.toLowerCase();
                while(!m4.equals("oui") && !m4.equals("non")){
                d3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library? , Entrez (OUI/NON)");
                m4=d3.next();
                m4=m4.toLowerCase();
                }
                if(m4.equals("oui")){
                Scanner d4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=d4.next();  
                Scanner d5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=d5.next();  
                Scanner d6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=d6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,m5);
                        if(B1.emprunterLivre(m,m5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                    
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,m5);
                        if(B1.emprunterLivre(Mbr,m5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner d4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=d4.next();  
                Scanner d5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=d5.next();  
                Scanner d6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=d6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,m5);
                        if(B1.emprunterLivre(m,m5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,m5);
                        if(B1.emprunterLivre(Mbr,m5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                }
                }
                else if(m3.equals("2")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
                break;
                case "cuisine":
                System.out.println("-------------------------------------------------------------------------");
                Scanner e1 = new Scanner(System.in); 
                B1.RechercheLivreGenre("cuisine");
                System.out.println("");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("");
                System.out.println("Veuillez saisir un choix entre [1 et 3] :");
                String k3=e1.next(); 
                while(!k3.equals("1") && !k3.equals("2") && !k3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez emprunter un livre, saisissez le numéro 1");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 2 :");
                System.out.println("Si vous souhaitez revenir au menu principal, saisissez le numéro 3 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 3]");
                k3=e1.next();
                }
                if(k3.equals("1")){
                Scanner e2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez emprunter :");
                String k5=e2.nextLine();
                Scanner e3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String k4=e3.next();
                k4=k4.toLowerCase();
                while(!k4.equals("oui") && !k4.equals("non")){
                e3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                k4=e3.next();
                k4=k4.toLowerCase();
                }
                if(k4.equals("oui")){
                Scanner e4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=e4.next();  
                Scanner e5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=e5.next();  
                Scanner e6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=e6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //----------------------------0-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,k5);
                        if(B1.emprunterLivre(m,k5)){
                            B1.incrementerCaisse();
                        }
                    }
                     //----------------------------0-------------------------------
                }
                else {
                    //----------------------------1-------------------------------
                    System.out.println("les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("Cependant, nous vous inscrirons automatiquement en tant que membre d'IGA si vous suivez avec succès les prochaines étapes !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,k5);
                        if(B1.emprunterLivre(Mbr,k5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    } 
                    //-----------------------------------------------------------
                }
                }
                else {
                System.out.println("Veuillez vous inscrire sur IGA-Library :--------------------------------");
                Scanner e4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=e4.next();  
                Scanner e5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=e5.next();  
                Scanner e6 = new Scanner(System.in);
                System.out.println("Veuillez entrer un Numero Adherent de votre choix : ");
                String nAdr=e6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    //--------------------------2---------------------------------
                    System.out.println("Vous êtes déjà notre Membre !");
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre m=B1.avoirMembre(nm, prnm, nAdr);
                        B1.emprunterLivre(m,k5);
                        if(B1.emprunterLivre(m,k5)){
                            B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                }
                else{
                    //----------------------------3-------------------------------
                    Scanner f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    String h4=f3.next();
                    h4=h4.toLowerCase();
                    while(!h4.equals("oui") && !h4.equals("non")){
                    f3 = new Scanner(System.in);
                    System.out.println("IGA-labrary vous prêtera ce livre uniquement pour 10 DH au lieu de 25 DH. Acceptez-vous de payer ce montant (10 DH) ?");
                    h4=f3.next();
                    h4=h4.toLowerCase();
                    }
                    if(h4.equals("oui")){
                        Membre Mbr =new Membre(B1.concatenerNom(nm, prnm),nAdr,"5/01/2024");
                        B1.ajouterMembre(Mbr);
                        B1.emprunterLivre(Mbr,k5);
                        if(B1.emprunterLivre(Mbr,k5)){
                        System.out.println("Vous avez été automatiquement enregistré en tant que membre d'IGAlabrary en fonction des informations que vous avez fournies précédemment.");
                        B1.incrementerCaisse();
                        }
                    }
                    //-----------------------------------------------------------
                } 
                }
                }
                else if(k3.equals("2")){
                quitter="oui";
                System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                quitter="non";
                }
                break;
                }
            break;
            case "3":
                System.out.println("-------------------------------------------------------------------------");
                Scanner e2 = new Scanner(System.in);
                System.out.println("Veuillez saisir le nom du livre que vous souhaitez retourner :");
                String k5=e2.nextLine();
                Scanner e3 = new Scanner(System.in);
                System.out.println("Êtes-vous membre de IGA-Library ? (OUI/NON)");
                String k4=e3.next();
                k4=k4.toLowerCase();
                while(!k4.equals("oui") && !k4.equals("non")){
                e3 = new Scanner(System.in);
                System.out.println("SVP,Êtes-vous membre de IGA-Library ? , Entrez (OUI/NON)");
                k4=e3.next();
                k4=k4.toLowerCase();
                }
                if(k4.equals("oui")){
                Scanner e4 = new Scanner(System.in);
                System.out.println("Veillez Entez le prénom : ");
                String prnm=e4.next();  
                Scanner e5 = new Scanner(System.in);
                System.out.println("Veillez Entez le nom : ");
                String nm=e5.next();  
                Scanner e6 = new Scanner(System.in);
                System.out.println("Veillez Entez le Numero Adherent : ");
                String nAdr=e6.next();
                if(B1.estMembre(nm, prnm, nAdr)){
                    Membre m=B1.avoirMembre(nm, prnm, nAdr);
                    B1.retournerLivre(m,k5);
                }
                else {
                    System.out.println("");
                    System.out.println("Désolé, les informations que vous avez fournies ne correspondent à aucun de nos membres,");
                    System.out.println("puisque vous avez déjà emprunté un livre auparavant, vous devez être membre d'IGA labrary,");
                    System.out.println("Veuillez réessayer en saisissant vos informations d'adhésion. Merci.");
                }
                }
                else {
                    System.out.println("");
                    System.out.println("Désolé, puisque vous avez déjà emprunté un livre auparavant, vous devez être membre d'IGA labrary,");
                    System.out.println("Veuillez réessayer en saisissant vos informations d'adhésion. Merci.");
                }
                Scanner h1 = new Scanner(System.in); 
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 1 :");
                System.out.println("Si vous souhaitez revenir au menu principal, entrez le numéro 2 :");
                String j3=h1.next(); 
                while(!j3.equals("1") && !j3.equals("2") && !j3.equals("3")){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Si vous souhaitez quitter définitivement, saisissez le numéro 1 :");
                System.out.println("Si vous souhaitez revenir au menu principal, entrez le numéro 2 :");
                System.out.println("SVP,Veuillez saisir un choix entre [1 et 2]");
                j3=h1.next();
                }
                if(j3.equals("1")){
                    quitter="oui";
                    System.out.println("-----------------------Fin de l'application--------------------------------");
                }
                else{
                    quitter="non";
                }
            break;
            case "4":
                quitter="oui";
                System.out.println("-----------------------Fin de l'application--------------------------------");
            break;
    
        }
    }while(!quitter.equals("oui"));
    B1.afficherCaisse();
    B1.afficherMembres();
    B1.afficherLivresDisponibles();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
