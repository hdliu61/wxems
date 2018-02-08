package com.hdliu.wxems.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TTeacherClass implements Serializable {
    /**
     * 开班id
     */
    private Integer id;

    /**
     * 教师开课id
     */
    private Integer teacherSubjectId;

    /**
     * 班级名字
     */
    private String name;

    /**
     * 班次
     */
    private String classes;

    /**
     * 推送开关，1开启，0关闭
     */
    private Boolean pushSwitch;

    /**
     * PushBear通道
     */
    private String passageway;

    /**
     * 微信推送密匙
     */
    private String sendkey;

    /**
     * 最后推送时间
     */
    private Date lastPush;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherSubjectId() {
        return teacherSubjectId;
    }

    public void setTeacherSubjectId(Integer teacherSubjectId) {
        this.teacherSubjectId = teacherSubjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Boolean getPushSwitch() {
        return pushSwitch;
    }

    public void setPushSwitch(Boolean pushSwitch) {
        this.pushSwitch = pushSwitch;
    }

    public String getPassageway() {
        return passageway;
    }

    public void setPassageway(String passageway) {
        this.passageway = passageway;
    }

    public String getSendkey() {
        return sendkey;
    }

    public void setSendkey(String sendkey) {
        this.sendkey = sendkey;
    }

    public Date getLastPush() {
        return lastPush;
    }

    public void setLastPush(Date lastPush) {
        this.lastPush = lastPush;
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
        TTeacherClass other = (TTeacherClass) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTeacherSubjectId() == null ? other.getTeacherSubjectId() == null : this.getTeacherSubjectId().equals(other.getTeacherSubjectId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getClasses() == null ? other.getClasses() == null : this.getClasses().equals(other.getClasses()))
            && (this.getPushSwitch() == null ? other.getPushSwitch() == null : this.getPushSwitch().equals(other.getPushSwitch()))
            && (this.getPassageway() == null ? other.getPassageway() == null : this.getPassageway().equals(other.getPassageway()))
            && (this.getSendkey() == null ? other.getSendkey() == null : this.getSendkey().equals(other.getSendkey()))
            && (this.getLastPush() == null ? other.getLastPush() == null : this.getLastPush().equals(other.getLastPush()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherSubjectId=").append(teacherSubjectId);
        sb.append(", name=").append(name);
        sb.append(", classes=").append(classes);
        sb.append(", pushSwitch=").append(pushSwitch);
        sb.append(", passageway=").append(passageway);
        sb.append(", sendkey=").append(sendkey);
        sb.append(", lastPush=").append(lastPush);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}