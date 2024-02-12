import java.util.ArrayList;

public class Agency {

    private String name;
    private ArrayList<Building> buildings;

    public Agency(String name){
        this.name = name;
        this.buildings = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Building> getBuildings(){
        return this.buildings;
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

    public void removeBuilding(Building building){
        this.buildings.remove(building);
    }

}
