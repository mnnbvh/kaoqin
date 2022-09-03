package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TAssignmentMapper;
import com.ruoyi.system.domain.TAssignment;
import com.ruoyi.system.service.ITAssignmentService;

/**
 * 配电箱Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-02
 */
@Service
public class TAssignmentServiceImpl implements ITAssignmentService 
{
    @Autowired
    private TAssignmentMapper tAssignmentMapper;

    /**
     * 查询配电箱
     * 
     * @param id 配电箱主键
     * @return 配电箱
     */
    @Override
    public TAssignment selectTAssignmentById(Long id)
    {
        return tAssignmentMapper.selectTAssignmentById(id);
    }

    /**
     * 查询配电箱列表
     * 
     * @param tAssignment 配电箱
     * @return 配电箱
     */
    @Override
    public List<TAssignment> selectTAssignmentList(TAssignment tAssignment)
    {
        return tAssignmentMapper.selectTAssignmentList(tAssignment);
    }

    /**
     * 新增配电箱
     * 
     * @param tAssignment 配电箱
     * @return 结果
     */
    @Override
    public int insertTAssignment(TAssignment tAssignment)
    {
        return tAssignmentMapper.insertTAssignment(tAssignment);
    }

    /**
     * 修改配电箱
     * 
     * @param tAssignment 配电箱
     * @return 结果
     */
    @Override
    public int updateTAssignment(TAssignment tAssignment)
    {
        return tAssignmentMapper.updateTAssignment(tAssignment);
    }

    /**
     * 批量删除配电箱
     * 
     * @param ids 需要删除的配电箱主键
     * @return 结果
     */
    @Override
    public int deleteTAssignmentByIds(Long[] ids)
    {
        return tAssignmentMapper.deleteTAssignmentByIds(ids);
    }

    /**
     * 删除配电箱信息
     * 
     * @param id 配电箱主键
     * @return 结果
     */
    @Override
    public int deleteTAssignmentById(Long id)
    {
        return tAssignmentMapper.deleteTAssignmentById(id);
    }
}
