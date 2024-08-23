
/* 
 @file Award.java
 @author Ben Cohen (bscohen06@gmail.com)
 @brief calculating honor roll for summer assignment
 @version 1.0.0
 @date 2024-8-23
 
 This program calculates if students get honor roll and outputs it as a string
 
 */
public class Award {

    String studentID;
    int EnglishClass;
    int MathClass;
    int ElectiveClass;

    public Award(String ID, int English, int Math, int Elective) {
        studentID = ID;
        EnglishClass = English;
        MathClass = Math;
        ElectiveClass = Elective;
    }

    public int calcAverage() {
        int English = EnglishClass;
        int Math = MathClass;
        int Elective = ElectiveClass;
        int average = (English + Math + Elective) / 3;
        return average;
    }

    public String awardStatus() {

        String honor;
        if (calcAverage() >= 90) {
            honor = "Straight A and honor roll";
        } else if (calcAverage() >= 80 && calcAverage() <= 89) {
            honor = "honor roll";
        } else {
            honor = "no award";
        }

        return honor;
    }

    @Override
    public String toString() {

        return "student " + studentID + " has earned " + awardStatus();
    }

    public static void main(String[] args) {
        Award a1 = new Award("s111", 88, 65, 90);
        Award a2 = new Award("s112", 88, 95, 90);
        Award a3 = new Award("s113", 70, 87, 76);
        System.out.println(a3.toString());
    }
}
