public class SungJukSort extends SungJukAgain
{
    int[] rank; //석차 저장할 배열
    
    public void setRank() //석차값 구하기
    {
        rank = new int[totalperson]; //석차배열의 크기 할당
        for (int i = 0; i < totalperson; i++) //석차배열의 초기값 할당
        {
            rank[i] = 1; //모두 1등으로
        }
        for (int i = 0; i < totalperson - 1; i++) //반복횟수 = 인원수 - 1
        {
            for (int j = i + 1; j < totalperson; j++) //반복횟수 = 인원수 - i+1
            {
                if (avg[i] > avg[j])
                {
                    rank[j]++; //평균이 적은사람의 석차를 1 증가
                }
                else if (avg[i] < avg[j])
                {
                    rank[i]++; //평균이 적은사람의 석차를 1 증가
                }
            }
        }
    }
    public void printSungJuk() //석차를 포함한 성적 출력
    {
        System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t" + "석차\t");
        System.out.println("=======================================================");
        for (int i = 0; i < name.length; i++)
        {
            System.out.println(name[i] + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t" + sum[i] + "\t" + avg[i] + "\t" + level[i] + "\t" + rank[i]);
        }
    }
    public static void main(String[] args)
    {
        SungJukSort sjs = new SungJukSort();
        sjs.getInwon();
        sjs.setArray();
        sjs.getData();
        sjs.calcTotal();
        sjs.calcAverage();
        sjs.setLevel();
        sjs.setRank();
        sjs.printSungJuk();
    }
}