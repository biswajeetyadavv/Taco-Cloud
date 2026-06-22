package tacos.domains;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

// this are the details of taco.
//and contains a arraylist which stores all the tacos order by current user.
public class TacoOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }

}
