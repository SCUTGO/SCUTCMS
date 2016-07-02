package test.scutcms.DAO.access;

import com.scutcms.DAO.access.SalaryMapper;
import com.scutcms.DAO.entity.Salary;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class SalaryMapperTest {
    private SalaryMapper salaryMapper;
    @Before
    public void setUp() throws Exception {
        salaryMapper=new SalaryMapper();
    }

    @Test
    public void insertSalary() throws Exception {
        Salary salary=new Salary();
        salary.setEmployeeID("12313131313");
        salary.setSalary(12.3);
        Date date=new Date();
        salary.setSalary_DATE(date);
        salaryMapper.insertSalary(salary);
    }

    @Test
    public void updateSalary() throws Exception {
        Salary salary=new Salary();
        salary.setEmployeeID("12313131313");
        salary.setSalary(18.0);
        Date date=new Date();
        salary.setSalary_DATE(date);
        salaryMapper.updateSalary(salary);
    }

    @Test
    public void deleteSalary() throws Exception {

    }

    @Test
    public void getSalaryByEmployeeId() throws Exception {

    }

}