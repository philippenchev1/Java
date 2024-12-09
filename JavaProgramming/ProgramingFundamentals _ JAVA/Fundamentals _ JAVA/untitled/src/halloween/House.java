package halloween;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data;


    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public void addKid(Kid kid) {
        if (this.data.size() < this.capacity) {
            this.data.add(kid);
        }
    }

    public boolean removeKid(String name){
        for (Kid kid : this.data) {
            if (kid.getName().equals(name)){
                this.data.remove(kid);
                return true;
            }
        }
        return false;
    }

    public Kid getKid(String street){
        for (Kid kid : this.data) {
            if (kid.getStreet().equals(street)){
                return kid;
            }
        }
        return null;
    }

    public int getAllKids() {
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Children who visited a house for candy:").append(System.lineSeparator());
        for (Kid kids : data) {
            sb.append(String.format("%s from %s street",kids.getName(),kids.getStreet())).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
