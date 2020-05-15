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
        // [0, 6GB)
        if (fileSize < 6 * GB) {
            quickSort(filePath);
        } // [6GB, 10GB)
        else if (fileSize < 10 * GB) {
            externalSort(filePath);
        } // [10GB, 100GB)
        else if (fileSize < 100 * GB) {
            concurrentExternalSort(filePath);
        } // [100GB, ~)
        else {
            mapreduceSort(filePath);
        }
    }
    
    private void quickSort(String filePath) {
    }

    private void externalSort(String filePath) {
    }

    private void concurrentExternalSort(String filePath) {
    }

    private void mapreduceSort(String filePath) {
    }
}

class SortingTool {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }
}