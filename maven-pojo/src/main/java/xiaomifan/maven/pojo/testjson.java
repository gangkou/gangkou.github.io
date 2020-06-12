package xiaomifan.maven.pojo;

/**
 * @author 小米饭
 * @date 2020/6/12
 * @descrition：xiaomifan.maven.pojo
 **/
public class testjson {

    /**
     * generate-->gsonformat-->{"属性名":值(类型),"属性名":值(类型)}
     */
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
