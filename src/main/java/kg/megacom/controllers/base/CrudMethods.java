package kg.megacom.controllers.base;

import kg.megacom.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

public interface CrudMethods<T>  {
    //save
    //update
    //select
    //delete
    @GetMapping("/all")
    List<T> findAll() ;

    @GetMapping("/{id}")
    T getById(@PathVariable Long id);

    @PostMapping("/save")
    T save(@RequestBody T t) ;

    @PutMapping("/update")
    T update(@RequestBody T t);

    @DeleteMapping("/remove/{id}")
    T remove(@PathVariable Long id);

}
