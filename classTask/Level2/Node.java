package classTask.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node<T> {

    private T value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node<?> node)) return false;
        return Objects.equals(value, node.value);
    }

}
