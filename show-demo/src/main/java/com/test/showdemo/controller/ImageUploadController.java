package com.test.showdemo.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author zhangxiaoguang
 * @create 2019-12-31 16:11
 */
public class ImageUploadController {
    @PostMapping(value="/upload")
    public String handleFileUpload(@RequestParam(value="file", required=true) MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        return fileToSave.getAbsolutePath();
    }
}
