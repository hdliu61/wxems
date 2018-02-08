package com.hdliu.wxems.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TTeacherSubject implements Serializable {
    /**
     * 教师开课id
     */
    private Integer id;

    /**
     * 学院开课id
     */
    private Integer collegeSubjectId;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 最大班级数
     */
    private Boolean maxClass;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollegeSubjectId() {
        return collegeSubjectId;
    }

    public void setCollegeSubjectId(Integer collegeSubjectId) {
        this.collegeSubjectId = collegeSubjectId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Boolean getMaxClass() {
        return maxClass;
    }

    public void setMaxClass(Boolean maxClass) {
        this.maxClass = maxClass;
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
        TTeacherSubject other = (TTeacherSubject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCollegeSubjectId() == null ? other.getCollegeSubjectId() == null : this.getCollegeSubjectId().equals(other.getCollegeSubjectId()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getMaxClass() == null ? other.getMaxClass() == null : this.getMaxClass().equals(other.getMaxClass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCollegeSubjectId() == null) ? 0 : getCollegeSubjectId().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getMaxClass() == null) ? 0 : getMaxClass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", collegeSubjectId=").append(collegeSubjectId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", maxClass=").append(maxClass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}