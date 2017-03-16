package com.skyerzz.hypixellib.util.item;

/**
 * Created by sky on 8-9-2016.
 */
public class ItemStack {

    private Item item;
    private int amount;

    public ItemStack(Item item){
        this(item, 1);
    }

    public ItemStack(Item item, int amount){
        this.item = item;
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public Item getItem(){
        return item;
    }

    //todo enchantments
}
