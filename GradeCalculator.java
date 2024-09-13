public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Chemistry";
    int minutesStudying = 500;
    int HW1 = 100;
    int HW2 = 100;
    int HW3 = 100;
    int HW4 = 100;

    double quiz1 = 85.9;
    double quiz2 = 95.7;

    double finalExam = 90.5;

    double averageHWGrade = (double) (HW1 + HW2 + HW3 + HW4) / 4;
    double averageQuizScore = (quiz1 + quiz2) / 2;
    double finalGrade = (averageHWGrade * 0.35) + (averageQuizScore * 0.15) + (finalExam * 0.5) + 0.5;

    System.out.println("Course Name: " + course);
    System.out.println("Average time studying per week (minutes): " + minutesStudying);
    System.out.println("Homework scores for this course: ");
    System.out.println(HW1);
    System.out.println(HW2);
    System.out.println(HW3);
    System.out.println(HW4);
    System.out.println("Quiz scores for this course: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("Final exam score: ");
    System.out.println(finalExam);
    System.out.println("Time studying per week: " + minutesStudying / 60 + " hours and " + minutesStudying % 60 + " minutes");
    System.out.println("Average homework score: " + averageHWGrade);
    System.out.println("Average quiz score: " + averageQuizScore);
    System.out.println("Final exam score: " + finalExam);
    System.out.println("Final Grade: " + (int) finalGrade);


    
  }
}
