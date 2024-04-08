package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public ArraryList<MenuItem> menuItems = new ArrayList<>();
    public LocalDate lastUpdated;

    public ArraryList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
