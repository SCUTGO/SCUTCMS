package com.scutcms.DAO.access;

import com.scutcms.DAO.entity.Employee;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class EmployeeMapper {
    /**
     * 向数据库中添加职工信息
     * @param employee
     */
    public void insert(Employee employee){}

    /**
     * 更新职工信息
     * @param employee
     */
    public void update(Employee employee){}

    /**
     * 删除职工信息
     * @param employee
     */
    public void delete(Employee employee){}

    /**
     * 通过员工编号查找指定员工信息
     * @param employeeId
     * @return 如果数据库中存在该职工信息，则返回该对象；否则返回null
     */
    public Employee getEmployeeByEmployeeId(String employeeId){
        Employee employee=new Employee();
        return employee;
    }
}
