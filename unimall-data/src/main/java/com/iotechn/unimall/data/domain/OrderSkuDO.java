package com.iotechn.unimall.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * Created by rize on 2019/7/5.
 */
@Data
@TableName("unimall_order_sku")
public class OrderSkuDO extends SuperDO {

    @TableField("order_id")
    private Long orderId;

    /**
     * 冗余，方便技术查库
     */
    @TableField("order_no")
    private String orderNo;

    /**
     * SKU 标题
     */
    private String title;

    @TableField("bar_code")
    private String barCode;

    private Integer num;

    /**
     * 单价
     */
    private Integer price;

    /**
     * SKU 或 SPU主图 （优先使用SKU图）
     */
    private String img;


}