package org.imem.duojava.Navigation;

import javafx.scene.layout.BorderPane;

public class SpecialWindows {
    private static SpecialWindows specialWindows ;
    public BorderPane borderPane;
    private SpecialWindows(){
        borderPane=new BorderPane();
    }

    public static SpecialWindows getInstance(){
        if(specialWindows == null){
            return  new SpecialWindows();
        }
        return specialWindows;
    }

}
