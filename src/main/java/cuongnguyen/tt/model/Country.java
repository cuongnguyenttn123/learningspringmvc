package cuongnguyen.tt.model;

import java.util.Date;

public class Country {

    String name;
    String capital;
    double population;

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String toString()
    {
        return name+" | "+capital+" | "+population ;
    }
}
