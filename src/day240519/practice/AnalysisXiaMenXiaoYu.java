package day240519.practice;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AnalysisXiaMenXiaoYu implements AnalysisWebsite {

    // 设置返回的字符串
    String result;

    @Override
    public String Analysis(Document document, String key)  {



        // 先假设这里有具体分析算法
        Elements es = document.select("tbody[id=threadlist]").select("tr[class=tr3]");
//        System.out.println(es.size());

        /*
        // target
        String target = "苹果";
         */
        // target
        String target = key;

        // 循环遍历
        for (Element e : es) {
            // 过滤公告、置顶
            Element noticeAndTop = e.select("td.icon a i").first();
            if (noticeAndTop.hasAttr("alt") && "置顶帖标志".equals(noticeAndTop.attr("alt"))) {
                continue;
            }

            // 解析数据
            Element titleElement = e.select("td.subject a.subject_t").first();
            String title = titleElement.text();
            String url = titleElement.attr("href");
            url = "http://bbs.xmfish.com/" + url;
            String createdAt = e.select("td.author").first().select("p").text();
            /*System.out.println("标题：" + title);
            System.out.println("链接：" + url);
            System.out.println("发布时间：" + createdAt);
            System.out.println("----------");*/

            /*
            // 关键词判断
            if (title.contains(target)) {
                System.out.println("命中了你设置的关键词：" + target);
                System.out.println("标题：" + title);
                System.out.println("链接：" + url);
                System.out.println("发布时间：" + createdAt);
                System.out.println("~~~ --- ~~~");
                String msg = "命中了你设置的关键词：" + target + "<br>" +
                        "标题：" + title + "<br>" +
                        "链接：" + url + "<br>" +
                        "发布时间：" + createdAt;
            }
            */
            // 关键词判断
            if (title.contains(target)) {
                System.out.println("命中了你设置的关键词：" + target);
                System.out.println("标题：" + title);
                System.out.println("链接：" + url);
                System.out.println("发布时间：" + createdAt);
                System.out.println("~~~ --- ~~~");
                String msg = "发现了你感兴趣的内容：" + target + "<br>" +
                        "标题：" + title + "<br>" +
                        "链接：" + url + "<br>" +
                        "发布时间：" + createdAt;
                result = msg + " - - - ";
            }
        }
        return result;

    }
}
