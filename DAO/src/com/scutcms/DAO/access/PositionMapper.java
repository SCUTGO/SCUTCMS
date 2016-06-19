package com.scutcms.DAO.access;

import com.scutcms.DAO.entity.Position;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class PositionMapper{
	/**
	 * 向数据库中保存职位信息
	 * @param position
	 */
	public void insert(Position position){

	}

	/**
	 * 更新职位信息
	 * @param position
	 */
	public void update(Position position){

	}

	/**
	 * 删除职位信息
	 * @param position
	 */
	public void delete(Position position){

	}

	/**
	 * @param PositionName
	 * @return 如果数据库中存在该职位信息，则返回职位的对象；否则返回null
	 */
	public Position getPositionByPositionName(String PositionName){
		Position position=new Position();
		return position;
	}
}