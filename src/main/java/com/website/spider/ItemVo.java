package com.website.spider;

import java.io.Serializable;

/**
 * @author 小新
 * @date 2018/7/19
 */

public class ItemVo implements Serializable {

    private static final long serialVersionUID = -3455135940049662438L;

    private String brandCode;
    private String brandName;

    private String provinceCode;
    private String provinceName;

    private String cityCode;
    private String cityName;

    private String firstLicensePlateDate;

    private String mileage;

    private String modelName;
    private String seriesName;

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getFirstLicensePlateDate() {
        return firstLicensePlateDate;
    }

    public void setFirstLicensePlateDate(String firstLicensePlateDate) {
        this.firstLicensePlateDate = firstLicensePlateDate;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
