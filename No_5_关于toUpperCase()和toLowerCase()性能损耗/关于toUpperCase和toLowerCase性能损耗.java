import java.util.ArrayList;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2018.1.09
 * @since Jdk 1.8
 */
public class 关于toUpperCase和toLowerCase性能损耗 {

    private int count = 100000000;

    private ArrayList<String> list = new ArrayList();

    {
        list.add("ABCD");
        list.add("Efgh");
        list.add("ijkl");
    }

    public void 不使用toUpperCase和toLowerCase() {
        Integer result = 0;
        for (int i = 0; i < count; i++) {
            for (String temp : list) {
                switch (temp) {
                    case "ABCD":
                        result++;
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(result);
    }

    public void 使用toUpperCase() {
        Integer result = 0;
        for (int i = 0; i < count; i++) {
            for (String temp : list) {
                switch (temp.toUpperCase()) {
                    case "ABCD":
                        result++;
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(result);
    }

    public void 使用toLowerCase() {
        Integer result = 0;
        for (int i = 0; i < count; i++) {
            for (String temp : list) {
                switch (temp.toLowerCase()) {
                    case "abcd":
                        result++;
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // toUpperCase和toLowerCase 明显拖慢速率  四字母 测试大概 toUpperCase和toLowerCase 是不转化的 3倍左右,用toUpperCase或toLowerCase，一次操作大概拖慢0.00004秒
        关于toUpperCase和toLowerCase性能损耗 内容 = new 关于toUpperCase和toLowerCase性能损耗();
        Timer t1 = new Timer();
        内容.不使用toUpperCase和toLowerCase();
        System.out.println(t1.result(Timer.Precision.MSEC));
        Timer t2 = new Timer();
        内容.使用toLowerCase();
        System.out.println(t2.result(Timer.Precision.MSEC));
    }
}
