/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.ftp.service;

import com.jpm1590.ftp.domain.File;
import com.jpm1590.ftp.eis.IFileDao;
import java.util.List;

/**
 *
 * @author olimpica
 */
public class FileService implements IFileService {

    private IFileDao fileDao;
    
    @Override
    public List<File> findAllFile() {
        return fileDao.findAllFile();
    }

    @Override
    public File findByPath(File file) {
        return fileDao.findByPath(file);
    }

    @Override
    public File findByFileName(File file) {
        return fileDao.findByFileName(file);
    }

    @Override
    public void insertFile(File file) {
        fileDao.insertFile(file);
    }

    @Override
    public void updateFile(File file) {
        fileDao.updateFile(file);
    }

    @Override
    public void deleteFile(File file) {
        fileDao.deleteFile(file);
    }
    
}
