/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_pbo.controllers;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project_akhir_pbo.helper.DBHelper;
import project_akhir_pbo.models.AnggotaModel;
import project_akhir_pbo.models.TempKelompok;
import project_akhir_pbo.views.PesertaMainView;

/**
 *
 * @author Hp
 */
public class PesertaMainController {
    
    PesertaMainView v;
    private DefaultTableModel model;
    public PesertaMainController(){
        String[] header = {"Id", "Nama", "Umur"};
        model = new DefaultTableModel(header, 0);
        refreshTable();
        
        v = new PesertaMainView(this);
        v.getDataTable().setModel(model);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
    public void tambahData(String nama, String umur){
        if(nama.isEmpty() || umur.isEmpty()){
            JOptionPane.showMessageDialog(v, "Data harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            DBHelper helper = new DBHelper();
            if(helper.addNewAnggota(nama, TempKelompok.id, umur)){
                JOptionPane.showMessageDialog(v, "Berhasil menambahkan data!", "Success", JOptionPane.INFORMATION_MESSAGE);
                refreshTable();
            }else{
                JOptionPane.showMessageDialog(v, "Gagal menambahkan data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void refreshTable(){
        model.setRowCount(0);
        DBHelper helper = new DBHelper();
        
        List<AnggotaModel> data = helper.getAllAnggota(TempKelompok.id);
        data.forEach((m) -> {
            model.addRow(new Object[]{m.getId(), m.getNama(), m.getUmur()});
        });
    }
    
}
