/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.ftp.eis;

import com.jpm1590.ftp.domain.Store;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olimpica
 */
public class StoreDao implements IStoreDao {

    @Override
    public List<Store> findAllStore() {

        Store store = new Store();
        List<Store> stores = new ArrayList<>();

        try {
            BufferedReader ent = new BufferedReader(new FileReader("ip.csv"));
            StringTokenizer stt;
            String linea = ent.readLine();

            while (linea != null) {

                stt = new StringTokenizer(linea, ";");

                store.setStore(stt.nextToken());
                store.setIp(stt.nextToken());

                stores.add(store);

                linea = ent.readLine();
            }
        } catch (IOException ioe) {
        }

        return stores;
    }

    @Override
    public Store findByIp(Store store) {

        Store storeFile = new Store();

        try {
            BufferedReader ent = new BufferedReader(new FileReader("ip.csv"));
            StringTokenizer stt;
            String linea = ent.readLine();

            while (linea != null) {

                stt = new StringTokenizer(linea, ";");

                storeFile.setStore(stt.nextToken());
                storeFile.setIp(stt.nextToken());

                if (store.getIp().equals(storeFile.getIp())) {
                    return storeFile;
                }
                linea = ent.readLine();
            }
        } catch (IOException ioe) {
        }

        return store;
    }

    @Override
    public Store findByStore(Store store) {
        Store storeFile = new Store();

        try {
            BufferedReader ent = new BufferedReader(new FileReader("ip.csv"));
            StringTokenizer stt;
            String linea = ent.readLine();

            while (linea != null) {

                stt = new StringTokenizer(linea, ";");

                storeFile.setStore(stt.nextToken());
                storeFile.setIp(stt.nextToken());

                if (store.getStore().equals(storeFile.getStore())) {
                    return storeFile;
                }
                linea = ent.readLine();
            }
        } catch (IOException ioe) {
        }

        return store;
    }

    @Override
    public void insertStore(Store store) {

        try (PrintWriter sal = new PrintWriter(new FileWriter("ip.csv"), true)) {
            sal.println(store.getStore() + ";" + store.getIp());
        } catch (IOException ex) {
            Logger.getLogger(StoreDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateStore(Store store) {
        
    }

    @Override
    public void deleteStore(Store store) {
        
    }

}
