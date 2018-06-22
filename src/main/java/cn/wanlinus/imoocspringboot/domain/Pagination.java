package cn.wanlinus.imoocspringboot.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 分页
 *
 * @author wanli
 */
public class Pagination<T> implements Serializable {
    private Integer currentPage;
    private Integer totalRecode;
    private Integer pageSize;
    private List<T> model;

    public Pagination() {
    }

    public Pagination(Integer currentPage, Integer totalRecode, Integer pageSize, List<T> model) {
        this.currentPage = currentPage;
        this.totalRecode = totalRecode;
        this.pageSize = pageSize;
        this.model = model;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalRecode() {
        return totalRecode;
    }

    public void setTotalRecode(Integer totalRecode) {
        this.totalRecode = totalRecode;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getModel() {
        return model;
    }

    public void setModel(List<T> model) {
        this.model = model;
    }
}
