package infoWorld;


public class Medicament {

    private String denumireMedicament;

    private float gramaj;

    private String formaPastila;

    private String descriere;

    private int lot;

    private String dataDeExpirare;

    private int nrBucati;

    public Medicament(String denumireMedicament, float gramaj, String formaPastila, String descriere, int lot,String dataDeExpirare, int nrBucati){
        this.denumireMedicament = denumireMedicament;
        this.gramaj = gramaj; //
        this.formaPastila = formaPastila; //
        this.descriere = descriere; //
        this.lot = lot; //
        this.dataDeExpirare = dataDeExpirare; //
        this.nrBucati = nrBucati;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public void setGramaj(float gramaj) {
        this.gramaj = gramaj;
    }

    public void setFormaPastila(String formaPastila) {
        this.formaPastila = formaPastila;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public void setDataDeExpirare(String dataDeExpirare) {
        this.dataDeExpirare = dataDeExpirare;
    }

    public void setNrBucati(int nrBucati) {
        this.nrBucati = nrBucati;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public float getGramaj() {
        return gramaj;
    }

    public String getDataDeExpirare() {
        return dataDeExpirare;
    }

    public int getLot() {
        return lot;
    }

    public int getNrBucati() {
        return nrBucati;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getFormaPastila() {
        return formaPastila;
    }

    @Override
    public String toString() {
        return "\nMedicament{\n" +
                "denumireMedicament='" + denumireMedicament + '\'' +
                ", gramaj=" + gramaj +
                ", formaPastila='" + formaPastila + '\'' +
                ", descriere='" + descriere + '\'' +
                ", lot=" + lot +
                ", dataDeExpirare='" + dataDeExpirare + '\'' +
                ", nrBucati=" + nrBucati +
                '}';
    }
}
