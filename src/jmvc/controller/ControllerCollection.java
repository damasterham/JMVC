package jmvc.controller;//

import java.util.HashMap;

//Created by DaMasterHam on 24-02-2017.
//
public class ControllerCollection
{
    private HashMap<Class<? extends Controller>, Controller> collection;

    public ControllerCollection()
    {
        // Read jmvc.controller Classes from Implemented Application

        // Where does it get the value of the Classes package/path?
            //config?
            //IDE relational?

        collection = new HashMap<>();

    }

    public <T extends Controller> T get(Class<T> controllerType)
    {
        return controllerType.cast(collection.get(controllerType));
    }

    public <T extends Controller> void set(T controller)
    {
        collection.put(controller.getClass(), controller);
    }
}
