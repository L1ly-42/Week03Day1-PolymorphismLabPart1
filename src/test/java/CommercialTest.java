import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommercialTest {

    private Commercial bakery;

    @BeforeEach
    public void setUp(){
        bakery = new Commercial("Doughnotts","bakery",2,
                                2,"04/07/2015",100);
    }

 // A set of tests specific to Commercial subclass

    @Test
    public void canGetCompanyName(){
        assertThat(bakery.getCompanyName()).isEqualTo("Doughnotts");
    }

    @Test
    public void canGetBusinessType(){
        assertThat(bakery.getBusinessType()).isEqualTo("bakery");
    }

    @Test
    public void canSetCompanyName(){
        bakery.setCompanyName("Rudy's Pizza");
        assertThat(bakery.getCompanyName()).isEqualTo("Rudy's Pizza");
    }

    @Test
    public void canSetBusinessType(){
        bakery.setBusinessType("pizzeria");
        assertThat(bakery.getBusinessType()).isEqualTo("pizzeria");
    }






}
