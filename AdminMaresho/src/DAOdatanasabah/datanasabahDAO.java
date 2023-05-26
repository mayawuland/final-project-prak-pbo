/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatanasabah;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.dataimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo
 */
public class datanasabahDAO implements dataimplement{

    Connection connection;
    
    final String select = "SELECT * FROM dtnasabah;";
    final String insert = "INSERT INTO dtnasabah (nama_nasabah, "
            + "no_kartu, validthru, no_hp, pin, info_saldo, no_rek) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE dtnasabah SET nama_nasabah=?, no_kartu=?, "
            + "validthru=?, no_hp=?, pin=?, info_saldo=?, no_rek=? "
            + "WHERE id_nasabah=?;";
    final String delete = "DELETE FROM dtnasabah WHERE id_nasabah=?;";
    
    public datanasabahDAO(){
        connection = connector.connection();
    }
    
    @Override
    public void insert(datanasabah k) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, k.getNama_nasabah());
            statement.setString(2, k.getNo_kartu());
            statement.setInt(3, k.getValidthru());
            statement.setString(4, k.getNo_hp());
            statement.setInt(5, k.getPin());
            statement.setInt(6, k.getInfo_saldo());
            statement.setInt(7, k.getNo_rek());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                k.setId_nasabah(rs.getInt(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datanasabah k) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, k.getNama_nasabah());
            statement.setString(2, k.getNo_kartu());
            statement.setInt(3, k.getValidthru());
            statement.setString(4, k.getNo_hp());
            statement.setInt(5, k.getPin());
            statement.setInt(6, k.getInfo_saldo());
            statement.setInt(7, k.getNo_rek());
            statement.setInt(8, k.getId_nasabah());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id_nasabah) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id_nasabah);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datanasabah> getAll() {
        List<datanasabah> dn = null;
       
       try{
           dn = new ArrayList<datanasabah>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(select);
           while(rs.next()){
                datanasabah akun = new datanasabah();
                akun.setId_nasabah(rs.getInt("id_nasabah"));
                akun.setNama_nasabah(rs.getString("nama_nasabah"));
                akun.setNo_kartu(rs.getString("no_kartu"));
                akun.setValidthru(rs.getInt("validthru"));
                akun.setNo_hp(rs.getString("no_hp"));
                akun.setPin(rs.getInt("pin"));
                akun.setInfo_saldo(rs.getInt("info_saldo"));
                akun.setNo_rek(rs.getInt("no_rek"));
                akun.setUsername(rs.getString("username"));
                akun.setPassword(rs.getString("password"));
                dn.add(akun);
           }
       }catch(SQLException ex){
           Logger.getLogger(datanasabahDAO.class.getName()).log(Level.SEVERE, null, ex);
       
       }
       
       return dn;
    }
}
