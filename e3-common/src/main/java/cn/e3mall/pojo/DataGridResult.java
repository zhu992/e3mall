package cn.e3mall.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zwy on 2019/7/14.
 */
public class DataGridResult implements Serializable {
    private long total;
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
