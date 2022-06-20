public class SungJuk //성적처리 클래스
{
    String[] name = {"홍길동", "박길동", "김길동"};
    int[][] score = {{90, 85, 70}, {95, 85, 90}, {85, 95, 85}};
    int[] sum = new int[3];
    double[] avg = {0.0, 0.0, 0.0};
    char[] level = new char[3];

    public void calcTotal() //총점 계산
    {
        for (int i = 0; i < score.length; i++)
        {
            sum[i] = score[i][0] + score[i][1] + score[i][2];
        }
    }
    public void calcAverage() //평균 계산
    {
        for (int i = 0; i < avg.length; i++)
        {
            avg[i] = sum[i] / 3;
        }
    }
    public void setLevel() //학점 계산
    {
        for (int i = 0; i < avg.length; i++)
        {
            if (avg[i] >= 90)
            {
                level[i] = 'A';
            }
            else if (avg[i] >= 80)
            {
                level[i] = 'B';
            }
            else if (avg[i] >= 70)
            {
                level[i] = 'C';
            }
            else if (avg[i] >= 60)
            {
                level[i] = 'D';
            }
            else
            {
                level[i] = 'F';
            }
        }
    }
    public void printSungJuk() //성적 출력
    {
        System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t");
        System.out.println("=======================================================");
        for (int i = 0; i < name.length; i++)
        {
            System.out.println(name[i] + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t" + sum[i] + "\t" + avg[i] + "\t" + level[i]);
        }
    }
    public static void main(String[] args)
    {
        SungJuk sj = new SungJuk();
        sj.calcTotal();
        sj.calcAverage();
        sj.setLevel();
        sj.printSungJuk();
    }
}