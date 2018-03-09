/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.ftp.domain;

/**
 *
 * @author olimpica
 */

public class Store {
    
    private String store;
    private String ip;

    public Store() {
    }
    
    public Store(String store, String ip){
        this.store = store;
        this.ip = ip;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }    

    @Override
    public String toString() {
        return "Store{" + "store=" + store + ", ip=" + ip + '}';
    }
    
}
