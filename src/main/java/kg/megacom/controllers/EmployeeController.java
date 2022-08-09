package kg.megacom.controllers;

import kg.megacom.models.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/{name}")
    public Employee getEmployee(@PathVariable String name) {
        Employee employee = new Employee(1l, name, "Mamyralieva");
        return employee;
    }
    @GetMapping("")
    public Employee get(@RequestParam String name){
        Employee employee=new Employee(1l,name,"Mamyralieva");
        return employee;
    }

}
