package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeMapper;
import com.employee.model.Employee;
@Service
@Transactional
public class EmployeeServImpl implements EmployeeService {
	//private final  Logger logger = LoggerFactory.getLogger(EmployeeServImpl.class);

	@Autowired
	EmployeeMapper emplDao;

	public int update(Employee employee) {
		emplDao.updateEmployee(employee); return 0;
	}

	public Employee getEmployee(int empId) {
		Employee emp =
				 emplDao.getEmployee(empId); return emp;
	}

	public int deleteEmployee(int empId) {
		emplDao.deleteEmployee(empId); return 0;
	}

	public int saveEmployee(Employee employee) {
		emplDao.saveEmployee(employee); return 0;
	}

	public List<Employee> getAllEmployees() {
		return emplDao.getAllEmployees();
	}
	
}
