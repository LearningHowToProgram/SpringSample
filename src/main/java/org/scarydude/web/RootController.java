package org.scarydude.web;

import org.scarydude.model.Dragon;
import org.scarydude.repository.DragonRepository;
import org.scarydude.repository.impl.DragonRepositoryImpl;
import org.scarydude.service.DragonService;
import org.scarydude.service.impl.DragonServiceImpl;

import java.awt.*;
import java.util.*;
import java.util.List;

public class RootController {

    public static void main(String[] args) {

        DragonService dragonService = new DragonServiceImpl();

        Dragon agronom = new Dragon(1, "Agronom", 100, 2000, Color.black, 3);
        Dragon matumba = new Dragon(2, "Matumba", 12022, 53110, Color.blue, 111);
        Dragon pixie = new Dragon(3, "Pixie", 1, 2, Color.white, 2);
        Dragon homer = new Dragon(4, "Homer", 12, 200, Color.yellow, 1);

        dragonService.save(agronom);
        dragonService.save(matumba);
        dragonService.save(pixie);
        dragonService.save(homer);

        dragonService.getAll();

        dragonService.getOne(3);

        dragonService.delete(2);
        List<Dragon> list = dragonService.getAll();
        System.out.println(list.get(0).getName());


    }


}
