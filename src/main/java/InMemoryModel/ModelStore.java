package InMemoryModel;
import ModelElements.Scene;
import ModelElements.PoligonalModel;
import ModelElements.Flash;
import ModelElements.Camera;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements  iModelChanger {
    public List<PoligonalModel> models;

    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver []  changeObservers;

    public ModelStore(iModelChangeObserver []  changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

    }

    @Override
    public void notifyChange(iModelChanger sender) {
        //
    }

    public  Scene getScene(int id){
        return scenes.get(id);
    }
}
