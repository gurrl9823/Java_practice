package org.Etemplatemethod;

public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }



    public PlayerLevel getLevel() {
        return this.level;
    }
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }


    public void play(int count) {
        level.go(count);
    }

}
