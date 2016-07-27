package com.wu.allen.myone.model;

import java.io.Serializable;

/**
 * Created by allen on 2016/7/15.
 */

public class Qa implements Serializable {

    private String qaIntr;
    private String qaDetail;
    private String qaAnsw;

    public Qa(String qaIntr, String qaDetail, String qaAnsw) {
        this.qaIntr = qaIntr;
        this.qaDetail = qaDetail;
        this.qaAnsw = qaAnsw;
    }

    public String getQaIntr() {
        return qaIntr;
    }

    public Qa setQaIntr(String qaIntr) {
        this.qaIntr = qaIntr;
        return this;
    }

    public String getQaDetail() {
        return qaDetail;
    }

    public Qa setQaDetail(String qaDetail) {
        this.qaDetail = qaDetail;
        return this;
    }

    public String getQaAnsw() {
        return qaAnsw;
    }

    public Qa setQaAnsw(String qaAnsw) {
        this.qaAnsw = qaAnsw;
        return this;
    }
}
