package main.java.studentlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDao {
	@Autowired
	private HibernateTemplate template;

	//public HibernateTemplate getTemplate() {
		//return template;
	//}

	//public void setTemplate(HibernateTemplate template) {
		//this.template = template;
	//}
  public void saveStudent(Student s){
	  template.save(s);
  }
  public void updateStudent(Student s){
	  template.update(s);
  }
  public void deleteStudent(Student s){
	  template.delete(s);
  }
  public List<Student> getStudents(){
	  List<Student> list=new ArrayList<Student>();
	  list=template.loadAll(Student.class);
	  return list;
  }
}
