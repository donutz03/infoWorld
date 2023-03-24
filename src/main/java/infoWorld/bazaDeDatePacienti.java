package infoWorld;

import java.util.ArrayList;

public class bazaDeDatePacienti {


    private ArrayList<Pacient> pacienti = new ArrayList<>();

    void adaugarePacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    void modificareNumePacient(Pacient p, String numeNou) {
        if (pacienti.contains(p)) p.setNume(numeNou);
    }

    void modificarePrenumePacient(Pacient p, String prenumeNou) {
        if (pacienti.contains(p)) p.setPrenume(prenumeNou);
    }

    void modificareCnpPacient(Pacient p, int cnpNou) {
        if (pacienti.contains(p)) p.setCnp(cnpNou);
    }

    void modificareNumarTelefon(Pacient p, int numarTelefon) {
        if (pacienti.contains(p)) p.setNumarTelefon(numarTelefon);
    }

    void modificareAdresaAcasa(Pacient p, String adresaAcasaNoua) {
        if (pacienti.contains(p)) p.setAdresaAcasa(adresaAcasaNoua);
    }

    void modificareAdresaMunca(Pacient p, String adresaMuncaNoua) {
        if (pacienti.contains(p)) p.setAdresaMunca(adresaMuncaNoua);
    }

    void stergerePacient(Pacient p) {
        if (pacienti.contains(p)) pacienti.remove(p);
    }

    Pacient obtinePacient(Pacient p) {
        if (pacienti.contains(p)) return p;
        else return null;
    }

    @Override
    public String toString() {
        return "bazaDeDatePacienti :\n" +
                pacienti +
                "\n}";
    }
}
