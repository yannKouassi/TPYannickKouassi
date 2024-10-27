import java.util.ArrayList;
import java.util.Scanner;

public class ParcAutomobile {
    ArrayList<Vehicule> monParc = new ArrayList<>();
    ArrayList<Client> mesClients = new ArrayList<>();
    ArrayList<Vehicule> location= new ArrayList<>() ;
    

    public void ajouterVehiculeAuParc (){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n_________Voulez vous ajouter une voiture ou un camion ?__________");
        System.out.print("\nV pour voiture et C pour camion : ");
        String d = sc.nextLine();
        char l = d.toUpperCase().charAt(0);
        switch (l) {
            case 'V' : ajouterVoitureAuParc();

                break;
            case 'C' : ajouterCamionAuParc();

                break;
            default:
                System.out.println("\n___________by by__________");
                break;

        }
    }


    public void ajouterVoitureAuParc () {
        Scanner sc = new Scanner(System.in) ;
        boolean monStatut = true;
        System.out.print("\nEntrer l'immatriculation : ");
        String immatriculation = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer la marque : ");
        String marque = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le modele : ");
        String modele = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez l'annee : ");
        String anneeMiseEnService = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le kilometrage : ");
        int  kilometrage = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDonnez le nombre de place : ");
        int nombrePlace = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDonnez le type de carburant 'Diesel' 'Essence' 'Electrique' ");
        String carburant = sc.nextLine() ;
        sc.nextLine();
        System.out.println("\n-La voiture "+ marque+ " " +modele + " est ajoutée au parc- ");
        monParc.add(new Voiture(immatriculation,marque,modele,anneeMiseEnService,kilometrage,monStatut,nombrePlace,carburant));
    }

    public void ajouterCamionAuParc(){
        Scanner sc = new Scanner(System.in) ;
        boolean monStatut = true;
        System.out.print("\nEntrer l'immatriculation : ");
        String immatriculation = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer la marque : ");
        String marque = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le modele : ");
        String modele = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez l'annee : ");
        String anneeMiseEnService = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le kilometrage : ");
        int  kilometrage = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDonnez la capacité de chargement : ");
        double capacite = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nDonnez le nombre des essieux : ");
        int essieux = sc.nextInt();
        sc.nextLine();
        System.out.println("\n-Le camion "+ marque+ " " + modele + " est ajouté au parc- ");
        monParc.add(new Camion(immatriculation,marque,modele,anneeMiseEnService,kilometrage,monStatut,capacite,essieux));
    }



    public void ajouterNouveauClient(){

        Scanner sc = new Scanner(System.in) ;
        System.out.print("\n_______On ajoute des clients : _______");
        System.out.print("\nEntrer le nom du client : ");
        String sonNom = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer le prenom du client : ");
        String sonPrenom = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer le numéro de permis : ");
        String sonNumPermis = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer son numéro de téléphone : ");
        String sonNumTel = sc.nextLine();
        sc.nextLine();
        System.out.println("\n-Le client "+sonNom + " " + sonPrenom +" est ajouté avec succès-");
        mesClients.add(new Client(sonNom,sonPrenom,sonNumPermis,sonNumTel)) ;

    }

    public void ajouterVoitureDuClient () {
        Scanner sc = new Scanner(System.in) ;
        boolean monStatut = false;
        System.out.print("\nDonnez l'indice du client : ");
        int i= sc.nextInt();
        sc.nextLine();
        System.out.println("\n__On va donnez les caractéristiques de la voiture__");
        System.out.print("\nEntrer l'immatriculation : ");
        String immatriculation = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer la marque : ");
        String marque = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le modele : ");
        String modele = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez l'annee : ");
        String anneeMiseEnService = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le kilometrage : ");
        int  kilometrage = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDonnez le nombre de place : ");
        int nombrePlace = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDonnez le type de carburant : 'Diesel' 'Essence' 'Electrique' ");
        String carburant = sc.nextLine() ;
        sc.nextLine();
        System.out.println("\nLe client " + mesClients.get(i-1).nom + "  loue une voiture ");
        location.add(new Voiture(immatriculation,marque,modele,anneeMiseEnService,kilometrage,monStatut,nombrePlace,carburant));
        sc.nextLine();
        mesClients.get(i-1).setLocation(location);
        sc.nextLine();
    }

