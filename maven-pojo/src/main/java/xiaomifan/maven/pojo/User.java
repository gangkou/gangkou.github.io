package xiaomifan.maven.pojo;

/**
 * @author 小米饭
 * @date 2020/5/18
 * @descrition：xiaomifan.manger.pojo
 **/
public class User {
    private String username;
    private String userid;
    private String money;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userid='" + userid + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
