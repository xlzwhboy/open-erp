package com.skysport.inerfaces.model.info.area.helper;

import com.skysport.core.bean.system.SelectItem2;
import com.skysport.core.init.SpringContextHolder;
import com.skysport.core.cache.SystemBaseInfoCachedMap;
import com.skysport.inerfaces.model.info.area.impl.AreaManageServiceImpl;

import java.util.List;

/**
 * 类说明:
 * Created by zhangjh on 2015/7/7.
 */
public enum AreaManageServiceHelper {

    SINGLETONE;

    /**
     *
     */
    public void refreshSelect() {
        AreaManageServiceImpl areaManageService = SpringContextHolder.getBean("areaManageService");
        List<SelectItem2> areaItems = areaManageService.querySelectList(null);
        SystemBaseInfoCachedMap.SINGLETONE.pushBom("areaItems", areaItems);
        SystemBaseInfoCachedMap.SINGLETONE.pushProject("areaItems", areaItems);
    }
}
