package zhang.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class User implements Serializable {
    @Id
    private Integer id;
    private String username="0";
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
