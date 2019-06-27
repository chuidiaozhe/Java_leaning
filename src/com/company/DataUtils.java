package com.company;

import java.util.ArrayList;

public class DataUtils {

    public static ArrayList<String> list = new ArrayList<String>();
    public static ArrayList<String> getList(){
        if(list.size() == 0){
            {
                for (int i = 0; i < 10; i++) {
                    list.add("djddjfd;" + i);
                }
            }
        }
        return list;
    }

}
