package entity;

import net.minidev.json.annotate.JsonIgnore;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity<T> implements Serializable {

    user currentUser;
    public BaseEntity(){}

    @JsonIgnore
    @XmlTransient
    public user getCurrentUser(){
        if (currentUser==null){
           this.currentUser=new user();
        }
        return currentUser;
    }

}
