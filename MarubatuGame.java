package marubatuGame;

import java.util.Scanner;

public class MarubatuGame
{

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		String[][]board=new String[3][3];
		System.out.println("まるばつゲームを始めます！ボードは3×3です");
		Player Player1=new Player("〇");
		Player Player2=new Player("×");
		

		for(int turnNo=0;turnNo<6;turnNo++)
		{
			System.out.println("～ターン"+turnNo+"～");
			outPutData(board);
			System.out.println("Player1の番です");
			Player1.selectSpace(board,sc);
			Judge(board);

			outPutData(board);
			System.out.println("Player2の番です");
			Player2.selectSpace(board,sc);
			Judge(board);
		}
		outPutData(board);
		Judge(board);
		System.out.println("決着がつきませんでした。まるばつゲームを終了します。");

	}

	public static void outPutData(String board[][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]);
				if(j==2)
				{
					System.out.println("");
					break;
				}
				System.out.print("|");
			}
		}
	}

	public static void Judge(String board[][])
	{
		/*例えば、１列調べたい場合
		bord[0][0]&&bord[0][1]&&bord[0][2]&&bord[0][0]!=nullよりも

		boolean tmp=true;
		for(int i=0;i<3;i++){
		   //bord[0][i]が目的の値になってなかったらtmp=falseにする
		}
		これで1列全部目的の値になっているかをtmpに入れることができます
		のようにした方がよいです*/

		if((board[0][0]==board[0][1]&&board[0][0]==board[0][2]&&board[0][0]!=null) || (board[1][0]==board[1][1]&&board[1][0]==board[1][2]&&board[1][0]!=null) || (board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&board[2][0]!=null)
				|| (board[0][0]==board[1][0]&&board[0][0]==board[2][0]&&board[0][0]!=null) || (board[1][0]==board[1][1]&&board[1][0]==board[1][2]&&board[1][0]!=null) || (board[2][0]==board[2][1]&&board[2][0]==board[2][2]&&board[2][0]!=null)
				||(board[2][0]==board[1][1]&&board[2][0]==board[0][2]&&board[1][1]!=null) || (board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&board[1][1]!=null))

		{
			if(board[0][0]=="〇"||board[1][1]=="〇"||board[2][2]=="〇")
			{
				System.out.println("Player1の勝利です");
			}else
			{
				System.out.println("Player2の勝利です");
			}
			System.out.println("まるばつゲームを終了します。");
			System.exit(0);
		}
	}


}
