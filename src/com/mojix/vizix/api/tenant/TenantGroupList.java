package com.mojix.vizix.api.tenant;

/**
 * This class conain the methods to manage the Tenant List, from the API, the list could be xtracted from a String in JSON format.
 */
public class TenantGroupList {

    /**
     * Remove all characters before found the match in a string and return the rest of the string;
     * @param target this is the string where the substring will be found.
     * @param search This is the string to search or the match.
     * @return This is the string restul form the match to the end of the string, if the match not exists then return null.
     */
    public String getSubString(String target, String search){
        int pos = target.indexOf(search);
        if( pos < 0) {
            return null;
        }
        target = target.substring( pos );
        return target;
    }
    /**
     * This return a value from a field  of sopecific tenant that match with a field.
     * @param list this is the liost of tenant in a JSON format.
     * @param search This id the string to search in the TenantGroup, this should be in JSON format example: "name":"MyTenant"
     * @param field This is field to get the from the TenantGroup. Ex: id
     * @return It is the value of the tenant, if return null then the field or the TENANT not exists.
     */
    public String getFieldFromTenant(String list,String search,String field){
        String value = "";
        list = getSubString( list, search );
        if( list == null ){
            return null;
        }
        field = "\""+field+"\":";
        list = getSubString( list, field );
        if( list == null ){
            return null;
        }
        char c;
        boolean flag = false;
        value = "";
        for( int i = 0; i < list.length() - 1; i++){
            c = list.charAt(i);
            switch(c ){
                case '}':
                    return value;
                case ']':
                    return value;
                case ',':
                    return value;
                case ':':
                    flag = true;
                    break;
                default:
                    if( flag ) {
                        value = value + c;
                    }
            }
        }
        return  null;
    }
}
