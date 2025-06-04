package AbhinavSirLabWork.Oops.Composition;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private String engineName;

    public Engine(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }
}
class Vehicle{
    private String vehicleName;
    private List<Engine> engines;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
        this.engines=new ArrayList<>();
    }
    public void addEngine(Engine engine){
        engines.add(engine);
    }
    public List<Engine> getEngines(){
        return new ArrayList<>(engines);
    }
    public int totalEngines(){
        return engines.size();
    }
}
class CompositionExample{
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Apache");
        vehicle.addEngine(new Engine("vEngine"));
        vehicle.addEngine(new Engine("dieselEngine"));
        vehicle.addEngine(new Engine("rotaryEngine"));
        vehicle.addEngine(new Engine("internalCombustionEngine"));
        int d=vehicle.totalEngines();
        System.out.println("Total engine "+d);
        for (Engine engine: vehicle.getEngines()){
            System.out.println(engine.getEngineName());
        }
    }
}
