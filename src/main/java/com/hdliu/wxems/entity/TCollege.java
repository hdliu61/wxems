package com.hdliu.wxems.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TCollege implements Serializable {
    /**
     * 学院id
     */
    private Integer id;

    /**
     * 学院名
     */
    private String name;

    /**
     * 学院描述
     */
    private String description;

    /**
     * 院长id
     */
    private Integer dean;

    /**
     * 学院管理员
     */
    private Integer administrator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDean() {
        return dean;
    }

    public void setDean(Integer dean) {
        this.dean = dean;
    }

    public Integer getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Integer administrator) {
        this.administrator = administrator;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TCollege other = (TCollege) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDean() == null ? other.getDean() == null : this.getDean().equals(other.getDean()))
            && (this.getAdministrator() == null ? other.getAdministrator() == null : this.getAdministrator().equals(other.getAdministrator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDean() == null) ? 0 : getDean().hashCode());
        result = prime * result + ((getAdministrator() == null) ? 0 : getAdministrator().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", dean=").append(dean);
        sb.append(", administrator=").append(administrator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}