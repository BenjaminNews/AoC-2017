package AdventOfCode2015;

import java.util.Scanner;

public class AdventOfCodeDayTwentyOne {

    private int spentCoins = 0;
    private int strength = 0;
    private int defence = 0;
    private int optionOne = -1, optionTwo = -1;

    private static Scanner in = new Scanner(System.in);

    public boolean setWeapon(String weaponNumber) {
        if(Character.isDigit(weaponNumber.charAt(0))) {
            if(Integer.parseInt(weaponNumber) > 0 && Integer.parseInt(weaponNumber) < 6) {
                if (weaponNumber.equals("1")) {
                    optionOne = 1;
                    strength = 4;
                    spentCoins += 8;
                } else if (weaponNumber.equals("2")) {
                    optionOne = 2;
                    strength = 5;
                    spentCoins += 10;
                } else if (weaponNumber.equals("3")) {
                    optionOne = 3;
                    strength = 6;
                    spentCoins += 25;
                } else if (weaponNumber.equals("4")) {
                    optionOne = 4;
                    strength = 7;
                    spentCoins += 40;
                } else if (weaponNumber.equals("5")) {
                    optionOne = 5;
                    strength = 8;
                    spentCoins += 74;
                }
                return true;
            }
        }
        System.out.println("invalid choice, must be between 1 and 5");
        return false;
    }

    private boolean setArmor(String armorNumber) {
        if(Character.isDigit(armorNumber.charAt(0))) {
            if(Integer.parseInt(armorNumber) > 0 && Integer.parseInt(armorNumber) < 6) {
                if (armorNumber.equals("1")) {
                    optionTwo = 1;
                    defence = 1;
                    spentCoins += 13;
                } else if (armorNumber.equals("2")) {
                    optionTwo = 2;
                    defence = 2;
                    spentCoins += 31;
                } else if (armorNumber.equals("3")) {
                    optionTwo = 3;
                    defence = 3;
                    spentCoins += 53;
                } else if (armorNumber.equals("4")) {
                    optionTwo = 4;
                    defence = 4;
                    spentCoins += 75;
                } else if (armorNumber.equals("5")) {
                    optionTwo = 5;
                    defence = 5;
                    spentCoins += 102;
                }
                return true;
            }
        }
        System.out.println("invalid choice, must be between 1 and 5");
        return false;
    }

    private void buyMagicRings(AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne) {
        boolean ringsSet = false;
        while(!ringsSet) {
            System.out.print("please pick your ring: ");
            while(!ringsSet) {
                String ringNumber = in.next();
                ringsSet = pickRing(ringNumber);
            }
        }
    }

    private boolean pickRing(String ringNumber) {
        if(Character.isDigit(ringNumber.charAt(0))) {
            if(Integer.parseInt(ringNumber) > 0 && Integer.parseInt(ringNumber) < 7) {
                if (ringNumber.equals("1")) {
                    strength += 1;
                    spentCoins += 25;
                } else if (ringNumber.equals("2")) {
                    strength += 2;
                    spentCoins += 50;
                } else if (ringNumber.equals("3")) {
                    strength += 3;
                    spentCoins += 100;
                } else if (ringNumber.equals("4")) {
                    defence += 1;
                    spentCoins += 20;
                } else if (ringNumber.equals("5")) {
                    defence += 2;
                    spentCoins += 40;
                } else if(ringNumber.equals("6")) {
                    defence += 3;
                    spentCoins += 80;
                }
                return true;
            }
        }
        System.out.println("invalid choice, must be between 1 and 5");
        return false;
    }

    private void pickWeapon(AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne) {
        boolean weaponSet = false;
        while(!weaponSet) {
            System.out.print("please choose your weapon: ");
            String weaponNumber = in.next();
            weaponSet = adventOfCodeDayTwentyOne.setWeapon(weaponNumber);
        }
    }

