package foo;

public class regionTest {
/*
 
 package com.elitech.iot.bll.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.elitech.iot.bll.service.RegionService;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import common.gen.bean.BeanFactory;
import common.gen.bean.RegionBean;
import common.service.ServiceImpl;

/**
 * @author fly
 *
 */
/*public class RegionServiceImpl extends ServiceImpl<RegionBean>implements RegionService {

  public final static List<RegionBean> regionsCache = new ArrayList<RegionBean>();
  public final static List<RegionBean> regionsCacheWithNull = new ArrayList<RegionBean>();

  
   * (non-Javadoc)
   * 
   * @see com.elitech.iot.bll.service.RegionService#getRegionsCache()
   
  @Override
  public List<RegionBean> getRegionsCache() {
    if (regionsCache.isEmpty()) {
      initCache();
      return regionsCache;
    }
    return regionsCache;
  }

  
   * (non-Javadoc)
   * 
   * @see com.elitech.iot.bll.service.RegionService#clearRegionCache()
   
  @Override
  public void clearRegionCache() {
    regionsCache.clear();
    regionsCacheWithNull.clear();
  }

  *//**
   * 
   *//*
  private void initCache() {
    RegionBean region = BeanFactory.get().createRegionBean();
    if (regionsCache.isEmpty()) {
      String where = "province is not null and city is not null and district is not null order by id";
      List<RegionBean> list = query(region, -1, -1, where);
      list = (list != null ? list : new ArrayList<RegionBean>());
      regionsCache.addAll(list);
    }
    if (regionsCacheWithNull.isEmpty()) {
      String where = "province is not null  order by id";
      List<RegionBean> list = query(region, -1, -1, where);
      list = (list != null ? list : new ArrayList<RegionBean>());
      regionsCacheWithNull.addAll(list);
    }
  }

  
   * (non-Javadoc)
   * 
   * @see com.elitech.iot.bll.service.RegionService#getProvinces()
   
  @Override
  public HashMultimap<String, String> getProvinceCity() {
    initCache();
    HashMultimap<String, String> provinceCitymap = HashMultimap.create();
    for (RegionBean po : regionsCache) {
      provinceCitymap.put(po.getProvince(), po.getCity());
    }
    return provinceCitymap;
  }

  
   * (non-Javadoc)
   * 
   * @see com.elitech.iot.bll.service.RegionService#getCityArea(java.lang.String, java.lang.String)
   
  @Override
  public Set<String> getCityArea(String province, String city) {
    initCache();
    Set<String> districts = new HashSet<String>();
    for (RegionBean po : regionsCache) {
      String district = po.getDistrict();
      if (po.getProvince().equals(province) && po.getCity().equals(city)) {
        // 构建市-区县级数据
        districts.add(district);
      }
    }
    return districts;
  }

  
   * (non-Javadoc)
   * 
   * @see com.elitech.iot.bll.service.RegionService#getRegionJSON()
   
  @Override
  public List<Map<String, Object>> getRegionJSON() {
    List<Map<String, Object>> provinceList = Lists.newArrayList();
    Multimap<String, String> provinceCity = getProvinceCity();
    Set<String> provinces = provinceCity.keySet();
    for (String p1 : provinces) {
      Set<String> cities = (Set<String>) provinceCity.get(p1); // 省下的所有的市
      Multimap<String, Object> mm = ArrayListMultimap.create();
      Map<String, Object> provincemm = new HashMap<String, Object>();
      for (String c1 : cities) {
        Set<String> districts = getCityArea(p1, c1);// 获得区信息
        Map<String, Object> citymm = new HashMap<String, Object>();// 市-区 //市-区
        citymm.put("name", c1);
        citymm.put("areaList", districts);
        mm.put("cityList", citymm);
      }
      provincemm.put("name", p1);
      provincemm.put("cityList", mm.values());
      provinceList.add(provincemm);
    }
    return provinceList;
  }

  
   * (non-Javadoc)
   * 
   * @see com.elitech.iot.bll.service.RegionService#getRegionId(java.lang.String, java.lang.String, java.lang.String)
   
  @Override
  public Long getRegionId(String province, String city, String district) {
    RegionBean region = BeanFactory.get().createRegionBean();
    String where = "1 = 1";
    if (StringUtils.isNotBlank(province)) {
      where = where + " and province ='" + province + "'";
    } else {
      where = where + " and province is null";
    }
    if (StringUtils.isNotBlank(city)) {
      where = where + " and city ='" + city + "'";
    } else {
      where = where + " and city is null";
    }
    if (StringUtils.isNotBlank(district)) {
      where = where + " and district ='" + district + "'";
    } else {
      where = where + " and district is null";
    }

    RegionBean po = queryOne(region, where);
    return po != null ? po.getId() : null;
  }*/

}

 
