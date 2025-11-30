/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import GUI.SubgueyModel;
import GUI.SubgueyView;
import java.awt.event.ActionEvent;

/**
 *
 * @author gabri
 */
public class CreateSub30Controller extends SubgueyController {
    public CreateSub30Controller(SubgueyView view, SubgueyModel model) {
        super(view, model);
    }

    @Override
    public void subscribe() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.model.createSub30();
    }
}
