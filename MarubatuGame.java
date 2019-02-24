package marubatuGame;

import java.util.Scanner;

public class MarubatuGame
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=3;
		String[][]board=new String[size][size];
		System.out.println("まるばつゲームを始めます！ボードは3×3です");
		Player Player1=new Player("〇","player1");
		Player Player2=new Player("×","player2");

		for(int turnNo=0;turnNo<=(size*size)/2;turnNo++)
		{
			System.out.println("～ターン"+turnNo+"～");
			outPutData(board,size);
			System.out.println("Player1の番です");
			Player1.selectSpace(board,sc);
			Judge.Line(board,sc,size,Player1);
			if(turnNo==(size*size)/2)break;

			outPutData(board,size);
			System.out.println("Player2の番です");
			Player2.selectSpace(board,sc);
			Judge.Line(board,sc,size,Player2);
		}
		outPutData(board,size);
		System.out.println("決着がつきませんでした。まるばつゲームを終了します。");
	}

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

}
