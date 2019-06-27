package com.java.server.socket;

public class StringKeyValue   {
    private String key;
    private String value;

    public StringKeyValue(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return  false;
        }else {
            if ( obj instanceof  StringKeyValue){
                StringKeyValue s = (StringKeyValue) obj;
                return  s.getKey().equals(key);
            }else{
                return  false;
            }
        }
    }

    @Override
    public int hashCode() {

        return 0;
    }
}
