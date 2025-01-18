package org.imem.duojava.Screens;

import org.imem.duojava.Constants;
import org.imem.duojava.db.DuoDatabase;

public class ModuleController {
    // Method to add a module to the database
    public  void addModule(String title  ) {
        // Add your logic to save the module to the database
        //        DuoDatabase module =  DuoDatabase.getInstance(Constants.BASE_PATH + title + ".json");
        DuoDatabase module =  DuoDatabase.getInstance( );
       module.addModule(title);
    }
}
