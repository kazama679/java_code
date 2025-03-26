package ss19.b2;
@FunctionalInterface
public interface IFunction<R, T> {
    R apply(T t);
}