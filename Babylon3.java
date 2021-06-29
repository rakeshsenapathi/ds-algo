public class Babylon3 {

    public static void main(String[] args) {


        String[] strings = new String[]{
                "7",
                "1100001",
                "1110001",
                "0110001",
                "0001100",
                "0001100",
                "0000010",
                "0010001"

        };

        int count = zombieCluster(strings);
        System.out.println(count);
    }


    static int zombieCluster(String[] zombies) {

        int len = Integer.parseInt(zombies[0]);

        int[][] matrixRep = new int [len][len];
        for(int i = 0; i<len; i++) {
            for (int j = 0 ; j<len; j++) {
                matrixRep[i][j] = Integer.parseInt(zombies[i + 1].charAt(j) + "");
            }
        }

        boolean visited[] = new boolean[len];
        boolean visiting[] = new boolean[len];

        int count = 0;
        for (int i = 0; i < len; ++i) {
            if(!visited[i]) {
                visiting[i] = true;
                DepthFirstSearch(matrixRep, len, visited, visiting, i);
                visited[i] = true;
                count++;
            }
        }
        return count;
    }

    static void DepthFirstSearch(int M[][], int N, boolean visited[], boolean[] visiting, int s)
    {
        if( !visited[s] ) {
            visiting[s] = true;
            for(int j = s+1; j < N; j++) {
                if(M[s][j] == 1 && !visited[j]) {
                    visiting[j] = true;
                    DepthFirstSearch(M, N, visited, visiting, j);
                    visited[j] = true;
                }
            }
        }
    }
}

