package com.company.aula01.jogo;

public interface IEnemy {
    float getHp();
    float getMaxHp();
    float attack(float damage);
    float receiveDamage(float damage);

}
