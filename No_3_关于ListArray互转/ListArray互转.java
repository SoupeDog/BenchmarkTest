import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.21
 * @since Jdk 1.8
 */
public class ListArray互转 {

    private int count = 10000000;

    private ArrayList list = new ArrayList() {{
        add(new User() {{
            setUid("U0000001");
            setuName("张三");
        }});
        add(new User() {{
            setUid("U0000002");
            setuName("李四");
        }});
        add(new User() {{
            setUid("U0000003");
            setuName("王五");
        }});
        add(new User() {{
            setUid("U0000004");
            setuName("赵六");
        }});
        add(new User() {{
            setUid("U0000005");
            setuName("田七");
        }});
        add(new User() {{
            setUid("U0000006");
            setuName("炎八");
        }});
        add(new User() {{
            setUid("U0000007");
            setuName("琴九");
        }});
    }};

    private Object[] array = list.toArray(new User[0]);

    public void ListToArray() {
        for (int i = 0; i < count; i++) {
            Object[] temp = list.toArray();
        }
    }

    public void ArrayToList() {
        for (int i = 0; i < count; i++) {
            List temp = Arrays.asList(array);
        }
    }

    public static void main(String[] args) {
        // List 转 array 相对较慢 千万级开始出现人能感知的延迟
        ListArray互转 内容 = new ListArray互转();
        Timer t1 = new Timer();
        内容.ArrayToList();
        System.out.println(t1.result(Timer.Precision.MSEC));
        Timer t2 = new Timer();
        内容.ListToArray();
        System.out.println(t2.result(Timer.Precision.MSEC));
    }
}
