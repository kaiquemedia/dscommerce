package com.devsuperior.dscommerce.dto;

public class FieldMessage {
    private String fieldname;
    private String meessage;

    public FieldMessage(String fieldname, String meessage) {
        this.fieldname = fieldname;
        this.meessage = meessage;
    }

    public String getFieldname() {
        return fieldname;
    }

    public String getMeessage() {
        return meessage;
    }
}


