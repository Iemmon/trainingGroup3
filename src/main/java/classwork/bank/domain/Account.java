package classwork.bank.domain;

public class Account {

    private Integer id;
    private User user;
    private Integer money;

    public Account(Integer id, User user, Integer money) {
        this.id = id;
        this.user = user;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Integer getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                ", money=" + money +
                '}';
    }
}
