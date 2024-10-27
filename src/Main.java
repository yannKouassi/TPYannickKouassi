import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParcAutomobile monparcAutomobile = new ParcAutomobile();
        System.out.println("\n_____________BIENVENUE_______________");
        int choix;
      try {
          do {
              System.out.println("\n1-Ajuter un nouveau véhicule au parc \n2-Ajouter un nouveau client \n3-Louer un véhicule a un client \n4-Retourner un véhicule \n5-Liste des véhicules disponibles \n6-Liste des vehicules loués \n7-Liste des clients");
              choix = sc.nextInt();

              switch (choix) {

                  case 1:
                      monparcAutomobile.ajouterVehiculeAuParc();

                      break;

                  case 2:
                      monparcAutomobile.ajouterNouveauClient();

                      break;

                  case 3:
                      monparcAutomobile.louerVehiculePourClient();

                      break;

                  case 4:
                      monparcAutomobile.retournerVehicule();
                      break;

                  case 5:
                      monparcAutomobile.afficherVehiculeDuPac();

                      break;

                  case 6:
                      monparcAutomobile.afficherVehiculeLoue();

                      break;

                  case 7 :
                      monparcAutomobile.HistoriqueDesClients();
                      break;

                  default:
                      System.out.println("\n_________Fin du programme____________");


              }


          } while (choix == 1 || choix == 2 || choix == 3 || choix == 4 || choix == 5 || choix == 6  || choix == 7);
      } catch (Exception e) {

         e.getMessage();

      } finally {
          System.out.println("\nOups! \nVous n'avez pas respecté la consigne");
      }
    }
}