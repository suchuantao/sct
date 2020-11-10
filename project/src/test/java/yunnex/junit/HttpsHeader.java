package yunnex.junit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/27 17:02
 */
public class HttpsHeader {
   /**
    * 商户后台请求头
    * @param key
    * @param value
    * @return
    */
//    public static String shophttpsheader() {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("Connection", "keep-alive");
//        map.put("Accept", "application/json, text/plain, */*");
//        map.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
//        map.put("Content-Type", "application/json;charset=UTF-8");
//        map.put("Accept-Encoding", "gzip, deflate, br");
//        map.put("Accept-Language", "zh-CN,zh;q=0.9");
//        Set<String> keys = map.keySet();
//        for (String string : keys) {
//            String values = map.get(string);
//        }
//
//    }
//    return 1;

   /**
    * 微信端请求头cookie信息
    */
   public static Map<String, String> wectchcookie() {
      Map<String, String> wectchcookie = new HashMap<String, String>();
      wectchcookie.put("JSESSIONID", "887B9AF78C8567739EFDAFBF543C6D83");
      wectchcookie.put("10755677539392954368", "o7PBbxFBonVhhDjI57StGMOxRoEs");
      wectchcookie.put("zbotoken", "o7PBbxFBonVhhDjI57StGMOxRoEs");
      return wectchcookie;
   }

   /**
    * 微信端请求header
    *
    * @return
    */
   public static Map<String, String> wectchHeader() {
      Map<String, String> wectchHeader = new HashMap<String, String>();
      wectchHeader.put("Accep", "text/html,application/xhtml+xml,application/xml");
      wectchHeader.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E302 MicroMessenger/7.0.15(0x17000f31) NetType/WIFI Language/zh_CN");
      return wectchHeader;

   }

   /**
    *
    */
   public static Map<String, String> zhctwectchHeader() {
      Map<String, String> zhctwectchHeader = new HashMap<String, String>();
      zhctwectchHeader.put("Accep", "application/json, text/plain, */*");
      zhctwectchHeader.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E302 MicroMessenger/7.0.15(0x17000f31) NetType/WIFI Language/zh_CN");
      zhctwectchHeader.put("Content-Type","application/json;charset=UTF-8");
      zhctwectchHeader.put("X-Requested-With","XMLHttpRequest");
      return zhctwectchHeader;

   }
}

