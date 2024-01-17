package com.Spring.Graduate.Project.Seoul.DTO;

public class TeamDTO {
    private int rank;
    private String img;
    private String title;
    private int match;
    private int point;
    private int victory;
    private int draw;
    private int defeat;
    private int diff;

    public TeamDTO(int rank, String img, String title, int match, int point, int victory, int draw, int defeat, int diff) {
        this.rank = rank;
        this.img = img;
        this.title = title;
        this.match = match;
        this.point = point;
        this.victory = victory;
        this.draw = draw;
        this.defeat = defeat;
        this.diff = diff;
    }

    public int getRank() {
        return rank;
    }

    public String getImg() {
        return img;
    }


    public String getTitle() {
        return title;
    }


    public int getMatch() {
        return match;
    }

    public int getPoint() {
        return point;
    }

    public int getVictory() {
        return victory;
    }

    public int getDraw() {
        return draw;
    }

    public int getDefeat() {
        return defeat;
    }

    public int getDiff() {
        return diff;
    }

}
