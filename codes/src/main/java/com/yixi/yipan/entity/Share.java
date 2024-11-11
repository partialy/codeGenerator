package com.yixi.yipan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文件分享表
 * </p>
 *
 * @author yixi
 * @since 2024-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("share")
@ApiModel(value="Share对象", description="文件分享表")
public class Share implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分享ID")
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "分享用户ID")
    private String userId;

    @ApiModelProperty(value = "被分享的文件ID")
    private Long fileId;

    @ApiModelProperty(value = "分享码，用于访问分享内容")
    private String shareCode;

    @ApiModelProperty(value = "分享链接过期时间")
    private LocalDateTime expireTime;

    @ApiModelProperty(value = "分享内容被下载次数")
    private Integer downloadCount;

    @ApiModelProperty(value = "分享创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "分享状态：0-已取消，1-正常")
    private Integer status;


}
