package com.example.mapper;

import com.example.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {

}
