/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aditionals;

import Base.Size;
import Base.Subguey;
import Decorator.SubgueyDecorator;

/**
 *
 * @author gabri
 */
public class Soup extends SubgueyDecorator {

    public Soup(Subguey subguey) {
        super(subguey);
    }
    
    @Override
    public String getDescription(){
        return super.getDescription() + ", Soup";
    }
    
    @Override
    public double getCost(){
        if(getSize() == Size.SMALL15){
            return super.getCost()+4.2;
        }else{
            return super.getCost()+4.2;
        } 
    } 
}
