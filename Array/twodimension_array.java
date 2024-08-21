
public class twodimension_array {
public static void main(String[] args) {
    /* int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
    int i=0;
    while(i<arr.length){
        int j=0;
        while(j<arr[i].length){
            System.out.print(arr[i][j]+" ");
            j++;

        }
        System.out.println();
        i++;

    } */




    int [][] flats;
    flats=new int[2][3];
    flats[0][0]=101;
    flats[0][1]=102;
    flats[0][2]=103;
    flats[1][0]=201;
    flats[1][1]=202;
    flats[1][2]=203;


    // displaying 2d array 
    for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
           System.out.print(flats[i][j]);
           System.out.print(" ");
        }
        System.out.println("");
    }
}
    
}