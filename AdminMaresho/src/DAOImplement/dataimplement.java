/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.*;
/**
 *
 * @author Lenovo
 */
public interface dataimplement {
    public void insert(datanasabah k);
    public void update(datanasabah k);
    public void delete(int id_nasabah);
    public List<datanasabah>getAll(); 
}
