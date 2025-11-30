/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

import Base.Size;
import Base.Subguey;

/**
 *
 * @author gabri
 */
public class SubgueyDecorator implements Subguey {
    private Subguey subguey;
    
    public SubgueyDecorator(Subguey subguey) {
        this.subguey = subguey;
    }
    
    @Override
    public String getName() {
        return subguey.getName();
    }

    @Override
    public double getCost() {
        return subguey.getCost();
    }

    @Override
    public String getDescription() {
        return subguey.getDescription();
    }

    @Override
    public Size getSize() {    
        return subguey.getSize();
    }
    
}
