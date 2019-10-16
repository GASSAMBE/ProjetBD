/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetok;

/**
 *
 * @author TEDDY
 */
public class Medicament {

    public int getId_medicament() {
        return id_medicament;
    }

    public void setId_medicament(int id_medicament) {
        this.id_medicament = id_medicament;
    }

    public String getNom_medicament() {
        return nom_medicament;
    }

    public void setNom_medicament(String nom_medicament) {
        this.nom_medicament = nom_medicament;
    }

    public String getDescrip_medicament() {
        return descrip_medicament;
    }

    public void setDescrip_medicament(String descrip_medicament) {
        this.descrip_medicament = descrip_medicament;
    }

    public String getVoie_medicament() {
        return voie_medicament;
    }

    public void setVoie_medicament(String voie_medicament) {
        this.voie_medicament = voie_medicament;
    }

    public String getDosage_medicament() {
        return dosage_medicament;
    }

    public void setDosage_medicament(String dosage_medicament) {
        this.dosage_medicament = dosage_medicament;
    }

    public String getUnité_jour() {
        return unité_jour;
    }

    public void setUnité_jour(String unité_jour) {
        this.unité_jour = unité_jour;
    }
    
    private int id_medicament;
    private String nom_medicament;
    private String descrip_medicament;
    private String voie_medicament;
    private String dosage_medicament;
    private String unité_jour;
}
