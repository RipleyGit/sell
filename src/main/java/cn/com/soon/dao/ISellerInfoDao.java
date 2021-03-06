package cn.com.soon.dao;

import cn.com.soon.model.SellerInfo;

public interface ISellerInfoDao extends IBaseDao{
    int deleteByPrimaryKey(String sellerId);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    SellerInfo selectByPrimaryKey(String sellerId);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);


    SellerInfo findSellerInfoByOpenid(String opendId);
}