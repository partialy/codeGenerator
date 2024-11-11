package com.yixi.yipan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文件信息表
 * </p>
 *
 * @author yixi
 * @since 2024-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("file")
@ApiModel(value="File对象", description="文件信息表")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文件ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "父文件夹ID，根目录为null")
    private Long parentId;

    @ApiModelProperty(value = "文件名称")
    private String fileName;

    @ApiModelProperty(value = "文件大小(bytes)")
    private Long fileSize;

    @ApiModelProperty(value = "文件类型/MIME类型")
    private String fileType;

    @ApiModelProperty(value = "文件实际存储路径")
    private String filePath;

    @ApiModelProperty(value = "文件MD5值，用于秒传功能")
    private String md5;

    @ApiModelProperty(value = "是否是文件夹：0-文件，1-文件夹")
    private Boolean isFolder;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "删除时间（软删除）")
    private LocalDateTime deletedAt;


}
