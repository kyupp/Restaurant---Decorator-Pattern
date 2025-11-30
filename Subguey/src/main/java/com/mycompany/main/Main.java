/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Aditionals.Avocado;
import Aditionals.Drink;
import Base.Subguey;
import Proteins.Beef;
import Sizes.Subguey30;

/**
 *
 * @author gabri
 */
public class Main{
    public static void main(String[] args) {
        Subguey sub = new Subguey30();
        sub = new Beef(sub);
        sub = new Avocado(sub);
        sub = new Drink(sub);
        
        System.out.println(sub.getName());
        System.out.println(sub.getCost());
        System.out.println(sub.getDescription());
        System.out.println(sub.getSize());
    }
}
