package com.myapp.mekvahan.HomePage;


import java.io.Serializable;

public class ServiceModel implements Serializable {

    private int id;
    private String category;
    private String priorLine1;
    private String priorLine2;
    private String serviceName;
    private String serviceId;
    private String des;
    private String what;
    private String when;

    private String action1;
    private String action2;
    private String action3;
    private String action4;
    private String action5;
    private String action6;
    private String action7;
    private String action8;
    private String action9;
    private String action10;
    private String action11;
    private String action12;
    private String action13;
    private String action14;
    private String action15;


    private String total;
    private String subtotal;
    private String addiCharges;
    private String gst;

    private String strikedOutAmount;
    private int flag;

    private boolean isAddedToCart;

    public ServiceModel(int id,String category, String priorLine1, String priorLine2, String serviceName, String serviceId,
                        String des, String what, String when, String action1, String action2, String action3,
                        String action4, String action5, String action6, String action7, String action8, String action9,
                        String action10, String action11, String action12, String action13, String action14, String action15,
                        String total, String subtotal, String addiCharges, String gst, String strikedOutAmount, int flag) {
        this.id = id;
        this.category=category;
        this.priorLine1 = priorLine1;
        this.priorLine2 = priorLine2;
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.des = des;
        this.what = what;
        this.when = when;
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.action4 = action4;
        this.action5 = action5;
        this.action6 = action6;
        this.action7 = action7;
        this.action8 = action8;
        this.action9 = action9;
        this.action10 = action10;
        this.action11 = action11;
        this.action12 = action12;
        this.action13 = action13;
        this.action14 = action14;
        this.action15 = action15;
        this.total = total;
        this.subtotal = subtotal;
        this.addiCharges = addiCharges;
        this.gst = gst;
        this.strikedOutAmount = strikedOutAmount;
        this.flag = flag;

        isAddedToCart =false;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public String getPriorLine1() {
        return priorLine1;
    }

    public String getPriorLine2() {
        return priorLine2;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getDes() {
        return des;
    }

    public String getWhat() {
        return what;
    }

    public String getWhen() {
        return when;
    }

    public String getAction1() {
        return action1;
    }

    public String getAction2() {
        return action2;
    }

    public String getAction3() {
        return action3;
    }

    public String getAction4() {
        return action4;
    }

    public String getAction5() {
        return action5;
    }

    public String getAction6() {
        return action6;
    }

    public String getAction7() {
        return action7;
    }

    public String getAction8() {
        return action8;
    }

    public String getAction9() {
        return action9;
    }

    public String getAction10() {
        return action10;
    }

    public String getAction11() {
        return action11;
    }

    public String getAction12() {
        return action12;
    }

    public String getAction13() {
        return action13;
    }

    public String getAction14() {
        return action14;
    }

    public String getAction15() {
        return action15;
    }

    public String getTotal() {
        return total;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public String getAddiCharges() {
        return addiCharges;
    }

    public String getGst() {
        return gst;
    }

    public String getStrikedOutAmount() {
        return strikedOutAmount;
    }

    public int getFlag() {
        return flag;
    }

    public boolean isAddedToCart() {
        return isAddedToCart;
    }

    public void setAddedToCart(boolean addedToCart) {
        isAddedToCart = addedToCart;
    }
}
