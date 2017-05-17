/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.model;

import com.myCompany.test01JavaEE.data.Kalender;

public class Student {
    
    private static long idOlt = 0;
    private Kalender kalender = new Kalender();
    
    private static final int uniNummer = 30;
    private long matrikelnummer;
    private String nachname;
    private String vorname;
    private String strasseHausnr;
    private int plz;
    private String ort;

    public Student() {            
        int jahr = kalender.getJahrZweistellig();
        String abc;
        if(idOlt < 1000)
        {
            abc = jahr+""+uniNummer+""+""+0+""+0+""+idOlt;
        }
        else
            abc = jahr+""+uniNummer+""+idOlt;
        
        matrikelnummer = Integer.parseInt(abc);
        
        idOlt++;
    }

    public long getMatrikelnummer() {
        return matrikelnummer;
    }

    public static long getIdOlt() {
        return idOlt;
    }


    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getStrasseHausnr() {
        return strasseHausnr;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setMatrikelnummer(long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public static void setIdOlt(long idOlt) {
        Student.idOlt = idOlt;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setStrasseHausnr(String strasseHausnr) {
        this.strasseHausnr = strasseHausnr;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }   
}