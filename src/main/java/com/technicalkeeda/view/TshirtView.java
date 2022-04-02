package com.technicalkeeda.view;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.a4.entities.TshirtModel;


public class TshirtView {

    public void viewTshirts(List<TshirtModel> TshirtList)
    {
        System.out.println("\n \t\t ***** TSHIRT INFORMATION *****");
        System.out.println("ID|NAME|COLOUR|GENDER_RECOMMENDATION|SIZE|PRICE|RATING|AVAILABILITY");
        for(TshirtModel f:TshirtList)
        {
            System.out.print(" "+f.getID());
            System.out.print("\t |\t"+f.getNAME());
            System.out.print("\t |\t"+f.getCOLOUR());
            System.out.print("\t |"+f.getGENDER_RECOMMENDATION());
            System.out.print(" | "+f.getSIZE());
            System.out.println("\t|  "+f.getPRICE()+"\t |");
    }
    if(TshirtList.isEmpty())
    {
        System.out.println("Tshirts Not Available.");
    }
    }

}



