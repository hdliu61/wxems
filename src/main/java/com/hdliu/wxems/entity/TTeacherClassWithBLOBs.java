package com.hdliu.wxems.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TTeacherClassWithBLOBs extends TTeacherClass implements Serializable {
    /**
     * 课程介绍（上限64K）
     */
    private String introduction;

    /**
     * 课程大纲（上限64K）
     */
    private String syllabus;

    private static final long serialVersionUID = 1L;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
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
        TTeacherClassWithBLOBs other = (TTeacherClassWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherSubjectId() == null ? other.getTeacherSubjectId() == null : this.getTeacherSubjectId().equals(other.getTeacherSubjectId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getClasses() == null ? other.getClasses() == null : this.getClasses().equals(other.getClasses()))
            && (this.getPushSwitch() == null ? other.getPushSwitch() == null : this.getPushSwitch().equals(other.getPushSwitch()))
            && (this.getPassageway() == null ? other.getPassageway() == null : this.getPassageway().equals(other.getPassageway()))
            && (this.getSendkey() == null ? other.getSendkey() == null : this.getSendkey().equals(other.getSendkey()))
            && (this.getLastPush() == null ? other.getLastPush() == null : this.getLastPush().equals(other.getLastPush()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getSyllabus() == null ? other.getSyllabus() == null : this.getSyllabus().equals(other.getSyllabus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTeacherSubjectId() == null) ? 0 : getTeacherSubjectId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getClasses() == null) ? 0 : getClasses().hashCode());
        result = prime * result + ((getPushSwitch() == null) ? 0 : getPushSwitch().hashCode());
        result = prime * result + ((getPassageway() == null) ? 0 : getPassageway().hashCode());
        result = prime * result + ((getSendkey() == null) ? 0 : getSendkey().hashCode());
        result = prime * result + ((getLastPush() == null) ? 0 : getLastPush().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getSyllabus() == null) ? 0 : getSyllabus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", introduction=").append(introduction);
        sb.append(", syllabus=").append(syllabus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}