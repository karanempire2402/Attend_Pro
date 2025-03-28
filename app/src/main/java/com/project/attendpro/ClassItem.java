package com.project.attendpro;

public class ClassItem {

    private long cid;

    public ClassItem(long cid, String className, String sectionName) {
        this.cid = cid;
        this.className = className;
        this.sectionName = sectionName;
    }

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    private String sectionName;

    public ClassItem(String className, String sectionName) {
        this.className = className;
        this.sectionName = sectionName;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
