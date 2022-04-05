import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer tmp : source) {
            if (tmp < treshold) {
                logger.log("Элемент " + tmp + " не проходит");
            } else{
                logger.log("Элемент "+ tmp + " проходит");
                result.add(tmp);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}