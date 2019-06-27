package com.java.server.socket;

import java.util.List;

public class ScreenBean {
    private String name;
    private List<CityProvince> cityProvinces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CityProvince> getCityProvinces() {
        return cityProvinces;
    }

    public void setCityProvinces(List<CityProvince> cityProvinces) {
        this.cityProvinces = cityProvinces;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return  false;
        }
        if(obj instanceof  ScreenBean){
            ScreenBean cityBean = (ScreenBean)obj;
            if(cityBean.name.equalsIgnoreCase(name)){
                return true;
            }else{
                return false;
            }
        }
        return super.equals(obj);
    }
}
