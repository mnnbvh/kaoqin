package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TAssignment;

/**
 * 配电箱Service接口
 * 
 * @author ruoyi
 * @date 2022-09-02
 */
public interface ITAssignmentService 
{
    /**
     * 查询配电箱
     * 
     * @param id 配电箱主键
     * @return 配电箱
     */
    public TAssignment selectTAssignmentById(Long id);

    /**
     * 查询配电箱列表
     * 
     * @param tAssignment 配电箱
     * @return 配电箱集合
     */
    public List<TAssignment> selectTAssignmentList(TAssignment tAssignment);

    /**
     * 新增配电箱
     * 
     * @param tAssignment 配电箱
     * @return 结果
     */
    public int insertTAssignment(TAssignment tAssignment);

    /**
     * 修改配电箱
     * 
     * @param tAssignment 配电箱
     * @return 结果
     */
    public int updateTAssignment(TAssignment tAssignment);

    /**
     * 批量删除配电箱
     * 
     * @param ids 需要删除的配电箱主键集合
     * @return 结果
     */
    public int deleteTAssignmentByIds(Long[] ids);

    /**
     * 删除配电箱信息
     * 
     * @param id 配电箱主键
     * @return 结果
     */
    public int deleteTAssignmentById(Long id);
}
