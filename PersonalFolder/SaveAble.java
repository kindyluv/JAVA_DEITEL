package PersonalFolder;

import java.util.ArrayList;
import java.util.List;

public interface SaveAble {
    List<String> write();
    void read(List<String> savedValues);
}
