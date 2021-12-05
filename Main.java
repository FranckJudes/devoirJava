 import java.util.Scanner;

    public class Main{

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int taille = GestionEtudiant.taille();
            
            Etudiant[] etudiant = GestionEtudiant.remplir(taille);
            int choix;
            do{

            System.out.println("----------------------------------");
            System.out.println("\t1 - Afficher Les Etudiants par Ordre de Merite");
            System.out.println("\t2 - Afficher Les informations du Premmier Etudiants");
            System.out.println("\t3 - Afficher Les informations du Dernier Etudiant");
            System.out.println("\t4 - Reinitialiser la Liste de la Classe");
            System.out.println("\t5 -  Sortir du Programme");
            System.out.println("----------------------------------");

            System.out.print("Veuillez faire le Choix : ");
            choix = sc.nextInt();

            System.out.println("----------------------------------");
            System.out.println("");System.out.println("----------------------------------");
            switch(choix){
                case 1 :
                GestionEtudiant.OrdonnerParOrdre(taille,etudiant);
                GestionEtudiant.AfficherParMerite(taille,etudiant);
                break;

                case 2 :
                GestionEtudiant.OrdonnerParOrdre(taille,etudiant);
                GestionEtudiant.PremierEtudiant(etudiant);
                break;

                case 3 :
                GestionEtudiant.OrdonnerParOrdre(taille,etudiant);
                GestionEtudiant.DernierEtudiant(taille,etudiant);
                break;

                case 4:
                GestionEtudiant.reinitialier(etudiant, taille);
                break;

                case 5:
                GestionEtudiant.Sortir();
                break;


            }

            }while(choix  != 5);
            
                }
        }
