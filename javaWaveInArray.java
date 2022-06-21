
public class WaveMainT1 {

  static int[][] table1 = {
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}
  };
  
  static int[][] table2 = {
    {0,1,2,3},
    {1,2,3,4},
    {2,3,4,5},
    {3,4,5,6}
  };

  public static void main(String[] args) {
    ShowTable(table2);
    Wave(table2);
  }

  static void Wave(int[][] table) {
    cwl(table2[1][1]+ " top right:"+table2[1-1][1+1]);
    for(int i=0;i<table.length;i++)
    {
      for(int j=0;j<i+1;j++)
      {
       try{
// writing wave point as 9
       table[i][i]=9;
       table[i-j][i]=9;
       table[i][i-j]=9;
// removing back side of wave
       table[i-j][i-1]=0;
       table[i-1][i-j]=0;
       
       }catch(Exception excp){}
      }
      ShowTable(table);
      
    }
    
  }
  
  static void ShowTable(int[][] table)
  {
  cwl(GenLine(table.length*3,"="));
    for(int i=0;i<table.length;i++)
    {
      for(int j=0;j<table[i].length;j++)
      {
      cw("["+table[i][j]+"]");
      }
      cwl("");
    }
    cwl(GenLine(table.length*3,"="));
  }
  static String GenLine(int length,String lineChar)
  {
    String x="";
    for(int y=0;y<length;y++)
    {
      x+=lineChar;
    }
    return x;
  }
  static void cwl(Object msg) {
    System.out.println(msg);
  }

  static void cw(Object msg) {
    System.out.print(msg);
  }
}