    private void pickArmor(AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne) {
        boolean buyArmour = false;
        while(!buyArmour) {
            System.out.print("Would you like to buy armour? ");
            String answer = in.next();
            if(answer.equals("y")) {
                boolean armorSet = false;
                while (!armorSet) {
                    System.out.print("please chosoe your armor: ");
                    String armorNumber = in.next();
                    armorSet = adventOfCodeDayTwentyOne.setArmor(armorNumber);
                }
                buyArmour = true;
            } else if(answer.equals("n")) {
                break;
            } else {
                System.out.print("invalid choise please choose y or n ");
            }
        }
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();

        System.out.println("Weapons:                            Armour:                                 Rings:                \n" +
                           "              Cost  Damage  Armor                   Cost  Damage  Armor       Trait        cost  \n" +
                           "1 Dagger        8     4       0     1 Leather        13     0       1       1 Damage +1      25   \n" +
                           "2 Shortsword   10     5       0     2 Chainmail      31     0       2       2 Damage +2      50   \n" +
                           "3 Warhammer    25     6       0     3 Splintmail     53     0       3       3 Damage +3     100   \n" +
                           "4 Longsword    40     7       0     4 Bandedmail     75     0       4       4 Defense +1     20   \n" +
                           "5 Greataxe     74     8       0     5 Platemail     102     0       5       5 Defense +2     40   \n" +
                           "                                                                            6 Defense +3     80   ");

        adventOfCodeDayTwentyOne.pickWeapon(adventOfCodeDayTwentyOne);
        System.out.println("gold spent: " + adventOfCodeDayTwentyOne.spentCoins);

        adventOfCodeDayTwentyOne.pickArmor(adventOfCodeDayTwentyOne);
        System.out.println("gold spent: " + adventOfCodeDayTwentyOne.spentCoins);

        boolean buyRings = false;
        adventOfCodeDayTwentyOne.buyRings(adventOfCodeDayTwentyOne, buyRings);
        System.out.println("gold spent: " + adventOfCodeDayTwentyOne.spentCoins);
        buyRings = false;
        buyRings(adventOfCodeDayTwentyOne, buyRings);

        System.out.println(adventOfCodeDayTwentyOne.fight());
        System.out.println("Option one: " + adventOfCodeDayTwentyOne.optionOne + " Option two: " + adventOfCodeDayTwentyOne.optionTwo);
        System.out.println("Total strength: " + adventOfCodeDayTwentyOne.strength +
                           "\nTotal armour: " + adventOfCodeDayTwentyOne.defence +
                           "\nTotal couins spent:" +  adventOfCodeDayTwentyOne.spentCoins);
    }

    private String fight() {
        int playerHitPoints = 100;
        int oponentHitPoints = 104;
        int oponentArmour = 1;
        int oponentDamage = 8;

        int playerImpactDamage = strength - oponentArmour;
        playerImpactDamage = playerImpactDamage > 0 ? playerImpactDamage : 1;
        int oponentImpactDamage = oponentDamage - defence;
        oponentImpactDamage = oponentImpactDamage > 0 ? oponentImpactDamage : 1;
        boolean humanPlayerTurn = true;
        while(playerHitPoints > 0 && oponentHitPoints > 0) {
            if(humanPlayerTurn) {
                oponentHitPoints -= playerImpactDamage;
                humanPlayerTurn = false;
            }  else {
                playerHitPoints -= oponentImpactDamage;
                humanPlayerTurn = true;
            }
        }
        String result = oponentHitPoints <= 0 ? "PLAYER wins " : "OPONENT wins ";
        return result;
    }

    private void buyRings(AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne, boolean buyRings) {
        while(!buyRings) {
            System.out.print("would you like to buy a ring? (y/n) ");
            String answer = in.next();
            if (answer.equalsIgnoreCase("y")) {
                buyRings = true;
                adventOfCodeDayTwentyOne.buyMagicRings(adventOfCodeDayTwentyOne);
            } else if(answer.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.print("invalid choise please choose y or n");
            }
        }
    }
}
