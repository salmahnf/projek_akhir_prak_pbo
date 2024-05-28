/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_pbo.controllers;

import views.AdminLoginView;

/**
 *
 * @author Hp
 */
public class AdminLoginController {
    
    AdminLoginView v;
    public AdminLoginController(){
        v = new AdminLoginView(this);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
}
