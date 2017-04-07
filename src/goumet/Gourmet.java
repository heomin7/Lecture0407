package goumet;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Gourmet {

    private String title;
    private String mainMenu;
    private int score;

    public Gourmet(){
    }
//생성자 자동 만들 수 있음... generate...
    /*
     public Gourmet(String title){
        this(title, null, 0);
    }

    public Gourmet(String title, String mainMenu){
        this(title, mainMenu, 0);
    }

    public Gourmet(String title, String mainMenu, int score){
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }
     */

    public Gourmet(String title, String mainMenu, int score) {
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


/*
    //title
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    //mainMenu
    public String getMainMenu(){
        return mainMenu;
    }
    public void setMainMenu(String mainMenu){
        this.mainMenu = mainMenu;
    }

    //score
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
 */


}
