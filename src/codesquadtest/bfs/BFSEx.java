package codesquadtest.bfs;

import java.util.Scanner;

public class BFSEx {
//DFS 인데 BFS 로 이름 잘못적음
    static int answer;
    static int n;
    static int arr[][];
    static int ck[][];

    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};

    public void dfs(int x,int y) {

        if (x==n-1&& y==n-1) {
            answer++;
            // 종료
        }
        else {

            for (int i=0;i<4;i++) {

                int nx=x+dx[i];
                int ny=y+dy[i];

                if (nx>=0 && nx<=6 && ny>=0 && ny<=6 && arr[nx][ny]==0) {
                    if (ck[nx][ny]==0) {
                        ck[nx][ny]=1;
                        dfs(nx,ny);
                        ck[nx][ny]=0; // 갔던곳 다시 풀어줌
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=7;
        arr=new int[n][n];
        ck=new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        BFSEx m1=new BFSEx();
        ck[0][0]=1;
        m1.dfs(0,0);
        System.out.println(answer);

    }

}