package pl.btbw;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AppCtrl {

    @Inject
    private Shop shop;

    @GET
    @Path("/")
    public String getTest() {
        System.out.println("name: " + shop.name(97));
        System.out.println("type: " + shop.type(97));
        return "check the console";
    }

}
