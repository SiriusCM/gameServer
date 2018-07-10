package sirius.channer.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sirius.database.mysql.entity.Student;
import sirius.database.mysql.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api/Student")
public class StudentController {
	@Autowired
	private IStudentService service;

	@GetMapping()
	public String Get() {
		List<Student> students = service.selectByCondition(new Student());
		return students.toString();
	}
}