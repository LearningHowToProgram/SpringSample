package org.scarydude.service.impl;

import org.scarydude.model.Dragon;
import org.scarydude.repository.DragonRepository;
import org.scarydude.repository.impl.DragonRepositoryImpl;
import org.scarydude.service.DragonService;

import java.util.List;

public class DragonServiceImpl implements DragonService{
    DragonRepository dragonRepository = new DragonRepositoryImpl();

    @Override
    public Dragon save(Dragon dragon) {
        return dragonRepository.save(dragon);
    }

    @Override
    public Dragon update(Dragon dragon) {
        return dragonRepository.update(dragon);
    }

    @Override
    public List<Dragon> getAll() {
        return dragonRepository.getAll();
    }

    @Override
    public Dragon getOne(Integer id) {
        return dragonRepository.getOne(id);
    }

    @Override
    public Dragon delete(Integer id) {
        return dragonRepository.delete(id);
    }
}
