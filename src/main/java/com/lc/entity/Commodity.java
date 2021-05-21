package com.lc.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品实体")
public class Commodity {
    @ApiModelProperty("商品名")
    public String name;
    @ApiModelProperty("商品编号")
    public String id;
    @ApiModelProperty("商品数量")
    public Integer count;


}
