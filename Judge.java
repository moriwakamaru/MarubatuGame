package marubatuGame;

import java.util.Scanner;

public class Judge {
	
	public static void Line(String board[][],Scanner sc,int size,Player player)
	{
		//横にならんでいるか
        int tmp = 0;
        for(int x=0; x<size; x++){
            if(board[x][player.selectColumn] == player.mark)tmp++;
        }
        if(tmp==size)win(player);
        	
        
      //縦にならんでいるか
        tmp = 0;
        for(int y=0; y<size; y++){
            if(board[player.selectRow][y] ==  player.mark)tmp++;
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
