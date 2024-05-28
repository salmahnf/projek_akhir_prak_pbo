/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_pbo.controllers;

import project_akhir_pbo.helper.DBHelper;
import project_akhir_pbo.views.PesertaLoginView;

/**
 *
 * @author Hp
 */
public class PesertaLoginController {
    
    PesertaLoginView v;
    public PesertaLoginController(){
        v = new PesertaLoginView(this);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
    public void loginProcess(String name, String pass){
        DBHelper helper = new DBHelper();
        if(helper.checkPesertaLogin(name, pass)){
            new PesertaMainController();
        }else{
            //Masukin Error Handling disini
            System.out.println("Gagal Login");
        }
    }
    
    public void registerProcess(String name, String pass){
        DBHelper helper = new DBHelper();
        if(name.isEmpty() || pass.isEmpty()){
            //Masukin Error Handling disini
            System.out.println("Data tidak boleh kosong");
        }else{
            if(helper.addNewPeserta(name, pass)){
                new PesertaMainController();
            }else{
                //Masukin Error Handling disini
                System.out.println("Gagal Register");
            }
        }
    }
    
}
