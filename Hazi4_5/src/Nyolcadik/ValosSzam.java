package Nyolcadik;

import java.util.ArrayList;
import java.util.List;

public class ValosSzam implements RealNumbers{

    private ArrayList<Double> szamok;
    private int i;

    public ValosSzam(ArrayList<Double> szamok) {
        this.szamok = new ArrayList<>();
    }
    
    @Override
    public void add(double num) {
        szamok.add(num);
    }

    @Override
    public double get(int idx) {
        return szamok.get(idx);
    }

    @Override
    public void delete(int idx) {
        szamok.remove(idx);
    }

    @Override
    public boolean contains(double num) {
        if(szamok.contains(num))
            return true;
        else 
            return false;
    }

    @Override
    public int getFirstOccurrence(double num) {
        for(int i=0;i<szamok.size();i++) {
            if(szamok.get(i)==num)
                return szamok.get(i);
        }
    }
    
}