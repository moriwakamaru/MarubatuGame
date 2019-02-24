package marubatuGame;

import java.util.Scanner;

public class Board {
	
	public static int size=3;
	public static String[][]board=new String[size][size];
	
	public static void outPutData(String board[][],int size)
	{
		for(int i=0;i<=size-1;i++)
		{
			for(int j=0;j<=size-1;j++)
			{
				if(board[i][j]==null)
				{
					System.out.print("　");
				}else
				{
					System.out.print(board[i][j]);
				}
				
				if(j==size-1)
				{
					System.out.println("");
					break;
				}
				System.out.print("|");
			}
			for(int j=0;j<=size;j++)
			{
				if(i==size-1)break;
				System.out.print("─");
			}
			System.out.println("");
			
		}
	}

	
	public static void judgeLine(String board[][],Scanner sc,int size,Player player)
	{
		//横にならんでいるか
        int tmp = 0;
        for(int x=0; x<size; x++){
            if(board[x][player.selectedColumn] == player.mark)tmp++;
        }
        if(tmp==size)win(player);
        	
        
      //縦にならんでいるか
        tmp = 0;
        for(int y=0; y<size; y++){
            if(board[player.selectedRow][y] ==  player.mark)tmp++;
        }
        if(tmp==size)win(player);

        //ななめにならんでいるか
        tmp = 0;
        for(int x=0; x<size; x++){
            if(board[x][x] == player.mark)tmp++;
        }
        if(tmp==size)win(player);

        //ななめにならんでいるか
        tmp = 0;
        for(int x=0; x<size; x++){
            if(board[x][size-1-x] == player.mark)tmp++;
        }
        if(tmp==size)win(player);

	}

	static void win(Player player)
	{
		System.out.println(player.name+"の勝ちです");
		System.out.println("まるばつゲームを終了します。");
		System.exit(0);
	}
}
