package com.fanli.logparser.parser;

import com.fanli.logparser.entity.ApacheLog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zcfrank1st on 7/30/15.
 */
public class ApacheParser implements LogParser{
    private static Pattern apacheLogPattern =  Pattern.compile("^([^ ]+) ([^ ]+) (-|[^-]*) (-|[^ ]*) (?:[^ ]+) \\[([^\\]]*)\\] \"([^ ]*) ([^ ]*) ([^ ]*)\" (\\d*) (-|\\d*) \"([^ ]*)\" \"(.*)\" ([^ ]*) ([^ ]*) ([^ ]*) ([^ ]+) ([^ ]+)(?: ([^ ]*) ([^ ]*) ([^ ]*))?");

    public ApacheLog parse(String content) {
        Matcher m = apacheLogPattern.matcher(content);
        if (m.find()) {
            return buildApacheLogEntity(m);
        }
        return null;
    }

    private ApacheLog buildApacheLogEntity(Matcher m) {
        ApacheLog apacheLog = new ApacheLog();
        apacheLog.setFluentd_time(m.group(1));
        apacheLog.setFluentd_tag(m.group(2));
        apacheLog.setUser_ip(m.group(3));
        apacheLog.setUtmo(m.group(4));
        apacheLog.setTime(m.group(5));
        apacheLog.setMethod(m.group(6));
        apacheLog.setPath(m.group(7));
        apacheLog.setProtocol(m.group(8));
        apacheLog.setStatus(m.group(9));
        apacheLog.setBytes(m.group(10));
        apacheLog.setReferer(m.group(11));
        apacheLog.setUser_agent(m.group(12));
        apacheLog.setLatency(m.group(13));
        apacheLog.setUser_id(m.group(14));
        apacheLog.setHost(m.group(15));
        apacheLog.setLocal_ip(m.group(16));
        apacheLog.setRemote_ip(m.group(17));
        apacheLog.setUtmp(m.group(18));
        apacheLog.setUtmt(m.group(19));
        apacheLog.setMarkcode(m.group(20));
        return apacheLog;
    }
}
