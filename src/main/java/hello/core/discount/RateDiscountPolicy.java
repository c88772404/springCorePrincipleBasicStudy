package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    private int discountPercent = 10;

    public RateDiscountPolicy() {
    }

    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? price * this.discountPercent / 100 : 0;
    }
}