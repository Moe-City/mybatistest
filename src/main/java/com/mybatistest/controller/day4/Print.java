package com.mybatistest.controller.day4;

public class Print {
    /**
     * 纸张
     */

    private Paper paper;

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    /**
     * 墨盒
     */

    private Ink ink;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public String showInfo(){
        return "纸张大小："+paper.getPaperSize()+"，墨盒颜色："+ink.getColorInk();
    }
}
