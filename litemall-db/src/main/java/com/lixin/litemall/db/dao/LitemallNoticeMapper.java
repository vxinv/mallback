package com.lixin.litemall.db.dao;

import com.lixin.litemall.db.domain.LitemallNotice;
import com.lixin.litemall.db.domain.LitemallNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LitemallNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    long countByExample(LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int insert(LitemallNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int insertSelective(LitemallNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    LitemallNotice selectOneByExample(LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    LitemallNotice selectOneByExampleSelective(@Param("example") LitemallNoticeExample example, @Param("selective") LitemallNotice.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    List<LitemallNotice> selectByExampleSelective(@Param("example") LitemallNoticeExample example, @Param("selective") LitemallNotice.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    List<LitemallNotice> selectByExample(LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    LitemallNotice selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallNotice.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    LitemallNotice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    LitemallNotice selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallNotice record, @Param("example") LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallNotice record, @Param("example") LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_notice
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
