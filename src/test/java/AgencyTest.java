import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AgencyTest {

    private Agency agency;
    private Commercial bakery;
    private Residential cottage;

    private Commercial restaurant;

    @BeforeEach
    public void setUp() {
        agency = new Agency("BNTA Agency");

        bakery = new Commercial("Doughnotts","bakery",2,
                2,"04/07/2015",1000);

        cottage = new Residential("cottage", 4, 6, 2,
                "23/07/2000", 400);
        restaurant = new Commercial("Rudy's Pizza","pizzeria",1,
                1,"27/12/2023",1500);
    }

    @Test
    public void canGetName(){
        assertThat(agency.getName()).isEqualTo("BNTA Agency");
    }

    @Test
    public void canGetBuildings(){
        assertThat(agency.getBuildings().size()).isEqualTo(0);
    }

    @Test
    public void canAddBuildings(){
        agency.addBuilding(bakery);
        assertThat(agency.getBuildings().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveBuildings(){
        agency.addBuilding(bakery);
        agency.addBuilding(cottage);
        agency.addBuilding(restaurant);
        agency.removeBuilding(cottage);
        assertThat(agency.getBuildings().size()).isEqualTo(2);
    }

}
