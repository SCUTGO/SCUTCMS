package com.scutcms.personnel;

import com.scutcms.DAO.entity.Attendance;
import com.scutcms.DAO.entity.Employee;
import com.scutcms.DAO.entity.Incentive;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class EmployeeService {
    /**
     * 检查员工信息的合法性，如果合法，则添加到数据库
     * @param employee
     */
    public void insert(Employee employee){}

    /**
     * 更新员工信息
     * @param employee
     */
    public void update(Employee employee){}

    /**
     * 删除员工信息
     * @param employee
     */
    public void delete(Employee employee){}

    /**
     * 查找员工的信息
     * @param employeeID
     * @return 如果该员工存在，则返回该对象；否则，返回null
     */
    public Employee getEmployee(String employeeID){
        Employee employee=new Employee();
        return employee;
    }

    /**
     * 员工签到
     * @param attendance
     */
    public void sign(Attendance attendance){}

    /**
     * 员工请假
     */
    public void askForLeave(){}

    /**
     * 添加奖惩
     * @param incentive
     */
    public void addIncentive(Incentive incentive){}

    /**
     * 计算员工工资
     * @return 员工工资
     */
    public double calculateSalary(){
        double salary=0;
        return salary;
    }
}
