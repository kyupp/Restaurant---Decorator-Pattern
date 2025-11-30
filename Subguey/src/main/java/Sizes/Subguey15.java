/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sizes;

import Base.Size;
import Base.Subguey;

/**
 *
 * @author gabri
 */
public class Subguey15 implements Subguey {
    @Override
    public String getName() {
        return "Subguey";
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Sándwich de 15 cm";
    }

    @Override
    public Size getSize() {
        return Size.SMALL15;
    }
    
}
