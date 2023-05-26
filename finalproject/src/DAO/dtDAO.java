/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import koneksi.connector;
import model.*;
import view.*;
import implement.dtimplement;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class dtDAO implements dtimplement{
    
    Connection connection;
    
    final String cek = "select * from dtnasabah where no_kartu=? AND validthru=?";
    final String signup = "update dtnasabah set username=?, password=? where no_kartu=? AND validthru=?";
    final String bk = "select * from dtnasabah where no_rek=?";
    public dtDAO(){
        connection = connector.connection();
    }
    
    @Override
    public void cek(dtnasabah n) {
    PreparedStatement statement = null;
        try{
        statement = connection.prepareStatement(cek);
        statement.setString(1, n.getNo_kartu());
        statement.setInt(2, n.getValidthru());
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Data ditemukan. Silakan buat akun.");
            }else{
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan. Silakan buat rekening dulu di cabang terdekat.");
        }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void signup(dtnasabah a) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(signup);
            statement.setString(1, a.getUsername());
            statement.setString(2, a.getPassword());
            statement.setString(3, a.getNo_kartu());
            statement.setInt(4, a.getValidthru());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil buat akun!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal buat akun!");
        }
        
    }

    @Override
    public void back(dtnasabah c) {
        PreparedStatement statement = null;
        try{
        statement = connection.prepareStatement(bk);
        statement.setInt(1, c.getNo_rek());
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            beranda bd = new beranda();
            bd.ResultNama.setText(rs.getString("nama_nasabah"));
            bd.saldo.setText(String.valueOf(rs.getInt("info_saldo")));
            bd.setLocationRelativeTo(null);
            bd.setVisible(true);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
