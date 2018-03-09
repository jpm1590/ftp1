/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.ftp.service;

import com.jpm1590.ftp.domain.Store;
import com.jpm1590.ftp.eis.IStoreDao;
import java.util.List;

/**
 *
 * @author olimpica
 */
public class StoreService implements IStoreService {

    private IStoreDao storeDao;
    
    @Override
    public List<Store> findAllStore() {
        return storeDao.findAllStore();
    }

    @Override
    public Store findByIp(Store store) {
        return storeDao.findByIp(store);
    }

    @Override
    public Store findByStore(Store store) {
        return storeDao.findByStore(store);
    }

    @Override
    public void insertStore(Store store) {
        storeDao.insertStore(store);
    }

    @Override
    public void updateStore(Store store) {
        storeDao.updateStore(store);
    }

    @Override
    public void deleteStore(Store store) {
        storeDao.deleteStore(store);
    }

}
