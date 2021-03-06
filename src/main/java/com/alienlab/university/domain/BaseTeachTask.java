package com.alienlab.university.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A BaseTeachTask.
 */
@Entity
@Table(name = "base_teach_task")
@ApiModel(value="教学任务")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BaseTeachTask implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "term_no")
    @ApiModelProperty(value="学期")
    private String termNo;

    @ManyToOne
    @ApiModelProperty(value="教学任务班级")
    private BaseClasses classes;

    @ManyToOne
    @ApiModelProperty(value="教学任务课程")
    private BaseMajorCourse course;

    @ManyToOne
    @ApiModelProperty(value="教学任务教师")
    private BaseTeacher teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermNo() {
        return termNo;
    }

    public BaseTeachTask termNo(String termNo) {
        this.termNo = termNo;
        return this;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public BaseClasses getClasses() {
        return classes;
    }

    public BaseTeachTask classes(BaseClasses baseClasses) {
        this.classes = baseClasses;
        return this;
    }

    public void setClass(BaseClasses baseClasses) {
        this.classes = baseClasses;
    }

    public BaseMajorCourse getCourse() {
        return course;
    }

    public BaseTeachTask course(BaseMajorCourse baseMajorCourse) {
        this.course = baseMajorCourse;
        return this;
    }

    public void setCourse(BaseMajorCourse baseMajorCourse) {
        this.course = baseMajorCourse;
    }

    public BaseTeacher getTeacher() {
        return teacher;
    }

    public BaseTeachTask teacher(BaseTeacher baseTeacher) {
        this.teacher = baseTeacher;
        return this;
    }

    public void setTeacher(BaseTeacher baseTeacher) {
        this.teacher = baseTeacher;
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseTeachTask baseTeachTask = (BaseTeachTask) o;
        if (baseTeachTask.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), baseTeachTask.getId());
    }
*/

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BaseTeachTask{" +
            "id=" + getId() +
            ", termNo='" + getTermNo() + "'" +
            "}";
    }
}
