package com.yixi.yipan.service.impl;

import com.yixi.yipan.entity.File;
import com.yixi.yipan.mapper.FileMapper;
import com.yixi.yipan.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文件信息表 服务实现类
 * </p>
 *
 * @author yixi
 * @since 2024-10-31
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
