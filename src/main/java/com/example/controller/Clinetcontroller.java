package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.modal.Admin;
import com.example.modal.Course;
import com.example.modal.Employee;
import com.example.modal.Student;
import com.example.service.Adminservice;
import com.example.service.CourseService;
import com.example.service.EmailManager;
import com.example.service.Employeeservice;
import com.example.service.Studentservice;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class Clinetcontroller {


	@Autowired
	private Employeeservice employeeservice;
	
	@Autowired 
	private Studentservice studentservice;
	
	@Autowired 
	private Adminservice adminservice;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	EmailManager emailManager;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	@GetMapping("/register")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeRegistration");
		return mv;
	}
	
	
	@PostMapping("customerRegistration")
	  public ModelAndView customerRegistration(HttpServletRequest request) {
	    ModelAndView mv = new ModelAndView();
	    String msg = null;
	    try {
	    	int employeeId = Integer.parseInt(request.getParameter("employeeId"));
	    	String firstName = request.getParameter("firstName");
	    	String lastName = request.getParameter("lastName");
	    	String email = request.getParameter("email");
	    	String department = request.getParameter("department");
	    	String gender = request.getParameter("gender");
	    	String contactNumber = request.getParameter("contactNumber");
	    	String status = request.getParameter("status");
	    	String address = request.getParameter("address");
	    	String city = request.getParameter("city");
	    	String password = request.getParameter("password");
	    	String confirmPassword = request.getParameter("confirmPassword");
	    	String joiningDate = request.getParameter("joiningDate");


	      
	      
	      Employee c = new Employee();
	      c.setFirstName(firstName);
	      c.setLastName(lastName);
	      c.setEmail(email);
	      c.setDepartment(department);
	      c.setGender(gender);
	      c.setContactNumber(contactNumber);
	      c.setStatus(status);
	      c.setAddress(address);
	      c.setCity(city);
	      c.setPassword(password);
	      c.setConfirmPassword(confirmPassword);
	      c.setJoiningDate(joiningDate);
	      
	      
	      msg = employeeservice.addcustomer(c);
	      mv.setViewName("sucess");
	        mv.addObject("message",msg);
	      
	    }
	    catch (Exception e) {
	      mv.setViewName("customerRegistration");
	      msg = "Registration Failed & Provide Valid Details";
	         mv.addObject("message",msg);
	    }
	    
	    return mv;
	  }
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeLogin");
		return mv;
	}
	
	
	@PostMapping("checkemplogin")
	public ModelAndView checkemplogin(HttpServletRequest request) {
		
		  String uname = request.getParameter("email"); 
		  String pwd = request.getParameter("password"); 
		   
		  Employee emp = employeeservice.Emplogin(uname, pwd); 
		  
		  String userEnteredCaptcha = request.getParameter("captcha");
		  
		  HttpSession session = request.getSession();
	
		  String storedCaptcha = (String)session.getAttribute("captchaCode");
		  
		  ModelAndView mv =new ModelAndView(); 
		  if(emp!=null && userEnteredCaptcha.equals(storedCaptcha)) { 
			  
			  
			  
		   mv.setViewName("employeeHome"); 
		  } 
		  else { 
		   mv.setViewName("employeeLogin"); 
		   mv.addObject("message", "Login Failed & try Again"); 
		  } 
		  return mv; 
	}
	
	@GetMapping("/facultyDisplay")
    public String facultyDisplay(Model model) {
        List<Employee> listemployee = employeeservice.getAll();
        model.addAttribute("listemployee", listemployee);
            
        return "facultyDisplay";
    }
	
	@GetMapping("/employeeHome")
	public String emphome()
	{
		return "employeeHome";
	}
	
	@GetMapping("/emplogout")
	public String emplogout()
	{
		return "home";
	}
	
	
	//==============StudentModule===================
	
	@GetMapping("/registerstudent")
	public ModelAndView index1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentRegistration");
		return mv;
	}
	
	@PostMapping("universityRegistration")
	  public ModelAndView universityRegistration(HttpServletRequest request) {
	    ModelAndView mv = new ModelAndView();
	    String msg = null;
	    try {
	    	int studentId = Integer.parseInt(request.getParameter("studentId"));
	    	String firstName = request.getParameter("firstName");
	    	String lastName = request.getParameter("lastName");
	    	String email = request.getParameter("email");
	    	String department = request.getParameter("department");
	    	String gender = request.getParameter("gender");
	    	String contactNumber = request.getParameter("contactNumber");
	    	String password = request.getParameter("password");
	    	String confirmPassword = request.getParameter("confirmPassword");
	    	String joiningDate = request.getParameter("joiningDate");


	      
	      
	      Student c = new Student();
	      c.setFirstName(firstName);
	      c.setLastName(lastName);
	      c.setEmail(email);
	      c.setDepartment(department);
	      c.setGender(gender);
	      c.setContactNumber(contactNumber);
	      c.setPassword(password);
	      c.setConfirmPassword(confirmPassword);
	      c.setJoiningDate(joiningDate);
	      
	      
	      
	        String fromEmail = "2100031582cseh@gmail.com";
	        String toEmail = email; // Use the email entered in the form
	        String subject = "Welcome to Student Course Registration System";
	        String text = "Your registration is successful. Your password is: " + password;
	          
	        // Send the email
	        String emailResult = emailManager.sendEmail(fromEmail, toEmail, subject, text);
	        
	        msg = studentservice.addstudent(c);
		    mv.setViewName("sucess");
		    mv.addObject("message",msg);
	      
	    }
	    catch (Exception e) {
	      mv.setViewName("universityRegistration");
	      msg = "Registration Failed & Provide Valid Details";
	         mv.addObject("message",msg);
	    }
	    
	    return mv;
	  }
	
	@GetMapping("/loginstu")
	public ModelAndView login1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentLogin");
		return mv;
	}
	
	@PostMapping("checkstdlogin")
	public ModelAndView checkstdlogin(HttpServletRequest request) {
		
		  String uname = request.getParameter("email"); 
		  String pwd = request.getParameter("password"); 
		   
		  Student stu = studentservice.Stdlogin(uname, pwd); 
		  
		  String userEnteredCaptcha = request.getParameter("captcha");
		  
		  HttpSession session = request.getSession();
	
		  String storedCaptcha = (String)session.getAttribute("captchaCode");
		  
		  ModelAndView mv =new ModelAndView(); 
		  if(stu!=null && userEnteredCaptcha.equals(storedCaptcha)) { 
			  
			  
			  
		   mv.setViewName("studentHome"); 
		  } 
		  else { 
		   mv.setViewName("studentLogin"); 
		   mv.addObject("message", "Login Failed & try Again"); 
		  } 
		  return mv; 
	}
	
	
	@GetMapping("/studentDisplay")
    public String studentDisplay(Model model) {
        List<Student> liststudent = studentservice.getAll();
        model.addAttribute("liststudent", liststudent);
            
        return "studentDisplay";
    }
	
	@GetMapping("/addcourse")
    public String displayStudentInfo(Model model) {
		List<Course> listcourse = courseService.getAll();
	    model.addAttribute("listcourse", listcourse);
        
        return "addcourse";
    }
	
	@GetMapping("/stdlogout")
	public String log()
	{
		return "home";
	}
	
	@GetMapping("/studentResult")
	public String searchStudent(@RequestParam Integer studentId, Model model) {
	    Optional<Student> student = studentservice.findStudentById(studentId);
	    if (student.isPresent()) {
	        model.addAttribute("student", student.get());
	        return "studentResult"; // Return the "studentResult.jsp" view.
	    } else {
	        return "studentNotFound"; // You can create a "studentNotFound.jsp" view for this case.
	    }
	}
	
	@GetMapping("/amountToPay")
	public String amount()
	{
		return "Payment";
	}
	
	@GetMapping("/Payment")
	public String payment()
	{
		return "Payment";
	}

	
	//==============Admin-Module===================
	@GetMapping("/loginadmin")
	public ModelAndView loginadm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminLogin");
		return mv;
	}
	
	@PostMapping("checkadmlogin")
	public ModelAndView checkadmlogin(HttpServletRequest request) {
		
		  String uname = request.getParameter("email"); 
		  String pwd = request.getParameter("password"); 
		  
		  String userEnteredCaptcha = request.getParameter("captcha");
		  
		  HttpSession session = request.getSession();
	
		String storedCaptcha = (String)session.getAttribute("captchaCode");
		  
		  Admin own = adminservice.Admlogin(uname, pwd);
		   
		  ModelAndView mv =new ModelAndView(); 
		  if(own!=null && userEnteredCaptcha.equals(storedCaptcha)) { 
			  
			  
			  
		   mv.setViewName("adminHome"); 
		  } 
		  else { 
		   mv.setViewName("adminLogin"); 
		   mv.addObject("message", "Login Failed & try Again"); 
		  } 
		  return mv; 
	}
	
	@GetMapping("/admlogout")
	public String admlog()
	{
		return "home";
	}
	
	
	//***********courses**********
	
	@GetMapping("/courseRegistration")
	public ModelAndView registercourse() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("courseRegistration");
		return mv;
	}
	
	@PostMapping("stdcourseRegistration")
	  public ModelAndView stdcourseRegistration(HttpServletRequest request) {
	    ModelAndView mv = new ModelAndView();
	    String msg = null;
	    try {
	    	int courseId = Integer.parseInt(request.getParameter("courseId"));
	    	String courseCode = request.getParameter("courseCode");
	    	String courseName = request.getParameter("courseName");


	      
	      
	       Course c = new Course();
	       c.setCourseId(courseId);
	       c.setCourseCode(courseCode);
	       c.setCourseName(courseName);
	      
	      
	      msg = courseService.addCourse(c);
	      mv.setViewName("sucess");
	        mv.addObject("message",msg);
	      
	    }
	    catch (Exception e) {
	      mv.setViewName("stdcourseRegistration");
	      msg = "Registration Failed & Provide Valid Details";
	         mv.addObject("message",msg);
	    }
	    
	    return mv;
	  }
	
	@GetMapping("/courseList")
	public String getAllCourses(Model model) {
	    List<Course> listcourse = courseService.getAll();
	    model.addAttribute("listcourse", listcourse);
	    return "courseList"; // You can define a course list view (e.g., courseList.html) to display the courses.
	}
	
	
	
	
	//*******MAP*********
	@GetMapping("/index")
	public String map()
	{
		return "index";
	}
}
