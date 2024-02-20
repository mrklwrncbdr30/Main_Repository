package com.teamcid.teamcapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="chapter")
public class chapter {

    @Id
    @GeneratedValue

    @Column(name = "chapterid")     
    private int chapterId;

    @Column(name = "chapter_title")
    private String chapterTitle;

    @Column(name = "course_id")
    private String courseId;

    public int getChapterId() {
        return this.chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterTitle() {
        return this.chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

}
