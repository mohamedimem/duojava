package org.imem.duojava.Navigation;

import org.imem.duojava.Navigation.UI.DuoMenuButton;
import org.imem.duojava.Navigation.UI.DuoSideBar;
import org.imem.duojava.Navigation.commands.*;

import java.util.ArrayList;
import java.util.List;

public class NavigationController {
    List<DuoMenuButton> menus = new ArrayList<>();
    private SpecialWindows root;
    public NavigationController(SpecialWindows root) {
        this.root = root;
    }
     public void init(){
         NavigationCommand nHome = new NavigationToHomeCommand( root.borderPane);
         NavigationCommand nPractice = new NavigationToPracticeCommand( root.borderPane);
         NavigationCommand nTest = new NavigationToTestCommand( root.borderPane);
         NavigationCommand nQCM = new NavigationToQCMCommand( root.borderPane);
         NavigationCommand nStat = new NavigationToStatisticsCommand( root.borderPane);
         DuoMenuButton saveItem = new DuoMenuButton(0, "Dashboard", nHome);
         DuoMenuButton practiceItem = new DuoMenuButton(1, "Practice", nPractice);
         DuoMenuButton QcmItem = new DuoMenuButton(1, "QCM", nQCM);
         DuoMenuButton TestItem = new DuoMenuButton(1, "Test", nTest);
         DuoMenuButton StatisticItem = new DuoMenuButton(1, "Statistics", nStat);
         List<DuoMenuButton> menus = new ArrayList<>();
         menus.addAll(List.of(saveItem, practiceItem, QcmItem, TestItem, StatisticItem));
         DuoSideBar sideBar = new DuoSideBar(menus);
         root.borderPane.setLeft(sideBar.paint());
     }

}
