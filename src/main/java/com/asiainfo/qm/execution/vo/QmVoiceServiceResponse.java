package com.asiainfo.qm.execution.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.asiainfo.qm.manage.util.ServiceConstant;
import com.asiainfo.qm.manage.util.TxidUtils;
import com.asiainfo.qm.manage.vo.ServiceResponseParent;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Author     ：dingzc.
 * @ Date       ：Created in 2019-03-20 19:58
 * @ Description：${description}
 */

@EqualsAndHashCode(callSuper = false)
@Data
@ApiModel
public class QmVoiceServiceResponse extends ServiceResponseParent {
    private static Logger logger = LoggerFactory.getLogger(QmVoiceServiceResponse.class);

    @ApiModelProperty(name = "RSP", value = "服务返回业务数据", required = true)
    @JSONField(name = "RSP")
    @JsonProperty("RSP")
    private QmVoiceResponse response;

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        QmVoiceServiceResponse.logger = logger;
    }

    public QmVoiceResponse getResponse() {
        return response;
    }

    public void setResponse(QmVoiceResponse response) {
        this.response = response;
    }

    public QmVoiceServiceResponse() {
        try {
            this.txid = TxidUtils.generateTxid();
        } catch (Exception e) {
            logger.error("can not get PtxId:", e);
        }
    }

    public QmVoiceServiceResponse getSuccessResponse(QmVoiceResponse response) {
        this.setStatus(ServiceConstant.STATUS_SUCCESS);
        this.setMsg(ServiceConstant.MSG_SUCCESS);
        this.setResponse(response);
        this.setTxid(TxidUtils.generateTxid());
        return this;
    }

    public QmVoiceServiceResponse getErrorResponse(String errorStatus, String errorMsg, QmVoiceResponse response) {
        this.setStatus(errorStatus);
        this.setMsg(errorMsg);
        this.setResponse(response);
        this.setTxid(TxidUtils.generateTxid());
        return this;
    }
}
