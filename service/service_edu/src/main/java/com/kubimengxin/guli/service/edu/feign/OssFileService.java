package com.kubimengxin.guli.service.edu.feign;

import com.kubimengxin.guli.common.base.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 苦逼萌新
 * @date 2021/1/10
 */
@FeignClient("service-oss")
public interface OssFileService {

    @GetMapping("admin/oss/file/test")
    R test();

    @DeleteMapping("admin/oss/file/remove")
    R removeFile(@RequestBody String url);
}
