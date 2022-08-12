package kg.megacom.controllers;

import kg.megacom.controllers.base.CrudMethods;
import kg.megacom.models.Department;
import kg.megacom.models.Position;
import kg.megacom.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/department")

public class DepartmentController implements CrudMethods<Department> {
    @Autowired
   DepartmentService departmentService;


    @Override
    public List <Department> findAll() {
         return departmentService.findAll();


    }

    @Override
    public Department getById(Long id) {
     return new Department(id,"Backend",true);
    }

    @Override
    public Department save(Department department) {
     return departmentService.save(department);

    }

    @Override
    public Department update(Department department) {

       return departmentService.update(department);
    }

    @Override
    public Department remove(Long id) {
        return null;
    }
}
