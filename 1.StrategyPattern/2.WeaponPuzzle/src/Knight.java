import WeaponBehavior.WeaponBehavior;

/**
 * 类名:     Knight
 * 描述:
 * 隶属于:   WeaponPuzzle
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Knight extends Character{
    public Knight(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("骑士");
        this.useWeapon();
    }
}
