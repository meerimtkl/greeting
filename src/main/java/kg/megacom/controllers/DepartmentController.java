package kg.megacom.controllers;

import kg.megacom.controllers.base.CrudMethods;
import kg.megacom.models.Department;
import kg.megacom.models.Position;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/department")

public class DepartmentController implements CrudMethods<Department> {
    @Override
    public List <Department> findAll() {
        return Arrays.asList(
                new Department(1l,"Backend",true),
                new Department(2l,"Finiancial department",true),
                new Department(3l,"Frontend",true));
    }

    @Override
    public Department getById(Long id) {
     return new Department(id,"Backend",true);
    }

    @Override
    public Department save(Department department) {
       department.setId(100l);
       return department;

    }

    @Override
    public Department update(Department department) {
       department.setName("New Department");
       return department;
    }

    @Override
    public Department remove(Long id) {
        return new Department(id,"Backend",false);
    }
}
