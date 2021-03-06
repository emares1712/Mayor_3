/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewMayor;
import models.ModelMayor;
/**
 *
 * @author Emma Resendiz
 */
public class ControllerMayor{
    ViewMayor view_mayor;
    ModelMayor model_mayor;
    public ControllerMayor(ViewMayor view_mayor, ModelMayor model_mayor){
        this.view_mayor = view_mayor;
        this.model_mayor = model_mayor;
        view_mayor.jbtn_mayor.addActionListener(e ->jbtn_mayor_click());
        initView();
    }

    public void initView(){
        view_mayor.jtf_n1.setText(String.valueOf(model_mayor.getN1()));
        view_mayor.jtf_n2.setText(String.valueOf(model_mayor.getN2()));
        view_mayor.jtf_n3.setText(String.valueOf(model_mayor.getN3()));
        view_mayor.jtf_m.setText(String.valueOf(model_mayor.getM()));
        view_mayor.setVisible(true);
    }
    public void jbtn_mayor_click(){
        model_mayor.setN1(Integer.parseInt(view_mayor.jtf_n1.getText()));   
        model_mayor.setN2(Integer.parseInt(view_mayor.jtf_n2.getText()));
        model_mayor.setN3(Integer.parseInt(view_mayor.jtf_n3.getText()));   
        model_mayor.mayor();
        view_mayor.jtf_m.setText(String.valueOf(model_mayor.getM()));
    
    }
}


