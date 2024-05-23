package day240523.practice.teach;

/**
 * 练习3：模拟你的网站支持用户发表评论，但是，根据政策，需要进行敏感词过滤，把所有敏感词替换成***
 * 备注：敏感词不止一个，是一个词库
 */
public class T3SensitiveWords {
    static String[] sensitiveWords = new String[] {"包子", "SB", "良心"};

    public static void main(String[] args) {
        String input = "早上买的包子实惠又美味，店老板说他自己是SB，但是讲良心";
        System.out.println("原始内容：" + input);
        for (int i = 0; i < sensitiveWords.length; i++) {
            input = input.replace(sensitiveWords[i], "***");
            System.out.println("检测到敏感词【"+sensitiveWords[i]+"】，已替换：" + input);
        }
        System.out.println("过滤之后：" + input);
    }
}
