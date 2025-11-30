/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proteins;

import Base.Size;
import Base.Subguey;
import Decorator.SubgueyDecorator;

/**
 *
 * @author gabri
 */
public class Veggie extends SubgueyDecorator {

    public Veggie(Subguey subguey) {
        super(subguey);
    }
    
    @Override
    public String getName(){
        return super.getName() + " Veggie";
    }
    
    @Override
    public String getDescription(){
        return super.getDescription() + ", Veggie";
    }
    
    @Override
    public double getCost(){
        if(getSize() == Size.SMALL15){
            return super.getCost()+8;
        }else{
            return super.getCost()+14;
        } 
    } 
}
