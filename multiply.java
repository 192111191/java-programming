public class multiply {
    public static void main(String[] args){
        int [][] a ={{1,2,3},{4,5,6}};
        int [][] b ={{1,2,3},{4,5,6}};
        int [][] c = new int[a.length][b[0].length];
        int i,j,k;
        for( i = 0; i < a.length; i++) {
            for ( j = 0; j < b[0].length; j++) {
                for ( k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for ( i = 0;i < c.length; i++){
            for( j = 0;j < c[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
