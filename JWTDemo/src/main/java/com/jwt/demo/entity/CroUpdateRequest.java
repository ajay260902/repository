package com.jwt.demo.entity;

public class CroUpdateRequest {
    private String CRO;

    public CroUpdateRequest(String cRO) {
        this.CRO = cRO;
    }
    
    public CroUpdateRequest() {
        
    }


    public String getCRO() {
        return this.CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }
}
