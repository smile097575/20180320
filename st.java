public class st {
    private String name, sexuality, department;
    private float english, math, chinese, sum,average;

    public st(String name1, String sexuality1, String department1, float chinese1, float english1, float math1) {
        name = name1;
        sexuality = sexuality1;
        department = department1;
        chinese = chinese1;
        english = english1;
        math = math1;
    }
    public void showinfo() {
        System.out.println("姓名" +name);
        System.out.println("性別" +sexuality);
        System.out.println("系別" +department);
        System.out.println("國文"+chinese);
        System.out.println("英文"+english);
        System.out.println("數學"+math);
    }
    public void showst(){
        System.out.println("姓名" +name);
        System.out.println("性別" +sexuality);
        System.out.println("系別" +department);
    }
    public void showscore(){
        System.out.println("國文"+chinese);
        System.out.println("英文"+english);
        System.out.println("數學"+math);
    }
    public String getName() {
        return name;
    }
    public float getChinese() {
        return chinese;
    }
    public float getEnglish() {
        return english;
    }
    public float getMath() {
        return math;
    }
    public float getSum() {
        sum = chinese + english +math;
        return sum;
    }
    public float getAverage() {
        average=(chinese + english + math)/3;
        return average;
    }
}
