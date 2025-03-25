package cat.xtec.ioc.gestiostockmobles;

public class Moble {

    private String nom;
    private double preu;
    private int quantitat;
    private String categoria;

    public Moble(String nom, double preu, int quantitat, String categoria) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
        this.categoria = categoria;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPreu() { return preu; }
    public void setPreu(double preu) { this.preu = preu; }

    public int getQuantitat() { return quantitat; }
    public void setQuantitat(int quantitat) { this.quantitat = quantitat; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}
