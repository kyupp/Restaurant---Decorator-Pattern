/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import GUI.SubgueyModel;
import GUI.SubgueyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gabri
 */
public abstract class SubgueyController implements ActionListener{
    protected SubgueyView view = new SubgueyView();
    protected SubgueyModel model = new SubgueyModel();

    public SubgueyController(SubgueyView view, SubgueyModel model) {
        this.view = view;
        this.model = model;
    }
    
    public abstract void subscribe();
}
