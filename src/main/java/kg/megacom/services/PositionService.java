package kg.megacom.services;

import kg.megacom.models.Position;

import java.util.List;

public interface PositionService {
    Position save(Position position);
    Position update(Position position);
    List<Position> findAll();
}
