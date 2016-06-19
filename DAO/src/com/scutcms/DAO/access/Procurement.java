package com.scutcms.DAO.access;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class Procurement {
    /**
     * 向数据库中保存采购信息
     * @param procurement
     */
    public void insertprocurement(Procurement procurement){}

    /**
     * 更新采购信息
     * @param procurement
     */
    public void updateprocurement(Procurement procurement){}

    /**
     * 删除采购信息
     * @param procurement
     */
    public void deleteprocurement(Procurement procurement){}

    /**
     * 通过产品名称查找采购信息
     * @param productName
     * @return 如果数据库中存在该采购信息，则返回采购的对象；否则返回null
     */
    public Procurement getprocurementByproductName(String productName){
        Procurement procurement=new Procurement();
        return procurement;
    }
}
