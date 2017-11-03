import java.util.List;

public class ObserverableProcessor implements Processor {
    @Override
    public void process(List<String> datas, ) {
        for (String data : datas) {
            ProcessedData result = doProcess(data);
            listener.onEvent(result);
        }
    }
