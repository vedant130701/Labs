package p1;

public class Max{
    public int max(int m1,int m2,int m3){
        if(m1>m2){
            if(m1>m3){
                return m1;
            }
            else{
                return m3;
            }
        }
        else{
            if(m2>m3){
                return m2;
            }
            else{
                return m3;
            }
        }
    }

    public float max(float m1,float m2,float m3){
        if(m1>m2){
            if(m1>m3){
                return m1;
            }
            else{
                return m3;
            }
        }
        else{
            if(m2>m3){
                return m2;
            }
            else{
                return m3;
            }
        }
    }

    public int max(int arr[]){
        int maximum,i;
        maximum=arr[0];
        for(i=1;i<arr.length;++i){
            if(maximum<arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public int max(int arr[][]){
        int maximum,i,j;
        maximum=arr[0][0];
        for(i=0;i<arr.length;++i){
            for(j=0;j<arr[i].length;++j){
                if(maximum<arr[i][j]){
                    maximum = arr[i][j];
                }
            }
        }
        return maximum;
    }
}