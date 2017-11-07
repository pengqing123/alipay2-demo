package com.song.bean.domain.alipay;

import lombok.Data;

/**
 * Created by Song on 2017/11/7.
 */
@Data
public class extendParams {
    /**
     * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
     */
    private String sys_service_provider_id;
}
