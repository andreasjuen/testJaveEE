
package com.myCompany.test01JavaEE.data;

import com.myCompany.test01JavaEE.model.Student;
import com.myCompany.test01JavaEE.services.StudentenService;
import com.myCompany.test01JavaEE.util.Events.Added;
import com.myCompany.test01JavaEE.util.Events.Deleted;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@SessionScoped
public class StudentenListProducer implements Serializable{
    
    private List<Student> studenten;
    
    @Inject 
    private StudentenService studentenService;
    
    @PostConstruct
    public void init() {
        studenten = studentenService.getAllStudenten();
    }
    
    /* 
    public StudentenListProducer() {
        this.studenten = produceData();
    }
    */
    
    private List<Student> produceData()
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

    public void onCampaignAdded(@Observes Student student) {
        getStudenten().add(student);
    }
       
    @Produces
    @Named
    public List<Student> getStudenten() {
        return studenten;
    }  
}























/*

package com.myCompany.test01JavaEE.data;

import com.myCompany.test01JavaEE.model.Student;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@SessionScoped
@Named
public class StudentenListProducer implements Serializable{
    
    private List<Student> studenten;
    
    @Inject 
    private StudentenService studentenService;


    public StudentenListProducer() {
        this.studenten = produceData();
    }
    
    private List<Student> produceData()
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

    public List<Student> getStudenten() {
        return studenten;
    }
    
    
}

*/