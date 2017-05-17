/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.data;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author andreasjuen
 */
public class Kalender {
    Calendar cal;

    public Kalender() {
       cal = Calendar.getInstance();
       cal.setTime(new Date());
    }
   
    public int getJahr()
    {
        return cal.get(Calendar.YEAR); 
    }
    
    public int getJahrZweistellig()
    {
        int jahr = cal.get(Calendar.YEAR);
        return jahr - 2000;              
    }
    
}
