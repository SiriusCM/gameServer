package sirius.database.mysql.service;

import sirius.database.mysql.entity.Student;

import java.util.List;

public interface IStudentService {
	int deleteByPrimaryKey(byte[] uid);

	int insert(Student record);

	int insertSelective(Student record);

	Student selectByPrimaryKey(byte[] uid);

	List<Student> selectByCondition(Student record);

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);
}
