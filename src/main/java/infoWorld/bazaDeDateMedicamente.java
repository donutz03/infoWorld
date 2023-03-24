package infoWorld;

import java.util.ArrayList;

public class bazaDeDateMedicamente {

    private ArrayList<Medicament> medicamente = new ArrayList<>();

    public bazaDeDateMedicamente() {

    }

    void adaugareMedicament(Medicament m) {
        if (!medicamente.contains(m))
        medicamente.add(m);
    }

    Medicament obtineMedicament(Medicament m) {
        if (medicamente.contains(m)) return m;
        else return null;
    }

    void adaugareNrBucatiMedicamentLaStocExistent(Medicament m, int nrBucati) {
        if (medicamente.contains(m)) m.setNrBucati(m.getNrBucati() + nrBucati);
        else System.out.println("Medicamentul nu exista in baza de date. Adauga-l intai!");
    }

    void stergereMedicament(Medicament m) {
        if (medicamente.contains(m)) medicamente.remove(m);
    }

    void modificareLot(Medicament m, int lotNou) {
        if (medicamente.contains(m)) m.setLot(lotNou);
    }

    void modificareGramaj(Medicament m, int gramajNou) {
        if (medicamente.contains(m)) m.setGramaj(gramajNou);
    }

    void modificareFormaPastila(Medicament m, String formaPastilaNoua) {
        if (medicamente.contains(m)) m.setFormaPastila(formaPastilaNoua);
    }

    void modificareDescriere(Medicament m, String descriereNoua) {
        if (medicamente.contains(m)) m.setDescriere(descriereNoua);
    }

    void modificareDataDeExpirare(Medicament m, String dataDeExpirareNoua) {
        if (medicamente.contains(m)) m.setDataDeExpirare(dataDeExpirareNoua);
    }

    void modificareDenumireM(Medicament m, String denumireNoua) {
        if (medicamente.contains(m)) m.setDenumireMedicament(denumireNoua);
    }

    void modificareNrBucatiInStoc(Medicament m, int NrBucatiInStoc) {
        if (medicamente.contains(m)) m.setNrBucati(NrBucatiInStoc);
    }

    @Override
    public String toString() {
        return "bazaDeDateMedicamente{ :\n" +
                "medicamente=" + medicamente +
                "\n}";
    }
}
