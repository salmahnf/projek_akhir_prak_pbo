/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_pbo.controllers;

import project_akhir_pbo.views.KelompokDetailView;

/**
 *
 * @author Hp
 */
public class KelompokDetailController {
    
    KelompokDetailView v;
    public KelompokDetailController(){
        v = new KelompokDetailView(this);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
}
