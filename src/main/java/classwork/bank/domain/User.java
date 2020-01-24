package classwork.bank.domain;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static classwork.bank.utility.CollectionUtility.nullSafeListInit;

public class User implements Comparable<User>{
    private Long id;
    private String email;
    private String password;
    private List<Account> accounts;
    private String salt;

    public User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
        this.accounts = nullSafeListInit(builder.accounts);
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        salt = new String(array, Charset.forName("UTF-8"));
        //salt = "aaa";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSalt() {
        return salt;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + "[********]" + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(accounts, user.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, accounts);
    }

    @Override
    public int compareTo(User o) {
        return (int) (this.id - o.id);
    }

    public static class Builder {
        private Long id;
        private String email;
        private String password;
        private List<Account> accounts;

        private Builder() {
        }

        public User build() {
            return new User(this);
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withAccounts(List<Account> accounts) {
            this.accounts = accounts;
            return this;
        }
    }
}
