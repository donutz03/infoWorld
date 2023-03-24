package infoWorld;

import java.util.ArrayList;

public class Pacient {

    private String nume;
    private String prenume;

    private int cnp;

    private int numarTelefon;

    private String adresaAcasa;

    private String adresaMunca;

    public Pacient(String nume, String prenume, int cnp, int numarTelefon, String adresaAcasa, String adresaMunca) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.numarTelefon = numarTelefon;
        this.adresaAcasa = adresaAcasa;
        this.adresaMunca = adresaMunca;
    }
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getCnp() {
        return cnp;
    }

    public int getNumarTelefon() {
        return numarTelefon;
    }

    public String getAdresaAcasa() {
        return adresaAcasa;
    }

    public String getAdresaMunca() {
        return adresaMunca;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public void setNumarTelefon(int numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void setAdresaAcasa(String adresaAcasa) {
        this.adresaAcasa = adresaAcasa;
    }

    public void setAdresaMunca(String adresaMunca) {
        this.adresaMunca = adresaMunca;
    }

    @Override
    public String toString() {
        return "\nPacient : \n" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                ", numarTelefon=" + numarTelefon +
                ", adresaAcasa='" + adresaAcasa + '\'' +
                ", adresaMunca='" + adresaMunca + '\'';
    }
}
