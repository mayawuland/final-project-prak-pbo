/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdatanasabah.datanasabahDAO;
import DAOImplement.dataimplement;
import model.*;
import view.*;
/**
 *
 * @author Lenovo
 */
public class datacontroller {
    admin frame;
    dataimplement impldata;
    List<datanasabah> dn;
    
    public datacontroller(admin frame){
        this.frame = frame;
        impldata = new datanasabahDAO();
        dn = impldata.getAll();   
    }
    
    public void isitabel(){
        dn = impldata.getAll();
        modeltabel ma = new modeltabel(dn);
        frame.getTabelData().setModel(ma); 
    }
    
    public void insert(){
       datanasabah dn = new datanasabah();
       dn.setNama_nasabah(frame.getJTnamanasabah().getText());
       dn.setNo_kartu(frame.getJTnokartu().getText());
       int v = Integer.parseInt(frame.getJTvalidthru().getText());
       dn.setValidthru(v);
       dn.setNo_hp(frame.getJTnohp().getText());
       int p = Integer.parseInt(frame.getJTpin().getText());
       dn.setPin(p);
       int is = Integer.parseInt(frame.getJTinfosaldo().getText());
       dn.setInfo_saldo(is);
       int nr = Integer.parseInt(frame.getJTnorek().getText());
       dn.setNo_rek(nr);
       impldata.insert(dn);
    }
     
    public void update(){
       datanasabah dn = new datanasabah();
       dn.setNama_nasabah(frame.getJTnamanasabah().getText());
       dn.setNo_kartu(frame.getJTnokartu().getText());
       int v = Integer.parseInt(frame.getJTvalidthru().getText());
       dn.setValidthru(v);
       dn.setNo_hp(frame.getJTnohp().getText());
       int p = Integer.parseInt(frame.getJTpin().getText());
       dn.setPin(p);
       int is = Integer.parseInt(frame.getJTinfosaldo().getText());
       dn.setInfo_saldo(is);
       int nr = Integer.parseInt(frame.getJTnorek().getText());
       dn.setNo_rek(nr);
       dn.setId_nasabah(Integer.parseInt(frame.getJTidnasabah().getText()));
       impldata.update(dn);
    }
    
    public void delete(){
        int dl = Integer.parseInt(frame.getJTidnasabah().getText());
        impldata.delete(dl);
    }
    
}
