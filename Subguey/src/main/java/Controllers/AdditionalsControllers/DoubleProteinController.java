/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.AdditionalsControllers;

import Controllers.SubgueyController;
import GUI.SubgueyModel;
import GUI.SubgueyView;
import java.awt.event.ActionEvent;

/**
 *
 * @author gabri
 */
public class DoubleProteinController extends SubgueyController {

    public DoubleProteinController(SubgueyView view, SubgueyModel model) {
        super(view, model);
    }

    @Override
    public void subscribe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.addDoubleProtein();
    }
    
}
