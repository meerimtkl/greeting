package kg.megacom.controllers;

import kg.megacom.controllers.base.CrudMethods;
import kg.megacom.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {
    //save
    //update
    //select
    //delete
    @Override
    public List<Position> findAll() {
        return Arrays.asList(
                new Position(1l, "Head", true),
                new Position(2l, "middle", true),
                new Position(3l, "senior", true),
                new Position(4l, "junior", true));
    }

    @Override
    public Position getById(@PathVariable Long id) {
        return new Position(id, "Head", true);
    }

    @Override
    public Position save(@RequestBody Position position) {
        position.setId(100l);
        return position;
    }

    @Override
    public Position update(@RequestBody Position position) {
        position.setName("New Position");
        return position;
    }

    @Override
    public Position remove(@PathVariable Long id) {
        return new Position(id, "Head", false);
    }
}
