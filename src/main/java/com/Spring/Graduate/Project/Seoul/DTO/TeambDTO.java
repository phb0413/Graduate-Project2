package com.Spring.Graduate.Project.Seoul.DTO;

public class TeambDTO {
    private int brank;
    private String bimg;
    private String btitle;
    private int bmatch;
    private int bpoint;
    private int bvictory;
    private int bdraw;
    private int bdefeat;
    private int bdiff;

    public TeambDTO(int brank, String bimg, String btitle, int bmatch, int bpoint, int bvictory, int bdraw, int bdefeat, int bdiff) {
        this.brank = brank;
        this.bimg = bimg;
        this.btitle = btitle;
        this.bmatch = bmatch;
        this.bpoint = bpoint;
        this.bvictory = bvictory;
        this.bdraw = bdraw;
        this.bdefeat = bdefeat;
        this.bdiff = bdiff;
    }

    public int getBrank() {
        return brank;
    }


    public String getBimg() {
        return bimg;
    }


    public String getBtitle() {
        return btitle;
    }

    public int getBmatch() {
        return bmatch;
    }

    public int getBpoint() {
        return bpoint;
    }


    public int getBvictory() {
        return bvictory;
    }

    public int getBdraw() {
        return bdraw;
    }

    public int getBdefeat() {
        return bdefeat;
    }


    public int getBdiff() {
        return bdiff;
    }

}
