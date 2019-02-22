package com.mojix.vizix;

import java.util.ArrayList;

public class JSONtools {
    public static ArrayList<String> jsonToArray(String json ){
        String e = "";
        java.util.ArrayList<String> res = new ArrayList<>();
        int level = 0;
        char c;
        for(int i = 0; i < json.length(); i++ ){
            c = json.charAt(i);
            if(( c == ']' ) || ( c == '}' )){
                level--;
            }
            if (c == ',' ) {
                if( level == 1){
                    res.add( e );
                    e = "";
                    continue;

                }
            }
            if(level > 0) {
                e = e + c;
            }
            if(( c == '[' ) || ( c == '{' )){
                level++;
            }
        }
        res.add( e );
        return res;
    }

}
