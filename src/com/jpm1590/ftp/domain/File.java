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
public class File {
    
    private String path;
    private String fileName;

    public File() {
    }

    public File(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
    
}
