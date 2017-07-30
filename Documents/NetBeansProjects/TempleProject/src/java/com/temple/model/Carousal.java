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
public class Carousal {
    
    private int id;
    private String status;
    private String file;

    public Carousal() {
    }

    public Carousal(int id, String status, String file) {
        this.id = id;
        this.status = status;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

   
    
    

}