package AdcentOfCode2017;

import java.util.ArrayList;

public class Disc {
    private String name = "";
    private int weight = 0;
    private ArrayList<Disc> children;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the children
     */
    public ArrayList<Disc> getChildren() {
        return children;
    }

    /**
     * @param children
     *            the children to set
     */
    public void setChildren(ArrayList<Disc> children) {
        this.children = children;
    }

    public int totalWeight() {
        int weight = this.getWeight();
        if (this.getChildren() != null) {
            for (Disc child : this.getChildren()) {
                weight += child.totalWeight();
            }
        }
        return weight;
    }

    public Boolean hasChild(Disc disc) {
        Boolean hasChild = false;
        if (this.getChildren() != null) {
            for (Disc child : this.getChildren()) {
                if (disc.getName().equals(child.getName())) {
                    hasChild = true;
                }
            }
        }
        return hasChild;
    }

    @Override
    public String toString() {
        String returnString = Integer.toString(this.getWeight());
        if (this.getChildren() != null) {
            for (Disc child : this.getChildren()) {
                returnString += " + ";
                returnString += child.toString();
            }
        }
        return returnString;
    }

}