package pojo;

public abstract class TradeAccount {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TradeAccount(String id) {
        this.id = id;
    }
    public abstract TradeAccount clone();


}