/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.controller;

import com.myCompany.test01JavaEE.data.StudentProducer;
import com.myCompany.test01JavaEE.data.StudentenListProducer;
import com.myCompany.test01JavaEE.model.Student;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named
public class EditStudentController implements Serializable{
       
	@Inject
	private Event<Student> studentAddEvent;   
    
	@Inject
	private StudentProducer studentProducer;
        
        public String doSave() {
		//studentenListProducer.getStudenten().add(studentProducer.getSelectedStudent());
                studentAddEvent.fire(studentProducer.getSelectedStudent());
		return Pages.startseite;
	}

	public String doCancel() {
		return Pages.startseite;
	}
}