package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification {
    Order order;
    def "setup"()
    {
        "Creating order instance"
        order=new Order()
        order.setItemName("Sipper")
        order.setPrice(200d)
        order.setQuantity(1)
        order.setPriceWithTex(250d)
    }
    def "testing getItemName()"()
    {
        when:
        order.getItemName()
        then:
        "Sipper"
    }
    def "testing getPrice"()
    {
        when:
        order.getPrice()
        then:
        200
    }
    def 'testing getQuantity'()
    {
        when:
        order.getQuantity()
        then:
        1
    }
    def 'testing getPriceWithTex'()
    {
        when:
        order.getPriceWithTex()
        then:
        250
    }


}
