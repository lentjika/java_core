import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayExtensions {
    public static void Swap(Object[] inArray, int firstElement, int secondElement) {
        if (inArray == null)
            throw new IllegalArgumentException("inArray");
        if (firstElement >= inArray.length)
            throw new IndexOutOfBoundsException("firstElement находится за границами входного массива");
        if (secondElement >= inArray.length)
            throw new IndexOutOfBoundsException("secondElement находится за границами входного массива");

        var tmpElement = inArray[firstElement];
        inArray[firstElement] = inArray[secondElement];
        inArray[secondElement] = tmpElement;
    }

    public static <E> List<E> createListFromArray(E[] inArray) {
        if (inArray == null)
            throw new IllegalArgumentException("inArray");
        return Arrays.asList(inArray);
    }
}
