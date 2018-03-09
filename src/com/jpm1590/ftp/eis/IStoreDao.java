/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.ftp.eis;

import com.jpm1590.ftp.domain.Store;
import java.util.List;

/**
 *
 * @author olimpica
 */
public interface IStoreDao {
    
    public List<Store> findAllStore();
    
    public Store findByIp(Store store);
    
    public Store findByStore(Store store);
    
    public void insertStore(Store store);
    
    public void updateStore(Store store);
    
    public void deleteStore(Store store);
}
