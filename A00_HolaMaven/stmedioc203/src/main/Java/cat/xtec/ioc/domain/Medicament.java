/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.domain;

/**
 *
 * @author victor
 */
public class Medicament {
    private String medicamentId;
    private String name;
    private double price;
    private String description;
    private String producer;
    private String Category;
    private long stockQuantity;
    private long stockInOrder;
    private boolean active;
    
    public Medicament(){

    }
       
    public Medicament(String medicamentId, String name, double price){
        this.medicamentId = medicamentId;
        this.name = name;
        this.price = price;
    }

    public String getMedicamentId() {
        return medicamentId;
    }

    public void setMedicamentId(String medicamentId) {
        this.medicamentId = medicamentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public long getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(long stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public long getStockInOrder() {
        return stockInOrder;
    }

    public void setStockInOrder(long stockInOrder) {
        this.stockInOrder = stockInOrder;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Medicament other = (Medicament) obj;
        if(medicamentId == null){
            if (other.medicamentId != null){
                return false;
            }
        }else if(!medicamentId.equals(other.medicamentId)){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "Medicament [codi=" + medicamentId + ", nom="+name+"]";
    }
}
