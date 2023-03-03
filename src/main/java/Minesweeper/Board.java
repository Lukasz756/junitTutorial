package Minesweeper;

public class Board {
    private int width,height;
    private  int[][] area;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = new int[width][height];
        this.setArea(this.area);
    }

    public void setArea(int[][] area) {
        for(int[] int1:area){
            for(int int2:int1){
                int2=0;
            }
        }
    }

    public void setMine(int x, int y){
        area[x][y]=1;
    }

    public void print(){
        for(int i = 0;i<height;i++){
            for(int j =0;j<width;j++){

            }
        }
    }
    public int checkNear(int x,int y){
        int mines = 0;
        if(area[x][y]!=0){
            if(x+1<width&&y+1<height&&area[x+1][y+1]==1){
                mines++;
            }
            if(x+1<width&&area[x+1][y]==1){
                mines++;
            }
            if(y+1<height&&area[x][y+1]==1){
                mines++;
            }
            if(x-1>0&&y-1>0&&area[x-1][y-1]==1){
                mines++;
            }
            if(x-1>0&&area[x-1][y]==1){
                mines++;
            }
            if(y-1>0&&area[x][y-1]==1){
                mines++;
            }
            if(x-1>0&&y+1<height&&area[x-1][y+1]==1){
                mines++;
            }
            if(x+1<width&&y-1>0&&area[x+1][y-1]==1){
                mines++;
            }
        }else{

        }
        return mines;
    }

   public int getValue(int x, int y){
        if(area[x][y]==0){
            return 0;
        }
        else{
            return 1;
        }
   }
}
