package main.java.studentlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/studentlist")
public class StudentListController {
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView listStudents(){
		Map<String,List<Student>> modelData=new HashMap<String,List<Student>>();
		modelData.put("students", studentDao.getStudents());
		return new ModelAndView("studentlist",modelData);
		}
	
	@RequestMapping(params = "fdAction=createStudentForm", method = RequestMethod.POST)
	public ModelAndView showCreateStudentForm() {
		Student student=new Student();
		ModelMap modelData = new ModelMap();
		modelData.addAttribute(student);
		return new ModelAndView("createStudentForm", modelData);
	}
	
	@RequestMapping(params="fdAction=create", method=RequestMethod.POST)
	public ModelAndView createStudent(@RequestParam Map<String,String> params){
		String name=params.get("name");
		String university=params.get("university");
		String totalMarks=params.get("totalMarks");
		Student student=new Student();
		student.setName(name);
		student.setUniversity(university);
		student.setTotalMarks(totalMarks);
		studentDao.saveStudent(student);
		return new ModelAndView("redirect:/studentlist/list");
		}
	
	@RequestMapping(params="fdAction=edit",method=RequestMethod.POST)
	public ModelAndView editStudent(@RequestParam Map<String,String> params){
		String rollNo=params.get("rollNo");
		String name=params.get("name");
		String university=params.get("university");
		String totalMarks=params.get("totalMarks");
		Student student=new Student();
		student.setRollNo(Integer.parseInt(rollNo));
		student.setName(name);
		student.setUniversity(university);
		student.setTotalMarks(totalMarks);
		studentDao.updateStudent(student);
		return new ModelAndView("redirect:/studentlist/list");
		}
	
	
	
	@RequestMapping(params="fdAction=delete", method=RequestMethod.GET)
	public ModelAndView deleteStudent(@RequestParam(value="rollNo") int no){
		Student student=new Student();
		student.setRollNo(no);
		studentDao.deleteStudent(student);
		return new ModelAndView("redirect:/studentlist/list");
	}
	
	@RequestMapping(params = "fdAction=view", method = RequestMethod.GET)
	public ModelAndView viewStudentDetails(HttpServletRequest request) {
		Student student=new Student();
		String rollNo=request.getParameter("rollNo");
		student.setRollNo(Integer.parseInt(rollNo));
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute(student);
		return new ModelAndView("editStudentForm", modelMap);
	}
 
}
