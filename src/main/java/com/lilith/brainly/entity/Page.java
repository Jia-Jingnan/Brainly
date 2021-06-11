package com.lilith.brainly.entity;

/**
 * @Author:JiaJingnan
 * @Description: 封装分页相关信息
 * @Date: 23:03 2020/2/10 0010
 * @Modified By:
 */

public class Page {
    // 当前页码， 默认第一页
    private int current = 1;
    // 显示上线
    private int limit = 10;
    // 数据总数，用于计算中的页数
    private int rows;
    // 查询路径（用来复用分页连接）
    private String path;


    public int getCurrent() {
        return current;
    }

    // current做判断
    public void setCurrent(int current) {
        if(current >= 1){
            this.current = current;
        }

    }

    public int getLimit() {
        return limit;
    }

    // limit做判断
    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100){
            this.limit = limit;
        }

    }

    public int getRows() {
        return rows;
    }

    // rows做判断
    public void setRows(int rows) {
        if (rows >= 0){
            this.rows = rows;
        }

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     * @return
     */
    public int getOffset() {
        // current当前页 * limit每页数量 - limit(一页数量)
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal() {
        // rows总行数 / limit每页数量 （+1，不能整除时＋1）
        if (rows % limit == 0){
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }


    // 当前页面前后两页
    /**
     * 获取起始页码
     * @return
     */
    public int getFrom() {
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * 获取结束页码
     * @return
     */
    public int getTo() {
        int to  = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }

}
