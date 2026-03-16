public int castSpell(Spell s1, Spell s2) {
   //water beats fire

    if (s1 instanceof Water && s2 instanceof Fire) {
        return 1;
        //s1 wins
    } else if (s2 instanceof Water && s1 instanceof Fire) {
        return 2;
    }

    if (s1.getIntensity() < s2.getIntensity()) {
        return 2;
    } ....


   //otherwise, compare intensity 
}
