/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetok;

import java.sql.Blob;

/**
 *
 * @author TEDDY
 */
public class Lit {

    public int getId_lit() {
        return id_lit;
    }

    public void setId_lit(int id_lit) {
        this.id_lit = id_lit;
    }

    public Blob getPhoto_lit() {
        return photo_lit;
    }

    public void setPhoto_lit(Blob photo_lit) {
        this.photo_lit = photo_lit;
    }
    
private int id_lit;
private Blob photo_lit;  
}
