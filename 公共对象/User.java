/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.21
 * @since Jdk 1.8
 */
public class User {
    /**
     * 唯一标示
     */
    private Integer id;
    /**
     * 账号
     */
    private String uid;
    /**
     * 密码
     */
    private String pw;
    /**
     * 头像 url
     */
    private String headIcon;
    /**
     * 用户类型
     */
    private Byte userType;
    /**
     * 用户昵称
     */
    private String uName;
    /**
     * 性别标识
     */
    private Boolean sex_Flag;
    /**
     * 生日毫秒级时间戳
     */
    private Long birthday;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 联系邮箱
     */
    private String email;
    /**
     * 个人简介
     */
    private String biography;
    /**
     * 经验值
     */
    private Integer exp;
    /**
     * 用户自定义配置
     */
    private String properties;
    /**
     * 合法性标识
     */
    private Boolean legal_Flag;
    /**
     * 注册毫秒级时间戳
     */
    private Long registTs;
    /**
     * 最后修改毫秒级时间戳
     */
    private Long lastUpdateTs;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Boolean getSex_Flag() {
        return sex_Flag;
    }

    public void setSex_Flag(Boolean sex_Flag) {
        this.sex_Flag = sex_Flag;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Boolean getLegal_Flag() {
        return legal_Flag;
    }

    public void setLegal_Flag(Boolean legal_Flag) {
        this.legal_Flag = legal_Flag;
    }

    public Long getRegistTs() {
        return registTs;
    }

    public void setRegistTs(Long registTs) {
        this.registTs = registTs;
    }

    public Long getLastUpdateTs() {
        return lastUpdateTs;
    }

    public void setLastUpdateTs(Long lastUpdateTs) {
        this.lastUpdateTs = lastUpdateTs;
    }
}
