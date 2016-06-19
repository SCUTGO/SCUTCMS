package com.scutcms.DAO.access;

import com.scutcms.DAO.entity.Salary;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class SalaryMapper {
    /**
     * 向数据库中保存工资信息
     * @param salary
     */
    public void insertSalary(Salary salary){}

    /**
     * 更新工资信息
     * @param salary
     */
    public void updateSalary(Salary salary){}

    /**
     * 删除工资信息
     * @param salary
     */
    public void deleteSalary(Salary salary){}

    /**
     * 通过员工工作编号查找工资信息
     * @param employeeId
     * @return 如果数据库中存在该工资信息，则返回工资的对象；否则返回null
     */
    public Salary getSalaryByEmployeeId(String employeeId){
        Salary salary=new Salary();
        return salary;
    }
}
