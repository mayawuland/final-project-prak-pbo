/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lenovo
 */
public class modeltabel extends AbstractTableModel{
    
    List<datanasabah> dn;
    
    public modeltabel(List<datanasabah>dn){
        this.dn = dn;
    }
    
    @Override
    public int getRowCount() {
        return dn.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID NASABAH";
            case 1:
                return "NAMA NASABAH";
            case 2:
                return "NO KARTU"; 
            case 3:
                return "VALIDTHRU";    
            case 4: 
                return "NO HP"; 
            case 5:
                return "PIN";
            case 6:
                return "INFO SALDO";
            case 7:
                return "NO REKENING";
            case 8:
                return "USERNAME";
            case 9:
                return "PASSWORD";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dn.get(row).getId_nasabah();
            case 1:
                return dn.get(row).getNama_nasabah();
            case 2:
                return dn.get(row).getNo_kartu(); 
            case 3:
                return dn.get(row).getValidthru();     
            case 4:
                return dn.get(row).getNo_hp();
            case 5:
                return dn.get(row).getPin(); 
            case 6:
                return dn.get(row).getInfo_saldo(); 
            case 7:
                return dn.get(row).getNo_rek(); 
            case 8:
                return dn.get(row).getUsername(); 
            case 9:
                return dn.get(row).getPassword();
            default:
                return null;
        }
    }
}
