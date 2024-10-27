import java.util.ArrayList;
import java.util.Scanner;

public class Parc {
    ArrayList<Vehicule> monParc = new ArrayList<>();

    public void ajouterVehiculeAuParc (){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVoulez vous ajouter une voiture ou un camion ");
        System.out.println("\nV pour voiture et C pour camion ");
        String d = sc.nextLine();
        char l = d.toUpperCase().charAt(0);
        switch (l) {
            case 'V' : ajouterVoiture();
                l = d.toUpperCase().charAt(0);
                break;
            case 'C' : ajouterCamion();
                l = d.toUpperCase().charAt(0);
                break;
            default:
                System.out.println("\n___________by by__________");
                break;

        }
    }


    public void ajouterVoiture () {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("\nEntrer l'immatriculation ");
        String immatriculation = sc.nextLine();
        System.out.println("\nEntrer la marque ");
        String marque = sc.nextLine();
        System.out.println("\nDonnez le modele ");
        String modele = sc.nextLine();
        System.out.println("\nDonnez l'annee ");
        int anneeMiseEnService = sc.nextInt();
        System.out.println("\nDonnez le kilometrage ");
        int  kilometrage = sc.nextInt();
        System.out.println("\nDonnez le statut ");
        boolean monStatut = sc.nextBoolean();
        System.out.println("\nDonnez le nombre de place");
        int nombrePlace = sc.nextInt();
        System.out.println("\nDonnez le type de carburant ");
        String carburant = sc.nextLine() ;
        monParc.add(new Voiture(immatriculation,marque,modele,anneeMiseEnService,kilometrage,monStatut,nombrePlace,carburant));
    }

    public void ajouterCamion(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("\nEntrer l'immatriculation ");
        String immatriculation = sc.nextLine();
        System.out.println("\nEntrer la marque ");
        String marque = sc.nextLine();
        System.out.println("\nDonnez le modele ");
        String modele = sc.nextLine();
        System.out.println("\nDonnez l'annee ");
        int anneeMiseEnService = sc.nextInt();
        System.out.println("\nDonnez le kilometrage ");
        int  kilometrage = sc.nextInt();
        System.out.println("\nDonnez le statut ");
        boolean monStatut = sc.nextBoolean();
        System.out.println("\nDonnez la capacité de chargement ");
        double capacite = sc.nextDouble();
        System.out.println("\nDonnez le nombre de Sieux ");
        int sieux = sc.nextInt();
        monParc.add(new Camion(immatriculation,marque,modele,anneeMiseEnService,kilometrage,monStatut,capacite,sieux));
    }

}
