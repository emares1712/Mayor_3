/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewMayor;
import models.ModelMayor;
import controllers.ControllerMayor;

/**
 *
 * @author Emma Resendiz
 */
public class Main {
    private static ViewMayor view_mayor;
    private static ModelMayor model_mayor;
    private static ControllerMayor controller_mayor;
      public static void main(String er[]){
        model_mayor= new ModelMayor();
        view_mayor= new ViewMayor();
        controller_mayor = new ControllerMayor(view_mayor, model_mayor);
}
}