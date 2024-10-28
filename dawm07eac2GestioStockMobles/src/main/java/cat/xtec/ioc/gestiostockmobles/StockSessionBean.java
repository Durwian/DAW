package cat.xtec.ioc.gestiostockmobles;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless 
public class StockSessionBean {

    private List<Moble> stock = new ArrayList<>();  // Llista de mobles

    // Mètode per afegir un moble nou a la llista d'estoc
    public void afegirMoble(Moble moble) {
        stock.add(moble);  // Afegim el moble a la llista
    }

    // Mètode per obtenir la llista de mobles en estoc
    public List<Moble> getStock() {
        return stock;
    }

    // Mètode per actualitzar la quantitat d'un moble existent
    public void actualitzaMoble(String nom, int novaQuantitat) {
        for (Moble moble : stock) {
            if (moble.getNom().equals(nom)) {
                moble.setQuantitat(novaQuantitat);
                break;
            }
        }
    }
}
