package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author minos
 * @date 2021/2/2 09:23
 */
public interface IFileService {

    /**
     * 文件上传
     * @param file
     * @param path
     * @return
     */
    public String upload(MultipartFile file, String path);
}
