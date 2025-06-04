/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbc1;

import db.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author crist
 */
public class Jdbc2_VisualizandoDadosNoBancoDeDados {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM DEPARTMENT");
            
            while(rs.next()){
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
            
        }catch(SQLException e){
                e.printStackTrace();
                }finally{
            
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnetion();
        }
        
    }
}
