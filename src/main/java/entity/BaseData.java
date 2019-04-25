package entity;

import java.io.Serializable;
import java.util.Date;

public abstract  class BaseData<T> extends  BaseEntity implements Serializable {
    private static final long serialVersionUID=1;
    protected String remarks;
    protected String createBy;
    protected String updateBy;
    protected Date updateDate;

}
