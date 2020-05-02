/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.uts.npm255.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ADE
 */
@Entity
@Table(name = "kursus")
public class Kursus {
    @Id
    @Column(name = "kursusid")
    private String kursusID;
    
    @Column(name = "nama")
    private String nama;
    
    @Column(name = "durasi")
    private int durasi;
    
    @Column(name = "instruktur")
    private String instruktur;
    
    @Column(name = "kategori")
    private String kategori;
    
    public Kursus(){
    }
    
    public Kursus(String kursusID, String nama, int durasi, String instruktur, String kategori){
        this.kursusID = kursusID;
        this.nama = nama;
        this.durasi = durasi;
        this.instruktur = instruktur;
        this.kategori = kategori;
    }

    public String getKursusID() {
        return kursusID;
    }

    public void setKursusID(String kursusID) {
        this.kursusID = kursusID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getInstruktur() {
        return instruktur;
    }

    public void setInstruktur(String instruktur) {
        this.instruktur = instruktur;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}
