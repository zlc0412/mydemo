package cn.itcast.doman;

import java.io.Serializable;

/**
 * @auther zlc
 * @date 2019-05-23 16:28
 * @description javabean
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
