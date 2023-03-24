package infoWorld;

import java.util.ArrayList;

public class BazaDeDateComenzi {

    Comanda c;

    ArrayList<Comanda> listaComenzi = new ArrayList<>();

    void adaugareComanda(Comanda c) {
        listaComenzi.add(c);
    }

    @Override
    public String toString() {
        return "BazaDeDateComenzi{\n" +
               listaComenzi +
                "\n";
    }
}
