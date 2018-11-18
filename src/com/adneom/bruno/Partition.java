package com.adneom.bruno;

import java.util.ArrayList;

public class Partition{
    /**
     * @author Bruno Moise
     * The method partition() of the Partition class takes a parameter "liste" of type ArrayList
     * and a parameter "taille" of type Integer
     * and returns a list of sub-lists (ArrayList of ArrayList),
     * where each sublist has up to "taille" elements.
     * If "taille" is not an integer greater than zero, partition() returns null.
     * @param liste The original list we want to divide into sublists
     * @param taille The maximum size of the sublists
     * @return An ArrayList of ArrayList of maximum size "taille"
     */

    public ArrayList<ArrayList> partition(ArrayList liste, int taille){

        try{
            int div = liste.size() / taille;
            int mod = liste.size() % taille;
            int size, k = 0;

            if (mod == 0) size = div; else size = div + 1;

            ArrayList<ArrayList> result = new ArrayList<ArrayList>(size);
            ArrayList sublist = new ArrayList(taille);

            for (int j = 0; j < size; j++){

                for(int i = 0;i < taille;i++){
                    if (size == div || k < liste.size()){
                        sublist.add(i,liste.get(k));
                        k++;
                    }
                }
                ArrayList copy_sublist = new ArrayList(sublist);
                result.add(j,copy_sublist);
                sublist.clear();
            }
            return result;
        }
        catch(ArithmeticException e){
            System.out.println("taille must be greater than zero :" +e);
            return null;
        }
        catch(IllegalArgumentException e){
            System.out.println("taille must be an integer greater than zero "+e);
            return null;
        }
    }
}