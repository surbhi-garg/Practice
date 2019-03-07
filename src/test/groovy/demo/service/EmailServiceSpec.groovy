package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceSpec extends Specification {
    Order order;
    EmailService emailService;
    def 'setup'()
    {
        "Mocking order object and getting instance of emailService"
         order=Mock(Order);
         emailService=EmailService.getInstance();
    }

    def "Testing SendEmail with one argument of order type"() {
        when:
        emailService.sendEmail(order)
        then:
        thrown(RuntimeException)
    }

    def "Testing SendEmail1 with one argument of order type and one of string type"() {
        setup:"Creating string variable CC"
        String cc=new String();
        when:
        emailService.sendEmail(order,cc)
        then:
        true

    }
}
