package zadanie3;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Price {

    private BigDecimal plnPrice;
    private BigDecimal usdPrice;

}
