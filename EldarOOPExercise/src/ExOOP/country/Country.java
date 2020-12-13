package ExOOP.country;

import ExOOP.highway.Highway;

import java.util.Arrays;

public class Country {

    private Highway[] highways;

    public Country() {
        this.highways = new Highway[5];
    }

    public Highway[] getHighways() {
        return highways;
    }


    public void populateCountryWithHighways(){

        for (int i = 0 ; i < this.highways.length ; i ++){

            Highway h = new Highway("Highway "+ (i+1));
            h.populateHighway();
            this.highways[i] = h;
            System.out.println(h);
            System.out.println("===============");
        }

    }

    @Override
    public String toString() {
        return "Country{" +
                "highways=" + Arrays.toString(highways) +
                '}';
    }
}
