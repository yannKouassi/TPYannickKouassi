public class Voiture extends  Vehicule implements  Louable{
    public int nombreDePlace ;
    public String typeDeCarburant ;

    public Voiture(String immatriculation, String marque, String modele, String annéeMiseEnService, int kilometrage,boolean statut, int nombreDePlace, String typeDeCarburant) {
        super(immatriculation, marque, modele, annéeMiseEnService, kilometrage,statut);
        this.nombreDePlace = nombreDePlace;
        this.typeDeCarburant = typeDeCarburant;
    }

    @Override
    public double calculerPrixLocation() {
        if(typeDeCarburant.equals("Essence")){
            return 60000;
        } else if (typeDeCarburant.equals("Diesel")) {
            return 85000;
        } else if (typeDeCarburant.equals("Electrique")) {
            return 100000;
        } else return 60000;
    }

    @Override
    public void louer() throws VehiculeIndisponibleException {
        if (!this.statut) throw new VehiculeIndisponibleException("\nLa voiture est déja louée");
        this.statut = false;

    }

    @Override
    public void retourner() throws VehiculeIndisponibleException {
        if (this.statut) throw new VehiculeIndisponibleException("\nLa voiture est déja louée");
        this.statut=true;
    }

    public int getNombreDePlace() {
        return nombreDePlace;
    }

    public void setNombreDePlace(int nombreDePlace) {
        this.nombreDePlace = nombreDePlace;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    @Override
    public String toString() {
        return "Voiture{" + super.toString() + "," +
                " nombreDePlace=" + nombreDePlace +
                ", typeDeCarburant='" + typeDeCarburant + '\'' +
                '}';
    }
}
