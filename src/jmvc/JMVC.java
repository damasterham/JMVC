package jmvc;

import jmvc.controller.*;
//Created by DaMasterHam on 24-02-2017.
//

/**
 *  A(n) MVC framework for Java
 *
 */
public class JMVC
{
    //private ViewImplementation view;
    private ControllerCollection cc;

    public JMVC()
    {
        cc = new ControllerCollection();
    }

    public ControllerCollection getControllers()
    {
        return cc;
    }

    public JMVC setControllers(ControllerCollection controllers)
    {
        cc = controllers;
        return this;
    }

    public static void start()
    {
        // Read jmvc.controller Classes from Implemented Application


    }

}
