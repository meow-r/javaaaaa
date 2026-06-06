DeathManager
题目背景
死神先生负责掌管部分特定人群的命运。每当一个人出生时，死神会记录下该人的姓名（name）、生命值（health）、力量（strength）、灵巧（dexterity）、智力（intelligence）、信仰（faith）以及法力值（mana）。每个人都可以通过physicalAttack和magicalAttack两种方式来攻击其他人。

在基础physicalAttack中，如果攻击者的力量不小于防御者的灵巧值，那么防御者的生命值将减少，减少的数值为攻击者的力量与防御者灵巧值的乘积。

在基础magicalAttack中，攻击者将消耗 20 点法力值（mana），对防御者造成的生命值伤害为攻击者的智力与信仰值的乘积。如果攻击者的法力不足 20 点，则该魔法攻击不会产生任何效果。

当某人的生命值降为 0 时，他会死亡，并且不能再攻击别人。攻击已死亡的人，或者让已死亡的人进行攻击，均不会产生任何效果。

请实现一个Person类，以及DeathManager类中的 progressYear和deathRecord方法。我们会使用newborn方法来创建新的人。progressYear方法表示时间流逝一年，deathRecord方法需要返回已死亡的人的记录以及他们死亡时的年龄，按死亡时间的先后顺序排列。

死神也会为某些人提供装备。每个装备物品都由一个继承自item类的子类实例来定义。有些物品可能带有主动技能，可以通过调用activeSkill方法来使用。物品可以被授予给某人，也可以被移除。在physicalAttack和magicalAttack时，如果人具有特定装备，会在

你需要实现grantItem和removeItem两个方法。我们已经定义了一些物品，你需要添加相应的代码以实现它们的功能：

Blade：使佩戴者的灵巧值增加 5 点，装备被移除时增加的灵巧值也被扣除。active skill：对对手造成三次伤害（依次执行），每次伤害为 10 + 力量值。当具有该装备时，physicalAttack使用该active skill进行替代（即使用blade的技能，而不会再执行基础物理攻击）。

Shield：受到攻击时，所受伤害减少 20 点。此效果先于 CalamityRing 的效果计算。

Wand：active skill：消耗 100 点法力值，对对手造成 200 点伤害，如果当前法力值不足100则无法使用。当具有该装备时，magicalAttack用该active skill进行替代（即使当前mana不够使用wand但够执行基础魔法攻击时，也无法再执行基础的魔法攻击）。魔杖的主动技能最多只能使用 5 次，之后魔杖将被移除。

RingOfSacrifice：在佩戴者即将因致命伤害而死亡时，不会死亡，而是将生命值保留为 1 点，同时戒指破碎（被移除）。

CalamityRing：佩戴者将承受双倍伤害。

RingOfTheEvilEye：当对手死亡时，佩戴者将吸收 +30 点生命值。

为了实现上述功能，可自由考虑为类添加成员变量和函数。但请不要修改已有代码中的函数/变量/类名称，可能会导致测试运行出错！