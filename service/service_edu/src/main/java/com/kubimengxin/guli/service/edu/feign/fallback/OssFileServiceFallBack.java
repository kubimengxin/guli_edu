package com.kubimengxin.guli.service.edu.feign.fallback;

import com.kubimengxin.guli.common.base.result.R;
import com.kubimengxin.guli.service.edu.feign.OssFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 苦逼萌新
 * @date 2021/2/21
 */
@Slf4j
@Service
public class OssFileServiceFallBack implements OssFileService {
    @Override
    public R test() {
        return R.error();
    }

    @Override
    public R removeFile(String url) {
        log.info("熔断保护");
        return R.error();
    }
}
