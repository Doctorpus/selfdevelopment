package com.leishaw.forjob.DAO;

import com.leishaw.forjob.DO.FuckDO;
import com.leishaw.forjob.DO.FuckDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuckDOMapper {
    int countByExample(FuckDOExample example);

    int deleteByExample(FuckDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FuckDO record);

    int insertSelective(FuckDO record);

    List<FuckDO> selectByExample(FuckDOExample example);

    FuckDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FuckDO record, @Param("example") FuckDOExample example);

    int updateByExample(@Param("record") FuckDO record, @Param("example") FuckDOExample example);

    int updateByPrimaryKeySelective(FuckDO record);

    int updateByPrimaryKey(FuckDO record);
}