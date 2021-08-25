package com.alyusril.tokokita;

public class CustomBantuanAkun {
    private String visible;
    private String gone;

    public String getVisible(){return visible;}

    public void setVisible(String visible) {this.visible = visible;}

    public String getGone(){return gone;}

    public void setGone(String gone) {this.gone = gone;}

    public CustomBantuanAkun(String visible, String gone){
        this.visible = visible;
        this.gone = gone;
    }

}
