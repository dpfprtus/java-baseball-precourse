package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class GenerateNumber {

    public List<String> generate() {
        List<String> generatedNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            generatedNumberList.add(String.valueOf((int) (Math.random() * 10) + 1));
        }
        return generatedNumberList;
    }
}
