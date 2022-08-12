package kg.megacom.controllers;

import kg.megacom.controllers.base.CrudMethods;
import kg.megacom.models.Position;
import kg.megacom.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    PositionService positionService;
    @Override
    public List<Position> findAll() {
        return positionService.findAll();
    }

    @Override
    public Position getById( Long id) {
        return new Position(id, "Head", true);
    }

    @Override
    public Position save(Position position) {

        return positionService.save( position);
    }

    @Override
    public Position update( Position position) {

        return positionService.update(position);
    }

    @Override
    public Position remove( Long id) {
        return null;
    }
}
