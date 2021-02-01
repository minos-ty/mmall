package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

/**
 * @author minos
 * @date 2021/2/1 11:28
 */
public interface IProductService {

    /**
     * 更新or新增商品
     * @param product
     * @return
     */
    public ServerResponse saveOrUpdateProduct(Product product);

    /**
     * 修改成品销售状态
     * @param productId
     * @param status
     * @return
     */
    public ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    /**
     * 获取商品详情
     * @param productId
     * @return
     */
    public ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
}
