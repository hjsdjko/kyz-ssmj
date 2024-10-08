package com.entity.view;

import com.entity.CarEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 车辆
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-24
 */
@TableName("car")
public class CarView extends CarEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 车辆类型的值
		*/
		private String carValue;



	public CarView() {

	}

	public CarView(CarEntity carEntity) {
		try {
			BeanUtils.copyProperties(this, carEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 车辆类型的值
			*/
			public String getCarValue() {
				return carValue;
			}
			/**
			* 设置： 车辆类型的值
			*/
			public void setCarValue(String carValue) {
				this.carValue = carValue;
			}








}
