package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.CarDao;
import com.entity.CarEntity;
import com.service.CarService;
import com.entity.view.CarView;

/**
 * 车辆 服务实现类
 * @author 
 * @since 2021-02-24
 */
@Service("carService")
@Transactional
public class CarServiceImpl extends ServiceImpl<CarDao, CarEntity> implements CarService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CarView> page =new Query<CarView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
