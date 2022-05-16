import WeaponBehavior.AxeBehavior;
import WeaponBehavior.KnifeBehavior;
import WeaponBehavior.SwordBehavior;

/**
 * 类名:     Main
 * 描述:
 * 隶属于:   WeaponPuzzle
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        Character character = new Knight(new AxeBehavior());
        character.fight();

        character = new Queen(new SwordBehavior());
        character.fight();

        character.setWeaponBehavior(new KnifeBehavior());
        character.fight();
    }
}
