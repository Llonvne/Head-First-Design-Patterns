import WeaponBehavior.WeaponBehavior;

/**
 * 类名:     King
 * 描述:
 * 隶属于:   WeaponPuzzle
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class King extends Character{
    public King(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("国王");
        this.useWeapon();
    }
}
