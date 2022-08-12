package kg.megacom.services.impl;

import kg.megacom.dao.DepartmentRepository;
import kg.megacom.models.Department;
import kg.megacom.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);

    }

    @Override
    public Department update(Department department) {
        return  departmentRepository.save(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
