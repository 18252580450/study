package com.asiainfo.qm.manage.vo;

import com.asiainfo.qm.manage.domain.AppealProcess;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pagehelper.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：dingzc.
 * @ Date       ：Created in 15:12 2018/11/8
 * @ Description：${description}
 */
@EqualsAndHashCode(callSuper = false)
@Data
@ApiModel
public class AppealProcessResponse extends ResponseParent{
    @ApiModelProperty(name = "DATA", value = "", required = true, example = "")
    @JsonProperty(value = "DATA")
    private List<AppealProcess> data = new ArrayList<AppealProcess>();

    public AppealProcessResponse() {}

    public List<AppealProcess> getData() {
        return data;
    }

    public void setData(List<AppealProcess> data) {
        this.data = data;
    }

    public AppealProcessResponse(Page<AppealProcess> pageResult) {
        this.setData(pageResult != null ? pageResult.getResult() : null);
        this.setAttach(new Attach(pageResult != null ? pageResult.getTotal() : 0L));
    }
}
