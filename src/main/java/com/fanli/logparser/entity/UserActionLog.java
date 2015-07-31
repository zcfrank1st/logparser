package com.fanli.logparser.entity;

/**
 * Created by zcfrank1st on 7/30/15.
 */
public class UserActionLog {
    private long uid;
    private long starttime;
    private long file_size;
    private long devid;
    private String clientip;
    private String logtype;
    private long userid;
    private String appversion;
    private String c_v;
    private String c_src;
    private String type;
    private String eventid;
    private long urltrackingid;
    private long deviceid;
    private long createtime;
    private long mc;
    private String eventdata;
    private String eventsubid;
    private long src;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getStarttime() {
        return starttime;
    }

    public void setStarttime(long starttime) {
        this.starttime = starttime;
    }

    public long getFile_size() {
        return file_size;
    }

    public void setFile_size(long file_size) {
        this.file_size = file_size;
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip;
    }

    public long getDevid() {
        return devid;
    }

    public void setDevid(long devid) {
        this.devid = devid;
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getC_v() {
        return c_v;
    }

    public void setC_v(String c_v) {
        this.c_v = c_v;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getC_src() {
        return c_src;
    }

    public void setC_src(String c_src) {
        this.c_src = c_src;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public long getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(long deviceid) {
        this.deviceid = deviceid;
    }

    public long getUrltrackingid() {
        return urltrackingid;
    }

    public void setUrltrackingid(long urltrackingid) {
        this.urltrackingid = urltrackingid;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    public long getMc() {
        return mc;
    }

    public void setMc(long mc) {
        this.mc = mc;
    }

    public String getEventdata() {
        return eventdata;
    }

    public void setEventdata(String eventdata) {
        this.eventdata = eventdata;
    }

    public String getEventsubid() {
        return eventsubid;
    }

    public void setEventsubid(String eventsubid) {
        this.eventsubid = eventsubid;
    }

    public long getSrc() {
        return src;
    }

    public void setSrc(long src) {
        this.src = src;
    }
}
