package pojo;

import java.math.BigDecimal;

public class MarginAccount extends TradeAccount {
    private BigDecimal margin;

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }
    public MarginAccount(String id ,BigDecimal margin){
        super(id);
        this.margin=margin;
    }
    @Override
    public TradeAccount clone() {
        
        return new MarginAccount(super.getId(), getMargin());
    }


}
