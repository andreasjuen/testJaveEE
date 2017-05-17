/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.controller;

import com.myCompany.test01JavaEE.data.StudentProducer;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named
public class StartseiteController implements Serializable {
    
    @Inject
    private StudentProducer studentProducer;
        
    public String doGoListStudenten() {
        return Pages.List_Studenten;
    }
    
    public String doGoEditStudent() {
        studentProducer.prepareAddStudent();
        return Pages.Edit_Student;
    }
}