/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Controllers.AdditionalsControllers.AvocadoController;
import Controllers.AdditionalsControllers.DoubleProteinController;
import Controllers.AdditionalsControllers.MushroomsController;
import Controllers.AdditionalsControllers.SoupController;
import Controllers.AdditionalsControllers.DrinkController;
import Controllers.AdditionalsControllers.DessertController;
import Controllers.ProteinControllers.BeefController;
import Controllers.ProteinControllers.ChickenController;
import Controllers.ProteinControllers.ItalianController;
import Controllers.ProteinControllers.TunaController;
import Controllers.ProteinControllers.VeggieController;
import Controllers.ProteinControllers.TurkeyController;
import GUI.SubgueyModel;
import GUI.SubgueyView;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class ControllerFactory {
    SubgueyView view = new SubgueyView();
    SubgueyModel model = new SubgueyModel();
    
    ArrayList<SubgueyController> controllers = new ArrayList<>();

    public ControllerFactory(SubgueyView view, SubgueyModel model) {
        this.view = view;
        this.model = model;
        
        // Cada controller
        CreateSub15Controller createSub15Controller = new CreateSub15Controller(view, model);
        CreateSub30Controller createSub30Controller = new CreateSub30Controller(view, model);
        //Proteins
        BeefController beefController = new BeefController(view, model);
        ChickenController chickenController = new ChickenController(view, model);
        ItalianController italianController = new ItalianController(view, model);
        TunaController tunaController = new TunaController(view, model);
        TurkeyController turkeyController = new TurkeyController(view, model);
        VeggieController veggieController = new VeggieController(view, model);
        
        //Additionals
        AvocadoController avocadoController = new AvocadoController(view, model);
        DessertController dessertController = new DessertController(view, model);
        DoubleProteinController doubleProteinController = new DoubleProteinController(view, model);
        DrinkController drinkController = new DrinkController(view, model);
        MushroomsController mushroomsController = new MushroomsController(view, model);
        SoupController soupController = new SoupController(view, model);
          
        // Agregar al ArrayList
        controllers.add(createSub15Controller);
        controllers.add(createSub30Controller);
        
        controllers.add(beefController);
        controllers.add(chickenController);
        controllers.add(italianController);
        controllers.add(tunaController);
        controllers.add(turkeyController);
        controllers.add(veggieController);
        
        controllers.add(avocadoController);
        controllers.add(dessertController);
        controllers.add(doubleProteinController);
        controllers.add(drinkController);
        controllers.add(mushroomsController);
        controllers.add(soupController);
       
    }
    
    public ArrayList<SubgueyController> getControllers() {
        return controllers;
    }

    public void subscribe() {
        for (SubgueyController controller : controllers) {
            controller.subscribe();
        }
    }

}
