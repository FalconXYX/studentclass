
public class Student {

    private String name;
    private int test1, test2, test3;

    public Student() {
        name = "";
        test1 = test2 = test3 = 0;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() { //Get a student's name 
        return name;
    }

    public void setScore(int i, int score) { //Set test i to score 
        if (i == 1) {
            test1 = score;
        } else if (i == 2) {
            test2 = score;
        } else {
            test3 = score;
        }
    }
    public int getScore(int i){ 
        if(i == 1){return test1;}
        if(i == 2){return test2;}
        else{return test3; }}
    public int getavg(){
        int average;
        average = (int) Math.round((test1 + test2 + test3) / 3.0);
        return average; } 
    public int getHighScore(){
        int highScore;
        highScore = test1;
        if (test2 > highScore) highScore = test2;
        if (test3 > highScore) highScore = test3;
        return highScore; 
              
    }
    public String toString(){
    String str;
    str = "Name:";
    str+= "Test 1:";
    str+="Test 2:";
    str+="Test 3:";
    str+="Average:";
    return str;}

}
