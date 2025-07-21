package Program;

import java.net.SocketTimeoutException;
import com.slascone.ApiException;

/**
 * Functional interface similar to BiFunction but allows throwing ApiException
 */
@FunctionalInterface
public interface ApiCallFunction<T, U, R> {
    R apply(T t, U u) throws ApiException, SocketTimeoutException;
}
