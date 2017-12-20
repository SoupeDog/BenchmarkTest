/**
 * 描述信息：<br/>
 * 计时工具
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.20
 * @since Jdk 1.8
 */
public class Timer {
    /**
     * 起始时间点 UTC 毫秒级时间戳
     */
    private Long startPoint;
    /**
     * 结束时间点 UTC 毫秒级时间戳
     */
    private Long endPoint;

    public Timer() {
        startPoint = System.currentTimeMillis();
    }

    public Timer(Long startPoint) {
        this.startPoint = startPoint;
    }

    public Long getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Long startPoint) {
        this.startPoint = startPoint;
    }

    public Long getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Long endPoint) {
        this.endPoint = endPoint;
    }

    /**
     * 刷新结束时间戳
     */
    public void stop() {
        endPoint = System.currentTimeMillis();
    }

    /**
     * 返回耗时结果
     *
     * @return 毫秒级起止时间差
     */
    public Long result() {
        stop();
        return endPoint - startPoint;
    }

    /**
     * 返回耗时结果打印信息
     *
     * @param precision 精确度
     * @return 耗时结果打印信息
     */
    public String result(Precision precision) {
        String result = null;
        switch (precision) {
            case MSEC:
                result = "耗时：" + result() + " 毫秒";
                break;
            case SEC:
                result = "耗时：" + Math.floor(result() / 1000) + " 秒";
                break;
            case MIN:
                result = "耗时：" + Math.floor((result() / 1000) / 60) + " 分钟";
                break;
            default:
                System.out.println("Unexpected Precision.");
                break;
        }
        return result;
    }

    public enum Precision {
        MSEC("毫秒"),
        SEC("秒"),
        MIN("分钟");
        private String description;

        Precision(String description) {
            this.description = description;
        }
    }

}
