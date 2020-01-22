package classwork.bank.service.validator;

import classwork.bank.domain.User;

public class UserValidator implements Validator<User> {

    @Override
    public boolean validate(User entity) {
        System.out.println("validate" + validateEmail(entity.getEmail()));
        return validateEmail(entity.getEmail()) && validatePassword(entity.getEmail());
    }

    public boolean validateEmail(String email){
        return email.matches(Pattern.EMAIL_PATTERN.toString());
    }

    public boolean validatePassword(String password){
        return password.matches(Pattern.PASSWORD_PATTERN.toString());
    }

}
