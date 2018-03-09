/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.ftp.service;

import com.jpm1590.ftp.domain.File;
import java.util.List;

/**
 *
 * @author olimpica
 */
public interface IFileService {
    
    public List<File> findAllFile();
    
    public File findByPath(File file);
    
    public File findByFileName(File file);
    
    public void insertFile(File file);
    
    public void updateFile(File file);
    
    public void deleteFile(File file); 
}
