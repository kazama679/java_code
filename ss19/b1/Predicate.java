package ss19.b1;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}