
package com.myCompany.test01JavaEE.data;

import com.myCompany.test01JavaEE.model.Student;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@SessionScoped
public class StudentProducer implements Serializable{
	
	private Student student;

	@Produces
        @Named
        public Student getSelectedStudent() {
		return student;
	}
        
	public void setSelectedStudent(Student student) {
		this.student = student;
	}
	
	public void prepareAddStudent(){
		this.student = new Student();
	}
}




