/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Additionals.Avocado;
import Additionals.Dessert;
import Additionals.DoubleProtein;
import Additionals.Drink;
import Additionals.Mushrooms;
import Additionals.Soup;
import Base.Subguey;
import Proteins.Beef;
import Proteins.Chicken;
import Proteins.Italian;
import Proteins.Tuna;
import Proteins.Turkey;
import Proteins.Veggie;
import Sizes.Subguey15;
import Sizes.Subguey30;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class SubgueyModel {
    private Subguey currentSub;
    private ArrayList<Subguey> cart = new ArrayList<Subguey>();
    private boolean newSub = true;

    public Subguey getCurrentSub() {
        return currentSub;
    }

    public void setCurrentSub(Subguey currentSub) {
        this.currentSub = currentSub;
    }

    public ArrayList<Subguey> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Subguey> cart) {
        this.cart = cart;
    }

    public boolean isNewSub() {
        return newSub;
    }

    public void setNewSub(boolean newSub) {
        this.newSub = newSub;
    }

    // Creation functions
    public void createSub15(){
        if (!newSub){
            int input = JOptionPane.showConfirmDialog(null, "Hay un Sub en proceso, ¿Desea eliminarlo e iniciar otro?");
            if (input == 0){ 
                this.currentSub = new Subguey15(); 
            }
        }else{
            this.currentSub = new Subguey15();
        }
    }
    
    public void createSub30(){
        if (!newSub){
            int input = JOptionPane.showConfirmDialog(null, "Hay un Sub en proceso, ¿Desea eliminarlo e iniciar otro?");
            if (input == 0){ 
                this.currentSub = new Subguey30(); 
            }
        }else{
            this.currentSub = new Subguey30();
        }
    }
    
    public void addSub(){
        int input = JOptionPane.showConfirmDialog(null, "Hay un Sub en proceso, ¿Desea agregarlo?");
        if (input == 0){
            this.cart.add(currentSub);
        }
    }
    
    //Proteins
    public void addBeef(){
        int input = JOptionPane.showConfirmDialog(null, "Está haciendolo de Beef, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Beef(this.currentSub);
        }
    }
    
    public void addChicken(){
        int input = JOptionPane.showConfirmDialog(null, "Está haciendolo de Pollo, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Chicken(this.currentSub);
        }
    }
    
    public void addItalian(){
        int input = JOptionPane.showConfirmDialog(null, "Está haciendolo Italiano, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Italian(this.currentSub);
        }
    }
    
    public void addTuna(){
        int input = JOptionPane.showConfirmDialog(null, "Está haciendolo de Atún, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Tuna(this.currentSub);
        }
    }
    
    public void addTurkey(){
        int input = JOptionPane.showConfirmDialog(null, "Está haciendolo de Pavo, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Turkey(this.currentSub);
        }
    }
    
    public void addVeggie(){
        int input = JOptionPane.showConfirmDialog(null, "Está haciendolo Veggie, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Veggie(this.currentSub);
        }
    }
    
    //Additionals
    public void addAvocado(){
        int input = JOptionPane.showConfirmDialog(null, "Está añadiendo Aguacate, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Avocado(this.currentSub);
        }
    }
    
    public void addDessert(){
        int input = JOptionPane.showConfirmDialog(null, "Está añadiendo un Postre, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Dessert(this.currentSub);
        }
    }
    
    public void addDoubleProtein(){
        int input = JOptionPane.showConfirmDialog(null, "Está añadiendo doble proteina, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new DoubleProtein(this.currentSub);
        }
    }
    
    public void addDrink(){
        int input = JOptionPane.showConfirmDialog(null, "Está añadiendo una bebida, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Drink(this.currentSub);
        }
    }
    
    public void addMushrooms(){
        int input = JOptionPane.showConfirmDialog(null, "Está añadiendo hongos, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Mushrooms(this.currentSub);
        }
    }
    
    public void addSoup(){
        int input = JOptionPane.showConfirmDialog(null, "Está añadiendo sopa, ¿Desea agregarlo?");
        if (input == 0){
            this.currentSub = new Soup(this.currentSub);
        }
    }
}
