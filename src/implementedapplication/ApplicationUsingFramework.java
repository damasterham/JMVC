package implementedapplication;

import jmvc.*;

//Created by DaMasterHam on 24-02-2017.
//
public class ApplicationUsingFramework //extends JMVC
{
    public static void main(String[] args)
    {
        JMVC app = new JMVC();

        SomeController sc = new SomeController();

        app.getControllers().set(sc);

        app.getControllers().get(SomeController.class).works();

    }


}