    public void ajouterCamionDuClient(){
        Scanner sc = new Scanner(System.in) ;
        boolean monStatut = false;
        System.out.print("\nDonnez l'index du client ");
        int i= sc.nextInt();
        System.out.println("\n__On va donnez les caractéristiques du camion__");
        System.out.print("\nEntrer l'immatriculation : ");
        String immatriculation = sc.nextLine();
        sc.nextLine();
        System.out.print("\nEntrer la marque : ");
        String marque = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le modele : ");
        String modele = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez l'annee : ");
        String anneeMiseEnService = sc.nextLine();
        sc.nextLine();
        System.out.print("\nDonnez le kilometrage : ");
        int  kilometrage = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDonnez la capacité de chargement : ");
        double capacite = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nDonnez le nombre des essieux : ");
        int essieux = sc.nextInt();
        sc.nextLine();
        System.out.println("\nLe client " + mesClients.get(i-1).nom + "  loue camion ");
        location.add(new Camion(immatriculation,marque,modele,anneeMiseEnService,kilometrage,monStatut,capacite,essieux));
        sc.nextLine();
        mesClients.get(i-1).setLocation(location );
        sc.nextLine();

    }

    public void ajouterVehiculeClient () {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________________________Voulez vous ajouter une voiture ou un camion? ___________________________________");
        System.out.print("\n________'V' pour voiture et 'C' pour camion______");
        String d = sc.nextLine();
        char l = d.toUpperCase().charAt(0);
        switch (l) {
            case 'V':
                ajouterVoitureDuClient();

                break;
            case 'C':
                ajouterCamionDuClient();

                break;
            default:
                System.out.println("\n___________by by__________");
                break;

        }
    }
    public void louerVehiculePourClient() {
        Scanner cs = new Scanner(System.in) ;
        boolean continuer = true ;
        while (continuer == true) {
            System.out.print("\n___Tapez 1 pour ajouter un vehicule a la liste de location d'un client ou 2 pour quitter : ___");
            int e = cs.nextInt();
            cs.nextLine();
            switch (e) {
                case 1:
                    ajouterVehiculeClient();
                    break;
                case 2 :
                    System.out.println("\n __by by__"); continuer = false;
                default:
                    continuer = false;
            }


        }    }





    public void afficherVehiculeLoue() {
        System.out.println("\n________Liste des Vehicules en location_______");
        if (!location.isEmpty()) {

            for (Vehicule mesVehiculesLoue : location) {
                System.out.println(mesVehiculesLoue);
            }
        }else System.out.println("\t \nIl n'ya aucun véhicule loué ");
    }



    public void afficherVehiculeDuPac() {
        System.out.println("\n________Liste des Vehicules du parc_______");
        if (!monParc.isEmpty()) {
            for (Vehicule mesVehicules : monParc) {
                System.out.println(mesVehicules);
            }
        }else System.out.println("\t \nIl n'ya pas de Véhicule au Parc");
    }
    public void retournerVehicule () {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrer l'indice du client à modifier ");
        int i = sc.nextInt();
        mesClients.get(i - 1);
        if (!mesClients.isEmpty()) {
            if (!mesClients.get(i - 1).location.isEmpty()) {
                System.out.println("\nEntrer l'indice de la voiture à retourner ");
                int j = sc.nextInt();
                System.out.println("\nLe client " + mesClients.get(i-1).nom + " a retourné le véhicule loué : " + location.get(j-1).modele);
                monParc.add(location.get(j-1));
                mesClients.get(i - 1).getLocation().remove(j - 1);
            } else {System.out.println("Oups! Le client" + mesClients.get(i-1).nom + " n'a caucune location en cours ");}
        }else System.out.println("\t \nLa liste des clients est d'ailleurs vide");
    }

    public void HistoriqueDesClients() {  System.out.println("\n________Liste des Clients du parc_______");
        if (!mesClients.isEmpty()) {
            for (Client clientDuParc : mesClients) {
                System.out.println(clientDuParc);
            }
        }else System.out.println("\t \nLa Liste présentant les différents clients est vide ");

    }

}
