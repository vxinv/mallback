package com.lixin.litemall.db.dao;

import com.lixin.litemall.db.domain.LitemallNoticeAdmin;
import com.lixin.litemall.db.domain.LitemallNoticeAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LitemallNoticeAdminMapper {
    long countByExample(LitemallNoticeAdminExample example);

    int deleteByExample(LitemallNoticeAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LitemallNoticeAdmin record);

    int insertSelective(LitemallNoticeAdmin record);

    LitemallNoticeAdmin selectOneByExample(LitemallNoticeAdminExample example);

    LitemallNoticeAdmin selectOneByExampleSelective(@Param("example") LitemallNoticeAdminExample example, @Param("selective") LitemallNoticeAdmin.Column... selective);

    List<LitemallNoticeAdmin> selectByExampleSelective(@Param("example") LitemallNoticeAdminExample example, @Param("selective") LitemallNoticeAdmin.Column... selective);

    List<LitemallNoticeAdmin> selectByExample(LitemallNoticeAdminExample example);

    LitemallNoticeAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallNoticeAdmin.Column... selective);

    LitemallNoticeAdmin selectByPrimaryKey(Integer id);

    LitemallNoticeAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") LitemallNoticeAdmin record, @Param("example") LitemallNoticeAdminExample example);

    int updateByExample(@Param("record") LitemallNoticeAdmin record, @Param("example") LitemallNoticeAdminExample example);

    int updateByPrimaryKeySelective(LitemallNoticeAdmin record);

    int updateByPrimaryKey(LitemallNoticeAdmin record);

    int logicalDeleteByExample(@Param("example") LitemallNoticeAdminExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}
