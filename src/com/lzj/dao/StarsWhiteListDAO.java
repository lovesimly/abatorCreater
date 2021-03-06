package com.lzj.dao;

import com.lzj.bean.StarsWhiteList;
import com.lzj.bean.StarsWhiteListExample;
import java.sql.SQLException;
import java.util.List;

public interface StarsWhiteListDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    void insert(StarsWhiteList record) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int updateByPrimaryKey(StarsWhiteList record) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int updateByPrimaryKeySelective(StarsWhiteList record) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    List selectByExample(StarsWhiteListExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    StarsWhiteList selectByPrimaryKey(Long id) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int deleteByExample(StarsWhiteListExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int deleteByPrimaryKey(Long id) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int countByExample(StarsWhiteListExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int updateByExampleSelective(StarsWhiteList record, StarsWhiteListExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table stars_white_list
     *
     * @abatorgenerated Thu Nov 17 10:20:49 CST 2016
     */
    int updateByExample(StarsWhiteList record, StarsWhiteListExample example) throws SQLException;
}