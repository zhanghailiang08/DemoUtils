package com.common.util;

public enum CountryEnum {

    ONE(1,"中国"),TWO(2,"美国"),THREE(3,"英国"),FOUR(4,"俄国"),FIVE(5,"德国"),
    SIX(6,"日本");

    private int retCode;
    private String retMessage;

     CountryEnum(Integer retCode,String retMessage){
     this.retCode = retCode;
     this.retMessage = retMessage;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    public static CountryEnum forEach_Country(int index){
         CountryEnum [] countryEnums = CountryEnum.values();
         for(CountryEnum c : countryEnums){
             if(index == c.getRetCode()){
                 return c;
             }
         }
         return null;
    }
}
