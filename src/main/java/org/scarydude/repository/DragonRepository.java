package org.scarydude.repository;

import org.scarydude.model.Dragon;

import java.util.List;

public interface DragonRepository {
    Dragon save(Dragon dragon);
    Dragon update(Dragon dragon);
    List<Dragon> getAll();
    Dragon getOne(Integer id);
    Dragon delete(Integer id);
}
