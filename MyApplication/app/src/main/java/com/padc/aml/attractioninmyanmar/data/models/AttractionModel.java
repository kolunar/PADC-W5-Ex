package com.padc.aml.attractioninmyanmar.data.models;

import com.padc.aml.attractioninmyanmar.data.vos.AttractionVO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 7/9/2016.
 */
public class AttractionModel {

    private static final String DUMMY_Attraction_LIST = "myanmar_attractions.json";

    private static AttractionModel objInstance;

    private List<AttractionVO> AttractionList;

    private AttractionModel(){
        AttractionList = initializeAttractionList();
    }

    public static AttractionModel getInstance(){
        if(objInstance == null) {
            objInstance = new AttractionModel();
        }

        return objInstance;
    }

    private List<AttractionVO> initializeAttractionList() {
        List<AttractionVO> AttractionList = new ArrayList<>();


        return AttractionList;
    }

    public List<AttractionVO> getAttractionList() {
        return AttractionList;
    }

    public AttractionVO getAttractionByTitle(String title){
        for(AttractionVO vo: AttractionList){
            if(vo.getAttractionTitle().equals(title))
                return vo;
        }
        return null;
    }
}