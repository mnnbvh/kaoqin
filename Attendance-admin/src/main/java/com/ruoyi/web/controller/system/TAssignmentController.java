package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TAssignment;
import com.ruoyi.system.service.ITAssignmentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配电箱Controller
 *
 * @author ruoyi
 * @date 2022-09-02
 */
@RestController
@RequestMapping("/system/assignment")
public class TAssignmentController extends BaseController
{
    @Autowired
    private ITAssignmentService tAssignmentService;

    /**
     * 查询配电箱列表
     */
    @PreAuthorize("@ss.hasPermi('system:assignment:list')")
    @GetMapping("/list")
    public TableDataInfo list(TAssignment tAssignment)
    {
        startPage();
        List<TAssignment> list = tAssignmentService.selectTAssignmentList(tAssignment);
        return getDataTable(list);
    }

    /**
     * 导出配电箱列表
     */
    @PreAuthorize("@ss.hasPermi('system:assignment:export')")
    @Log(title = "配电箱", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TAssignment tAssignment)
    {
        List<TAssignment> list = tAssignmentService.selectTAssignmentList(tAssignment);
        ExcelUtil<TAssignment> util = new ExcelUtil<TAssignment>(TAssignment.class);
        util.exportExcel(response, list, "配电箱数据");
    }

    /**
     * 获取配电箱详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:assignment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tAssignmentService.selectTAssignmentById(id));
    }

    /**
     * 新增配电箱
     */
    @PreAuthorize("@ss.hasPermi('system:assignment:add')")
    @Log(title = "配电箱", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TAssignment tAssignment)
    {
        return toAjax(tAssignmentService.insertTAssignment(tAssignment));
    }

    /**
     * 修改配电箱
     */
    @PreAuthorize("@ss.hasPermi('system:assignment:edit')")
    @Log(title = "配电箱", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TAssignment tAssignment)
    {
        return toAjax(tAssignmentService.updateTAssignment(tAssignment));
    }

    /**
     * 删除配电箱
     */
    @PreAuthorize("@ss.hasPermi('system:assignment:remove')")
    @Log(title = "配电箱", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tAssignmentService.deleteTAssignmentByIds(ids));
    }
}
