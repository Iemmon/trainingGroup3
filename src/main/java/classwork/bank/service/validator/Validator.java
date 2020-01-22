package classwork.bank.service.validator;

public interface Validator<T> {
    boolean validate(T entity);
}
