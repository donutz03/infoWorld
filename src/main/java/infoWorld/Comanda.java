package infoWorld;

public class Comanda {

    private Pacient p;

    private Medicament m;

    public Comanda (Pacient p, Medicament m) {
        this.p = p;
        this.m = m;
    }

    public Medicament getM() {
        return m;
    }

    public void setM(Medicament m) {
        this.m = m;
    }

    public Pacient getP() {
        return p;
    }

    public void setP(Pacient p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Comanda{\n" +
                "pacient=" + p.getNume() + " " + p.getPrenume() +
                ", medicament=" + m.getDenumireMedicament() +
                '}';
    }
}
