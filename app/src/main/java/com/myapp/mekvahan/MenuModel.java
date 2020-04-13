package com.myapp.mekvahan;

public class MenuModel {

    private int id;
    private String menuName;
    private boolean hasChildren, isGroup;
    private int icon_id;

    public MenuModel(int id, String menuName, boolean hasChildren, boolean isGroup, int icon_id) {
        this.id = id;
        this.menuName = menuName;
        this.hasChildren = hasChildren;
        this.isGroup = isGroup;
        this.icon_id = icon_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public int getIcon_id() {
        return icon_id;
    }
}
