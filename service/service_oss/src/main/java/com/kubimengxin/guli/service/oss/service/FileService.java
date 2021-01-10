package com.kubimengxin.guli.service.oss.service;

import java.io.InputStream;

/**
 * @author 苦逼萌新
 * @date 2021/1/3
 */
public interface FileService {

    /**
     * 阿里云OSS文件上传
     * @param inputStream 输入流
     * @param module 文件夹名称
     * @param originalFileName 原始文件名
     * @return 文件在OSS服务器上的URL地址
      */
    String upload(InputStream inputStream, String module, String originalFileName);

    /**
     * 阿里云 oss 文件删除
     * @param url 文件的 URL 地址
     */
    void removeFile(String url);
}
