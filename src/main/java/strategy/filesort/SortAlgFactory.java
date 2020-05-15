package strategy.filesort;

import strategy.filesort.impl.ConcurrentExternalSort;
import strategy.filesort.impl.ExternalSort;
import strategy.filesort.impl.MapReduceSort;
import strategy.filesort.impl.QuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neilz
 * @create 2020/5/15 15:45
 */
public class SortAlgFactory {
    private static final Map algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return (ISortAlg) algs.get(type);
    }
}
