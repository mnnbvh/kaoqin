package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配电箱对象 t_assignment
 * 
 * @author ruoyi
 * @date 2022-09-02
 */
public class TAssignment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 配电箱名称 */
    @Excel(name = "配电箱名称")
    private String name;

    /** 施工单位 */
    @Excel(name = "施工单位")
    private String workUnit;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String project;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 授权人名称 */
    @Excel(name = "授权人名称")
    private String personName;

    /** 授权人id */
    @Excel(name = "授权人id")
    private String personNo;

    /** ic卡 */
    @Excel(name = "ic卡")
    private String icCard;

    /** 授权部门 */
    @Excel(name = "授权部门")
    private String department;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setWorkUnit(String workUnit) 
    {
        this.workUnit = workUnit;
    }

    public String getWorkUnit() 
    {
        return workUnit;
    }
    public void setProject(String project) 
    {
        this.project = project;
    }

    public String getProject() 
    {
        return project;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setPersonName(String personName) 
    {
        this.personName = personName;
    }

    public String getPersonName() 
    {
        return personName;
    }
    public void setPersonNo(String personNo) 
    {
        this.personNo = personNo;
    }

    public String getPersonNo() 
    {
        return personNo;
    }
    public void setIcCard(String icCard) 
    {
        this.icCard = icCard;
    }

    public String getIcCard() 
    {
        return icCard;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("workUnit", getWorkUnit())
            .append("project", getProject())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("personName", getPersonName())
            .append("personNo", getPersonNo())
            .append("icCard", getIcCard())
            .append("department", getDepartment())
            .append("status", getStatus())
            .toString();
    }
}
