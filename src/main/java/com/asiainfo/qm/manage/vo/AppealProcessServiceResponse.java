package com.asiainfo.qm.manage.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.asiainfo.qm.manage.util.ServiceConstant;
import com.asiainfo.qm.manage.util.TxidUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Author     ：dingzc.
 * @ Date       ：Created in 15:13 2018/11/8
 * @ Description：${description}
 */
@EqualsAndHashCode(callSuper=false)
@Data
@ApiModel
public class AppealProcessServiceResponse extends ServiceResponseParent{
    private static Logger logger = LoggerFactory.getLogger(AppealProcessServiceResponse.class);

    @ApiModelProperty(name = "RSP", value = "服务返回业务数据", required = true)
    @JSONField(name = "RSP")
    @JsonProperty("RSP")
    private AppealProcessResponse response;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        AppealProcessServiceResponse.logger = logger;
    }

    public AppealProcessResponse getResponse() {
        return response;
    }

    public void setResponse(AppealProcessResponse response) {
        this.response = response;
    }

    public AppealProcessServiceResponse() {
        try {
            this.txid = TxidUtils.generateTxid();
        } catch (Exception e) {
            logger.error("can not get PtxId:", e);
        }
    }

    public AppealProcessServiceResponse getSuccessResponse(AppealProcessResponse response) {
        this.setStatus(ServiceConstant.STATUS_SUCCESS);
        this.setMsg(ServiceConstant.MSG_SUCCESS);
        this.setResponse(response);
        this.setTxid(TxidUtils.generateTxid());
        return this;
    }

    public AppealProcessServiceResponse getErrorResponse(String errorStatus, String errorMsg, AppealProcessResponse response) {
        this.setStatus(errorStatus);
        this.setMsg(errorMsg);
        this.setResponse(response);
        this.setTxid(TxidUtils.generateTxid());
        return this;
    }
}
