public class Calculations {
    public static void Init () {
        calcAtk(1000, 0.0f, 0.2f, 0.4f, 0.4f, 0.2f);
    }

    static void calcAtk(float baseAtk, float skillMult, float atkMult, float defMult, float eleAtkMult, float eleDefMult) {
        skillMult = calcHpBasedDmg(.6f);
//        skillMult = calcAbsHpBasedDmg(1000f);

        System.out.println("-----------------------------------------");
        System.out.println("Base Atk: " + baseAtk);
        System.out.println("Skill Mult: " + skillMult);
//        System.out.println("Atk Mult: " + atkMult);
//        System.out.println("Def Mult: " + defMult);
//        System.out.println("Ele Atk Mult: " + eleAtkMult);
//        System.out.println("Ele Def Mult: " + eleDefMult);
//        System.out.println("===");

        float finalDmg = finalCalc(baseAtk * skillMult, atkMult, defMult, eleAtkMult, eleDefMult);
        System.out.println("Final Dmg: " + finalDmg);
    }

    static float calcAbsHpBasedDmg(float remainingHpAbsolute) {
        return remainingHpAbsolute * 0.002f;
    }

    static float calcHpBasedDmg(float remainingHpPercentage) {
        return remainingHpPercentage * 3;
    }

    static float finalCalc(float baseAtk, float atkMult, float defMult, float eleAtkMult, float eleDefMult) {
        float finalMult = atkMult - defMult + eleAtkMult - eleDefMult + 1;
        System.out.println("Def Mult: " + finalMult);
        return baseAtk * finalMult;
    }
}
