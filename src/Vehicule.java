public abstract class Vehicule {
    protected String immatriculation ;
    protected String marque ;
    protected String modele ;
    protected String anneeMiseEnService ;
    protected   int  kilometrage ;
    protected boolean statut ;

    public Vehicule(String immatriculation, String marque, String modele, String anneeMiseEnService, int kilometrage, boolean statut) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.anneeMiseEnService = anneeMiseEnService;
        this.kilometrage = kilometrage;
        this.statut = statut ;
    }


    public abstract  double calculerPrixLocation();

    @Override
    public String toString() {
        return
                "immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", anneeMiseEnService=" + anneeMiseEnService +
                ", kilometrage=" + kilometrage +
                ", statut=" + statut ;
    }
}
