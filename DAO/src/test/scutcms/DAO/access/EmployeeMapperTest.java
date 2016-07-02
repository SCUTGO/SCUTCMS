package test.scutcms.DAO.access;

import com.scutcms.DAO.access.EmployeeMapper;
import com.scutcms.DAO.entity.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class EmployeeMapperTest {
    private EmployeeMapper employeeMapper;
    @Before
    public void setUp() throws Exception {
        employeeMapper=new EmployeeMapper();
    }

    @Test
    public void insert() throws Exception {
        Employee employee=new Employee();
        employee.setSfzh("2131231231");
        employee.setSex("男");
        employee.setTelephone("123123");
        employee.setPositionNname("厨师");
        employee.setName("zhangsan");
        Date date=new Date();
        employee.setEnter_time(date);
        employee.setAddress("1w");
        employee.setEmployeeId("1313131");
        employee.setAge(22);
        employeeMapper.insert(employee);
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void getEmployeeByEmployeeId() throws Exception {

    }

}