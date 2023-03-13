package gov.iti.jets.ecommerce.business.servicesImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.business.mappers.OrdersMapper;
import gov.iti.jets.ecommerce.business.services.OrdersService;
import gov.iti.jets.ecommerce.persistence.exceptions.ResourceNotFoundException;
import gov.iti.jets.ecommerce.persistence.repositories.OrdersRepo;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepo ordersRepo;
    private final OrdersMapper ordersMapper;

    public OrdersServiceImpl(OrdersRepo ordersRepo,OrdersMapper ordersMapper) {
        this.ordersRepo = ordersRepo;
        this.ordersMapper=ordersMapper;
    }

    @Override
    public List<OrdersDTO> getAllOrders() {
        return ordersMapper.orderToOrderDTO(ordersRepo.findAll());
    }

    @Override
    public OrdersDTO getOrderById(Integer id) {
        return ordersMapper.orderToOrderDTO(ordersRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(id)));
    }

    @Override
    public void addOrder(OrdersDTO ordersDTO) {
        ordersRepo.save(ordersMapper.orderDTOToOrder(ordersDTO));
    }

    @Override
    public void removeOrder(Integer id) {
        ordersRepo.deleteById(id);
    }

    @Override
    public OrdersDTO getCart(Integer id) {
       return ordersMapper.orderToOrderDTO(ordersRepo.getCart(id));
    }

    @Override
    public void updateOrder(OrdersDTO ordersDTO) {
        ordersRepo.save(ordersMapper.orderDTOToOrder(ordersDTO));
    }

    @Override
    public List<OrdersDTO> getCustomerOrders(Integer id) {
       return ordersMapper.orderToOrderDTO(ordersRepo.getCustomerOrders(id));
    }
}
