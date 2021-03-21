package gamelevel;

public class Player {
    private PlayerLevel playerLevel;

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMessage();
    }

    public void play(int count) {
        playerLevel.go(count);
    }

    public Player() {
        playerLevel = new BeginnerLevel();
        playerLevel.showLevelMessage();
    }

}
