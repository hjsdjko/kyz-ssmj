package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 车辆调度
 *
 * @author 
 * @email
 * @date 2021-02-24
 */
@TableName("diaodu")
public class DiaoduEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DiaoduEntity() {

	}

	public DiaoduEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车辆id
     */
    @TableField(value = "car_id")

    private String carId;


    /**
     * 排班
     */
    @TableField(value = "scheduling_types")

    private Integer schedulingTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆id
	 */
    public String getCarId() {
        return carId;
    }


    /**
	 * 获取：车辆id
	 */

    public void setCarId(String carId) {
        this.carId = carId;
    }
    /**
	 * 设置：排班
	 */
    public Integer getSchedulingTypes() {
        return schedulingTypes;
    }


    /**
	 * 获取：排班
	 */

    public void setSchedulingTypes(Integer schedulingTypes) {
        this.schedulingTypes = schedulingTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Diaodu{" +
            "id=" + id +
            ", carId=" + carId +
            ", schedulingTypes=" + schedulingTypes +
            ", createTime=" + createTime +
        "}";
    }
}
