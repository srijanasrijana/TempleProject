/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.model;

/**
 *
 * @author srijana
 */
public class Environment {
    private int eid;
    private String templeName;
    private String visitorsAddress;
    private String envCondition;
    private String envFile;
    private String templeVisitors;
    private String templeOrganizor;
    private String openTime;
    private String templeScope;

    public Environment() {
    }

    public Environment(int eid, String templeName, String visitorsAddress, String envCondition, String envFile, String templeVisitors, String templeOrganizor, String openTime, String templeScope) {
        this.eid = eid;
        this.templeName = templeName;
        this.visitorsAddress = visitorsAddress;
        this.envCondition = envCondition;
        this.envFile = envFile;
        this.templeVisitors = templeVisitors;
        this.templeOrganizor = templeOrganizor;
        this.openTime = openTime;
        this.templeScope = templeScope;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getTempleName() {
        return templeName;
    }

    public void setTempleName(String templeName) {
        this.templeName = templeName;
    }

    public String getVisitorsAddress() {
        return visitorsAddress;
    }

    public void setVisitorsAddress(String visitorsAddress) {
        this.visitorsAddress = visitorsAddress;
    }

    public String getEnvCondition() {
        return envCondition;
    }

    public void setEnvCondition(String envCondition) {
        this.envCondition = envCondition;
    }

    public String getEnvFile() {
        return envFile;
    }

    public void setEnvFile(String envFile) {
        this.envFile = envFile;
    }

    public String getTempleVisitors() {
        return templeVisitors;
    }

    public void setTempleVisitors(String templeVisitors) {
        this.templeVisitors = templeVisitors;
    }

    public String getTempleOrganizor() {
        return templeOrganizor;
    }

    public void setTempleOrganizor(String templeOrganizor) {
        this.templeOrganizor = templeOrganizor;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getTempleScope() {
        return templeScope;
    }

    public void setTempleScope(String templeScope) {
        this.templeScope = templeScope;
    }
    
    
    
    
    
}
