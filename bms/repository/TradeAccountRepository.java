package repository;
import java.util.HashMap;
import java.util.Map;

import pojo.*;


public class TradeAccountRepository {
    private Map<String, TradeAccount> datastore = new HashMap<>();
    public void createTradeAccount(TradeAccount account){
        this.datastore.put(account.getId(), account.clone());

    }
    
    public TradeAccount retrieveTradeAccount(String id){
        if(this.datastore.get(id)==null){
            return null;
        }
        return this.datastore.get(id).clone();

    }
    public void updateTradeAccount(TradeAccount account){
        this.datastore.put(account.getId(), account.clone());
    }
    public void deleteTradeAccount(String id){
        this.datastore.remove(id);
    }


}
