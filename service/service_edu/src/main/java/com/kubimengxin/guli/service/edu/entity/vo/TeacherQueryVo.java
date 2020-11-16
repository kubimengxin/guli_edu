package com.kubimengxin.guli.service.edu.entity.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author 苦逼萌新
 * @date 2020/11/16
 */
public class TeacherQueryVo {
    @ApiModelProperty(value = "讲师姓名")
    private String name;

    @ApiModelProperty(value = "讲师级别")
    private Integer level;

    @ApiModelProperty(value = "开始时间")
    private String joinDateBegin;

    @ApiModelProperty(value = "结束时间")
    private String joinDateEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getJoinDateBegin() {
        return joinDateBegin;
    }

    public void setJoinDateBegin(String joinDateBegin) {
        this.joinDateBegin = joinDateBegin;
    }

    public String getJoinDateEnd() {
        return joinDateEnd;
    }

    public void setJoinDateEnd(String joinDateEnd) {
        this.joinDateEnd = joinDateEnd;
    }
}
