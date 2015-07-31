import com.fanli.logparser.entity.ApacheLog;
import com.fanli.logparser.factory.LogParserFactory;
import com.fanli.logparser.parser.LogParser;

/**
 * Created by zcfrank1st on 7/31/15.
 */
public class Test2 {
    public static void main(String[] args) {
        LogParser apacheLogParser = new LogParserFactory().build("apache");
        String content = "2015-07-30T22:00:35Z apache.192.168.2.197 183.213.56.50 135576159.1531239869.2398529256 - [30/Jul/2015:22:00:00 +0800] \"GET /reg/inviteReg HTTP/1.1\" 200 1757 \"http://www.junshis.com/article.aspx?id=73037&DevPage=28\" \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36\" 90996 - passport.fanli.com 192.168.2.190 192.168.2.176 2404495967.1531239869.4091793770 - -";
        ApacheLog apacheLog = (ApacheLog)apacheLogParser.parse(content);
    }
}
