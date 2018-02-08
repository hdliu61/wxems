package com.hdliu.wxems.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TStudentClass implements Serializable {
    /**
     * 学生选课表id
     */
    private Integer id;

    /**
     * 教师开班id
     */
    private Integer teacherClassId;

    /**
     * 班内分组
     */
    private Boolean group;

    /**
     * 班内角色0普通，1组长，2班长
     */
    private Boolean role;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherClassId() {
        return teacherClassId;
    }

    public void setTeacherClassId(Integer teacherClassId) {
        this.teacherClassId = teacherClassId;
    }

    public Boolean getGroup() {
        return group;
    }

    public void setGroup(Boolean group) {
        this.group = group;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
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
        TStudentClass other = (TStudentClass) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherClassId() == null ? other.getTeacherClassId() == null : this.getTeacherClassId().equals(other.getTeacherClassId()))
            && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherClassId() == null) ? 0 : getTeacherClassId().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherClassId=").append(teacherClassId);
        sb.append(", group=").append(group);
        sb.append(", role=").append(role);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}