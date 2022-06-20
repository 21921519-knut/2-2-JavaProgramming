import java.util.Scanner;

public class SungJukAgain extends SungJuk
{
    Scanner sc = new Scanner(System.in, "euc-kr"); //한글 입력 처리
    int totalperson; //전체 인원수

    public void getInwon() //전체 인원 입력
    {
        System.out.print("전체 인원 입력 : ");
        totalperson = sc.nextInt();
    }
    public void setArray() //배열의 크기 할당
    {
        name = new String[totalperson];
        score = new int[totalperson][3];
        sum = new int[totalperson];
        avg = new double[totalperson];
        level = new char[totalperson];
    }
    public void getData() //이름 및 점수 입력
    {
        for (int i = 0; i < totalperson; i++)
        {
            System.out.print((i+1) + "번째 학생이름 입력 : ");
            name[i] = sc.next();

            //국어, 영어, 수학 점수 입력 및 저장
            System.out.print("국어점수 입력 : ");
            score[i][0] = sc.nextInt();
            System.out.print("영어점수 입력 : ");
            score[i][1] = sc.nextInt();
            System.out.print("수학점수 입력 : ");
            score[i][2] = sc.nextInt();
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        SungJukAgain sja = new SungJukAgain();
        sja.getInwon();
        sja.setArray();
        sja.getData();
        sja.calcTotal();
        sja.calcAverage();
        sja.setLevel();
        sja.printSungJuk();
    }
}