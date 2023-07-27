package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras =new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public <T> T method1(T value){
        return value;
    }

    public <T, E> T method2(T value1, E value2){
        return value1;
}
}
