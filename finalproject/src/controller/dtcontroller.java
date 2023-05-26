/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.dtDAO;
import implement.dtimplement;
import model.*;
import view.*;
/**
 *
 * @author ASUS
 */
public class dtcontroller {
    dtimplement impldata;
    verif frame; 
    infoakun frame2;
    transfer frame3;

    public dtcontroller(view.verif frame) {
        this.frame = frame;
        impldata = new dtDAO();
    }
    
    public dtcontroller(infoakun frame2) {
        this.frame2 = frame2;
        impldata = new dtDAO();
    }
    
    public dtcontroller(transfer frame3) {
        this.frame3 = frame3;
        impldata = new dtDAO();
    }
    
    public void cek(){
        dtnasabah dn = new dtnasabah();
        dn.setNo_kartu(frame.getNokartu().getText());
        int d = Integer.parseInt(frame.getValidthru().getText());
        dn.setValidthru(d);
        impldata.cek(dn);
    }
    
    public void signup(){
        dtnasabah da = new dtnasabah();
        da.setNo_kartu(frame.getNokartu().getText());
        int d = Integer.parseInt(frame.getValidthru().getText());
        da.setValidthru(d);
        da.setUsername(frame.getJusername().getText());
        da.setPassword(frame.getJpassword().getText());
        impldata.signup(da);
    }
    
    public void back(){
        dtnasabah da = new dtnasabah();
        int e = Integer.parseInt(frame3.getNrek().getText());
        da.setNo_rek(e);
        impldata.back(da);
    }
    
    public void back2(){
        dtnasabah da = new dtnasabah();
        int e = Integer.parseInt(frame2.getInorek().getText());
        da.setNo_rek(e);
        impldata.back(da);
    }
}
