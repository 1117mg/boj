package prac;

public class practice {
    public static void main(String[] args){
        int arr[][][] = new int[2][3][2];

        for(int i=1;i<2;i++){
            for(int j=2;j<3;j++){
                for(int k=j;k<2;k++){
                    arr[i][j][k]=i*j*k;
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    System.out.print(arr[i][j][k]);
                }
            }
        }
    }
}
