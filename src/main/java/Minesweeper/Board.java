package Minesweeper;

public class Board {
    private int width,height;
    private  char[][] area;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = new char[width][height];
        setArea();
    }

    public void setArea() {
        for(int i = 0;i<height;i++){
            for(int j =0;j<width;j++){
                this.area[i][j]='.';
            }
        }
    }

    public void setMine(int x, int y){
        this.area[x][y]='o';
    }

    public void printMap(){

        for(int i = 0;i<height;i++){
            System.out.println();
            for(int j =0;j<width;j++){
                System.out.print(area[i][j]);
            }
        }

    }

    public void solveMap(){
        for(int i = 0;i<height;i++){
            for(int j =0;j<width;j++){
                this.area[i][j]=checkNear(i,j);
            }
        }
        for(int i = 0;i<height;i++){
            System.out.println();
            for(int j =0;j<width;j++){
                System.out.print(area[i][j]);
            }
        }
    }
    public char checkNear(int x,int y){
        int mines = 0;
        if(area[x][y]=='.'){
            if(x+1<width&&y+1<height&&area[x+1][y+1]=='o'){
                mines++;
            }
            if(x+1<width&&area[x+1][y]=='o'){
                mines++;
            }
            if(y+1<height&&area[x][y+1]=='o'){
                mines++;
            }
            if(x-1>0&&y-1>0&&area[x-1][y-1]=='o'){
                mines++;
            }
            if(x-1>0&&area[x-1][y]=='o'){
                mines++;
            }
            if(y-1>0&&area[x][y-1]=='o'){
                mines++;
            }
            if(x-1>0&&y+1<height&&area[x-1][y+1]=='o'){
                mines++;
            }
            if(x+1<width&&y-1>0&&area[x+1][y-1]=='o'){
                mines++;
            }
        }else{
            return 'o';
        }
            return (char) (mines +'0');
    }

   public char getValue(int x, int y){
        if(this.area[x][y]=='.'){
            return '.';
        }
        else{
            return 'o';
        }
   }
}
