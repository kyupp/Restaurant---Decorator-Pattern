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
public class Italian extends SubgueyDecorator {

    public Italian(Subguey subguey) {
        super(subguey);
    }
    
    @Override
    public String getName(){
        return super.getName() + " Italiano";
    }
    
    @Override
    public String getDescription(){
        return super.getDescription() + ", Italiano";
    }
    
    @Override
    public double getCost(){
        if(getSize() == Size.SMALL15){
            return super.getCost()+9;
        }else{
            return super.getCost()+16;
        } 
    } 
}
