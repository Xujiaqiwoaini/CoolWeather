package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String cityName;
    private cityCode;
    private int provinceld;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceld() {
        return provinceld;
    }

    public void setProvinceld(int provinceld) {
        this.provinceld = provinceld;
    }
}
