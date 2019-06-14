package th.co.cdgs.department;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;

public class DepartmentDBTest {

	@Test
	public void getConnectionShouldBeNotNull() throws SQLException {
		DepartmentDB department = new DepartmentDB();
		assertNotNull(department.getConnection());
	}

	@Test
	public void getDepartmentShouldBeNotNull() throws SQLException {
		DepartmentDB departmentDB = new DepartmentDB();
		assertNotNull(departmentDB.getDepartmentByCode("001"));
	}

	@Test
	public void getDepartmentsShouldBeNotEmpty() throws SQLException {
		DepartmentDB departmentDB = new DepartmentDB();
		assertFalse(departmentDB.getDepartments().isEmpty());
	}

	@Test
	public void insertDepartmentsShouldBeGet1() throws SQLException {
		DepartmentDB departmentDB = new DepartmentDB();
		Department department = new Department();
		department.setDepartmentCode("999");
		department.setDepartmentName("test-insert");
		assertEquals(1, departmentDB.insertDepartment(department));

		departmentDB.deleteDepartment("999");
	}

	@Test
	public void updateDepartmentsShouldBeGet1() throws SQLException {
		DepartmentDB departmentDB = new DepartmentDB();
		Department department = new Department();
		department.setDepartmentCode("999");
		department.setDepartmentName("test-insert");
		departmentDB.insertDepartment(department);
		department.setDepartmentName("test-update");
		assertEquals(1, departmentDB.updateDepartment(department));

		departmentDB.deleteDepartment("999");
	}

	@Test
	public void deleteDepartmentsShouldBeGet1() throws SQLException {
		DepartmentDB departmentDB = new DepartmentDB();
		Department department = new Department();
		department.setDepartmentCode("999");
		department.setDepartmentName("test-insert");
		departmentDB.insertDepartment(department);
		assertEquals(1, departmentDB.deleteDepartment("999"));
	}
}