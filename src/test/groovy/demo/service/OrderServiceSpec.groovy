package demo.service

import demo.domain.Order
import spock.lang.Specification
import spock.lang.Unroll

class OrderServiceSpec extends Specification {

    def "Testing PlaceOrder() mocking example"() {
        given: "Create order instance"
        Order order = new Order()
        OrderService orderService = OrderService.getInstance()

        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        and: "mocking EmailService"
        EmailService emailService = Mock(EmailService)
        orderService.emailService = emailService

        when:
        orderService.placeOrder(order)

        then:
        1 * emailService.sendEmail(order)
        order.getPriceWithTex() == 480d
    }

    @Unroll("Testing PlaceOrder() stubing example: #sno")
    def "Testing PlaceOrder() stubing example"() {
        given: "Create order instance"
        Order order = new Order()
        OrderService orderService = OrderService.getInstance()
        String cc = "dhanendrakumarkht@gmail.com"

        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        and: "mocking EmailService"
        EmailService emailService = Mock(EmailService)
        orderService.emailService = emailService

        when:
        boolean status = orderService.placeOrder(order, cc)

        then:
        1 * emailService.sendEmail(order, cc) >> inputStatus
        order.getPriceWithTex() == 480d
        status == expectedStatus

        where:
        sno | inputStatus | expectedStatus
        1   | true        | true
        2   | false       | false
    }
}
