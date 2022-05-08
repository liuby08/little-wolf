package com.atguigu.rest.controller;

import com.atguigu.rest.bean.Employee;
import com.atguigu.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //用于显示员工列表
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployeeList(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        System.out.println(model);
        return "employee_list";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";//使用重定向，地址栏显示新的地址 /employee，不显示id
    }


    //跳转到添加页面
    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String toAdd() {
        return "employee_add";
    }
    //添加页面的控制器
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }


    //用于回显
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable("id") Integer id,Model model){
        //model用于在请求域中共享数据
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }
    //用于回显后，修改数据后，更新数据
    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String update(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }


}
