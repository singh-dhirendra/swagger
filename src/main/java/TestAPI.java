import io.swagger.client.ApiException;
import io.swagger.client.api.OrdercontrollerApi;
import io.swagger.client.model.Order;

/**
 * Created by dhsingh on 9/11/16.
 */
public class TestAPI {

    public static void main(String[] args) throws ApiException {
        OrdercontrollerApi api = new OrdercontrollerApi();
        Order myOrder= new Order();
        myOrder.setOrderId(123456);
        myOrder.setHotelId(12345);

        api.createBookingUsingPOST(myOrder);

        Order order = api.getBookingUsingGET(123456) ;
        System.out.println( order.getHotelId());
    }



}
