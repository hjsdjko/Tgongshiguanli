package com.dao;

import com.entity.HetongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HetongView;

/**
 * 合同模块 Dao 接口
 *
 * @author 
 * @since 2021-03-24
 */
public interface HetongDao extends BaseMapper<HetongEntity> {

   List<HetongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
