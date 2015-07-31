import com.fanli.logparser.entity.UserActionLog;
import com.fanli.logparser.factory.LogParserFactory;
import com.fanli.logparser.parser.LogParser;

/**
 * Created by zcfrank1st on 7/31/15.
 */
public class Test {
    public static void main(String[] args) {
        LogParser userActionParser = new LogParserFactory().build("user_action");
        String content = "{\"uid\":32753953,\"starttime\":1425229199,\"file_size\":216,\"clientip\":null,\"devid\":21716278084549,\"userid\":32753953,\"appversion\":\"3.6.2.6\",\"c_v\":\"3.6.2.6\",\"c_src\":1,\"file_name\":null,\"eventid\":\"openApp\",\"deviceid\":21716278084549,\"createtime\":1425229200,\"c_aver\":null,\"duration\":0.0,\"mc\":17,\"eventdata\":\"\",\"eventsubid\":\"\",\"src\":1}";
        UserActionLog userActionLog = (UserActionLog) userActionParser.parse(content);

        String content1 = "{\"uid\":32753953,\"starttime\":1425221924,\"file_size\":216,\"clientip\":null,\"devid\":21716278084549,\"userid\":32753953,\"appversion\":\"3.6.2.6\",\"c_v\":\"3.6.2.6\",\"c_src\":1,\"file_name\":null,\"eventid\":\"appbanner_display\",\"deviceid\":21716278084549,\"createtime\":1425229200,\"c_aver\":null,\"duration\":0.0,\"mc\":17,\"eventdata\":\"\",\"eventsubid\":\"40485\",\"src\":1}";
        UserActionLog userActionLog1 = (UserActionLog)userActionParser.parse(content1);
        return;
    }
}
