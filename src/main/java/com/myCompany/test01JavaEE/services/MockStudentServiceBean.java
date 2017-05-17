/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.services;

import com.myCompany.test01JavaEE.model.Student;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;


@RequestScoped
public class MockStudentServiceBean implements StudentenService {
   
    @Override
    public List<Student> getAllStudenten()
    {
       List<Student> studenten = new ArrayList();
       
       Student student01  = new Student();
       student01.setNachname("Juen");
       student01.setVorname("Andreas");
       student01.setOrt("Flieﬂ");
       student01.setPlz(1234);
       student01.setStrasseHausnr("Eichholz 361");
       
       Student student02  = new Student();
       student02.setNachname("Juen");
       student02.setVorname("Andreas");
       student02.setOrt("Flieﬂ");
       student02.setPlz(1234);
       student02.setStrasseHausnr("Eichholz 361");
       
       studenten.add(student01);
       studenten.add(student02);
       
       return studenten;  
    }
}
