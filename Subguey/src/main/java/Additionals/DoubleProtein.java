/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Additionals;

import Base.Size;
import Base.Subguey;
import Decorator.SubgueyDecorator;

/**
 *
 * @author gabri
 */
public class DoubleProtein extends SubgueyDecorator {

    public DoubleProtein(Subguey subguey) {
        super(subguey);
    }
    
    @Override
    public String getDescription(){
        return super.getDescription() + ", Doble Proteína";
    }
    
    @Override
    public double getCost(){
        if(getSize() == Size.SMALL15){
            return super.getCost()+4.5;
        }else{
            return super.getCost()+8;
        } 
    } 
}
