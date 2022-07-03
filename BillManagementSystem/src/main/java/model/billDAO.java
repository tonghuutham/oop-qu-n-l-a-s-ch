/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author tongh
 */
public interface billDAO {
    public List<bill> getAllbill();
    public bill getID(String ID);
    public void addbill(bill e);
    public void updatebill(bill e);
    
    
}
