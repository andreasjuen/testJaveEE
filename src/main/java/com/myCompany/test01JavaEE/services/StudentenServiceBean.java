

package com.myCompany.test01JavaEE.services;

import com.myCompany.test01JavaEE.model.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

@RequestScoped
@Alternative
public class StudentenServiceBean implements StudentenService  {
    
   @Override
    public List<Student> getAllStudenten() {
        return new ArrayList<Student>();
    }
  
}
