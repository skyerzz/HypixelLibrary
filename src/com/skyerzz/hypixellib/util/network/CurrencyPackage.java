package com.skyerzz.hypixellib.util.network;

import com.skyerzz.hypixellib.util.games.arcade.Gametype;
import com.skyerzz.hypixellib.util.network.exception.MissingGametypeException;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public class CurrencyPackage {

    private Currency currency;
    private Gametype gameType;
    private int amount;

    /**
     * Constructor for any currency other than coins
     * @param currency
     * @param amount
     * @throws MissingGametypeException if the currency is Coins. Use the construct with Gametype instead
     */
    public CurrencyPackage(Currency currency, int amount) throws MissingGametypeException {
        this.amount = amount;
        if(currency == Currency.COINS){
            throw new MissingGametypeException();
        }
        this.currency = currency;
    }

    /**
     * Constructor for the Coin currency
     * @param currency
     * @param amount
     * @param gameType
     */
    public CurrencyPackage(Currency currency, int amount, Gametype gameType){
        this.amount = amount;
        this.currency = currency;
        this.gameType = gameType;
    }
}
