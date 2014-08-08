package org.scarydude.repository.impl;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import org.omg.DynamicAny._DynStructStub;
import org.scarydude.model.Dragon;
import org.scarydude.repository.DragonRepository;
import org.scarydude.web.RootController;

import java.net.SocketPermission;
import java.util.*;

public class DragonRepositoryImpl implements DragonRepository{
    private Map<Integer, Dragon> dragonsMap = new HashMap<Integer, Dragon>();

    @Override
    public Dragon save(Dragon dragon) {
        dragonsMap.put(dragon.getId(), dragon);
        System.out.println(dragon.getName() + " was saved");
        return dragon;
    }

    @Override
    public Dragon update(Dragon dragon) {

        return null;
    }

    @Override
    public List<Dragon> getAll() {
        List<Dragon> dragonList = new ArrayList<Dragon>(dragonsMap.values());
        System.out.println("succesfully geted");
        return dragonList;
    }

    @Override
    public Dragon getOne(Integer id) {
        System.out.println("Your choose " + dragonsMap.get(id).getName());
       return dragonsMap.get(id);
    }

    @Override
    public Dragon delete(Integer id) {
        dragonsMap.remove(id);
        System.out.println(dragonsMap.get(id) + " was deleted");
        return null;
    }
}
