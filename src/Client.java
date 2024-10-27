import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public String nom , prenom ;
    public String numeroDePermis , numeroDeTelephone;
    ArrayList<Vehicule> location= new ArrayList<>() ;


    public Client(String nom, String prenom, String numeroDePermis, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDePermis = numeroDePermis;
        this.numeroDeTelephone = numeroDeTelephone;
        this.location=location ;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroDePermis() {
        return numeroDePermis;
    }

    public void setNumeroDePermis(String numeroDePermis) {
        this.numeroDePermis = numeroDePermis;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public ArrayList<Vehicule> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Vehicule> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroDePermis='" + numeroDePermis + '\'' +
                ", numeroDeTelephone='" + numeroDeTelephone + '\'' +
                ", location=" + location +
                '}';
    }
}
