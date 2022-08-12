package kg.megacom.services;

import kg.megacom.models.Department;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);
    Department update(Department department);
    List<Department>findAll();

}
