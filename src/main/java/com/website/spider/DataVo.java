package com.website.spider;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小新
 * @date 2018/7/19
 */

public class DataVo implements Serializable{

    private static final long serialVersionUID = -4617624364648070199L;

    private Integer currentIndex;
    private Integer nextIndex;
    private Integer pageSize;
    private Integer preIndex;
    private Integer totalNumber;
    private Integer totalPage;

    private List<ItemVo> items;

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(Integer nextIndex) {
        this.nextIndex = nextIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPreIndex() {
        return preIndex;
    }

    public void setPreIndex(Integer preIndex) {
        this.preIndex = preIndex;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<ItemVo> getItems() {
        return items;
    }

    public void setItems(List<ItemVo> items) {
        this.items = items;
    }
}
