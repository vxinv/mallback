package com.lixin.litemall.db.dao;

import com.lixin.litemall.db.domain.LitemallFeedback;
import com.lixin.litemall.db.domain.LitemallFeedbackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LitemallFeedbackMapper {
    long countByExample(LitemallFeedbackExample example);

    int deleteByExample(LitemallFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LitemallFeedback record);

    int insertSelective(LitemallFeedback record);

    LitemallFeedback selectOneByExample(LitemallFeedbackExample example);

    LitemallFeedback selectOneByExampleSelective(@Param("example") LitemallFeedbackExample example, @Param("selective") LitemallFeedback.Column... selective);

    List<LitemallFeedback> selectByExampleSelective(@Param("example") LitemallFeedbackExample example, @Param("selective") LitemallFeedback.Column... selective);

    List<LitemallFeedback> selectByExample(LitemallFeedbackExample example);

    LitemallFeedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallFeedback.Column... selective);

    LitemallFeedback selectByPrimaryKey(Integer id);

    LitemallFeedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") LitemallFeedback record, @Param("example") LitemallFeedbackExample example);

    int updateByExample(@Param("record") LitemallFeedback record, @Param("example") LitemallFeedbackExample example);

    int updateByPrimaryKeySelective(LitemallFeedback record);

    int updateByPrimaryKey(LitemallFeedback record);

    int logicalDeleteByExample(@Param("example") LitemallFeedbackExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}
