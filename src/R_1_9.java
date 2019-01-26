/*
public class R_1_9 {
    public String trimPunct(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean need_filter = false;
            char punct[] = {',', '.', '!', '?', ';', ':', '，', '。', '！', '？',
                    '；', '：', '、'};
            for (int j = 0; j < punct.length; j++) {
                if (s.charAt(i) == punct[j]) {
                    need_filter = true;
                    break;
                }
            }
            if (!need_filter) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

*/


class test {
    public String trimPunct(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char punct[] = {',', '.', '!', '?', ';', ':', '，', '。', '！', '？',
                    '；', '：', '、'};
            boolean need_filter = false;
            for(char c: punct) {           //遍历array的话，用foreach更方便
                if (c == s.charAt(i)) {
                    need_filter = true;
                    break;
                }
            }
            if (!need_filter) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}





















