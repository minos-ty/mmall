package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * @author minos
 * @date 2021/1/25 20:47
 */
public interface ICategoryService {

    /**
     * 添加分类
     * @param categoryName
     * @param parentId
     * @return
     */
    public ServerResponse addCategory(String categoryName, Integer parentId);

    /**
     * 更新品类名称
     * @param categoryId
     * @param categoryName
     * @return
     */
    public ServerResponse updateCategory(Integer categoryId, String categoryName);

    /**
     * 查找当前分类的子分类
     * @param categoryId
     * @return
     */
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /**
     * 查询本节点的id及其所有孩子节点的id(递归查询)
     * @param categoryId
     * @return
     */
    ServerResponse<List<Integer>> getCategoryAndDeepChildrenCategory(Integer categoryId);

}
