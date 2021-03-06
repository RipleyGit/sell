package cn.com.soon.service;

import cn.com.soon.dto.CartDTO;
import cn.com.soon.model.ProductInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 商品
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    PageInfo<ProductInfo> findAll(Integer page, Integer size);

    void save(ProductInfo productInfo);

    void updateByKey(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    void onSale(String productId);

    //下架
    ProductInfo offSale(String productId);
}
