public class Camion extends  Vehicule implements Louable{
    public double capaciteDeChargement ;
    public int nbreDesieux ;

    public Camion(String immatriculation, String marque, String modele, String annéeMiseEnService, int kilometrage, boolean statut, double capaciteDeChargement, int nbreDesieux) {
        super(immatriculation, marque, modele, annéeMiseEnService, kilometrage,statut);
        setCapaciteDeChargement(capaciteDeChargement);
        this.nbreDesieux = nbreDesieux;
    }

    @Override
    public double calculerPrixLocation() {  if(capaciteDeChargement <100){
        return 50000;
    } else if (capaciteDeChargement<200){
        return 75000;
    } else if (capaciteDeChargement<300) {
        return 100000;
    } else return 50000;
    }

    @Override
    public void louer() throws VehiculeIndisponibleException{
        if (!this.statut) throw new VehiculeIndisponibleException("\nLa voiture est déja louée");
        this.statut = false;


    }

    @Override
    public void retourner() throws VehiculeIndisponibleException {
        if (this.statut) throw new VehiculeIndisponibleException("\nLa voiture est déja louée");
        this.statut=true;

    }

    public double getCapaciteDeChargement() {
        return capaciteDeChargement;
    }

    public void setCapaciteDeChargement(double capaciteDeChargement) {
        if(capaciteDeChargement > 0 ){
            this.capaciteDeChargement = capaciteDeChargement;
        }else{
            this.capaciteDeChargement = 0;
        }
    }

    public int getNbreDesieux() {
        return nbreDesieux;
    }

    public void setNbreDesieux(int nbreDesieux) {
        this.nbreDesieux = nbreDesieux;
    }

    @Override
    public String toString() {
        return "Camion{" + super.toString()  + "," +
                "capaciteDeChargement=" + capaciteDeChargement +
                ", nbreDesieux=" + nbreDesieux +
                '}';
    }
}
