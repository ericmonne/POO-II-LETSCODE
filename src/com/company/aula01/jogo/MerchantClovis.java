package com.company.aula01.jogo;

public class MerchantClovis implements IMerchant, IEnemy, IBoss{

    String name;
    int id;
    String[] items;
    float hp;
    float maxHp;

    @Override
    public String sell(String item) {
        return "item sold: " + item;
    }

    @Override
    public String buy(String item) {
        return "item bought: " + item;
    }

    @Override
    public String talk(int iterations) {
        return iterations == 0 ? "howdy, stranger " : "sup, bro? ";
    }

    @Override
    public String leave() {
        return "smell you later";
    }


    @Override
    public float getHp() {
        return hp;
    }

    @Override
    public float getMaxHp() {
        return maxHp;
    }

    @Override
    public float attack(float damage) {
        return damage;
    }

    @Override
    public float receiveDamage(float damage) {
        hp -= damage;
        return damage;
    }

    @Override
    public String lastWords() {
        return "I'll be back";
    }

    @Override
    public String humiliation() {
        return "gimme mo' money";
    }

    @Override
    public float specialAttack() {
        return 250;
    }

    public MerchantClovis(){

    }

    public MerchantClovis(String name, int id, String[] items){
        this.name = name;
        this.id = id;
        this.items = items;
    }
}
