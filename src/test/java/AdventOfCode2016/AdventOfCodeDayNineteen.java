package AdventOfCode2016;

public class AdventOfCodeDayNineteen {

    private Elf[] allElves;
    private int tableSize;

    public AdventOfCodeDayNineteen(int tableSize) {
        allElves = new Elf[tableSize];
        for(int index = 0, elfNumber = 1; index < tableSize; elfNumber++, index++) {
            allElves[index] = new Elf(elfNumber);
        }
    }

    public int getElfWithAllPresents() {
        int currentIndex = 0;

        while (tableHasMoreThanOneElf()) {
            boolean taken = false;
            while(!taken) {
                if (allElves[currentIndex] != null) {
                    int nextIndex = getNextPosition(currentIndex);
                    allElves[nextIndex] = null;
                    currentIndex = nextIndex + 1;
                    taken = true;
                } else {
                    currentIndex++;
                }

                if (currentIndex >= allElves.length) {
                    currentIndex = 0;
                }
            }
            System.out.println("current index: " + currentIndex);

        }
        return getFirstElfOnTable();
    }

    private int getNextPosition(int currentIndex) {
        for(int i = currentIndex + 1; ; i++) {
            if(i == allElves.length) {
                if(allElves[0] != null) {
                    return 0;
                } else {
                    i = -1;
                }
            } else if(i < allElves.length && allElves[i] != null) {
                return i;
            } else if(i >= allElves.length) {
                i = -1;
            }
        }
    }

    private boolean tableHasMoreThanOneElf() {
        int elfCount = 0;
        for(int i = 0; i < allElves.length; i++) {
            if(allElves[i] != null) {
                if(++elfCount == 2)
                    return true;
            }
        }
        return false;
    }

    private int getFirstElfOnTable() {
        for(int i = 0; i < allElves.length; i++) {
            if(allElves[i] != null) {
                return allElves[i].getNumber();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        AdventOfCodeDayNineteen adventOfCodeDayNineteen = new AdventOfCodeDayNineteen(3005290);
        int result = adventOfCodeDayNineteen.getElfWithAllPresents();
        System.out.println(result);
    }

    private class Elf {

        private int number;

        private Elf(int number) {
            this.number = number;
        }

        private int getNumber() {
            return  this.number;
        }
    }
}
