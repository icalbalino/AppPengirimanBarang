/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
/**
 *
 * @author user
 */
public class Koneksi {
    Connection con;
    String connectionUrl = "jdbc:mysql://localhost:3306/db_pengiriman_barang";
    
    public void kon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionUrl, "root", "");
            System.out.println("koneksi berhasil");
        } catch (Exception  e) {
            System.out.println("koneksi gagal" + e);
        }
    }
    
    public Koneksi(){}

    public Koneksi(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

//    public String getConnectionUrl() {
//        return connectionUrl;
//    }
//    public void setConnectionUrl(String connectionUrl) {
//        this.connectionUrl = connectionUrl;
//    }
}
