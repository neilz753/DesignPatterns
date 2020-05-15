package strategy.filesort;

import strategy.filesort.impl.ConcurrentExternalSort;
import strategy.filesort.impl.ExternalSort;
import strategy.filesort.impl.MapReduceSort;
import strategy.filesort.impl.QuickSort;

import java.io.File;

/**
 * @author neilz
 * @create 2020/5/15 11:06
 */
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        // [0, 6GB)
        if (fileSize < 6 * GB) {
            sortAlg = new QuickSort();
        } // [6GB, 10GB)
        else if (fileSize < 10 * GB) {
            sortAlg = new ExternalSort();
        } // [10GB, 100GB)
        else if (fileSize < 100 * GB) {
            sortAlg = new ConcurrentExternalSort();
        } // [100GB, ~)
        else {
            sortAlg = new MapReduceSort();
        }
        sortAlg.sort(filePath);
    }

}