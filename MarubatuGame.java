package marubatuGame;

import java.util.Scanner;

public class MarubatuGame
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("まるばつゲームを始めます！ボードは3×3です");
		Player player1=new Player("〇","player1");
		Player player2=new Player("×","player2");

		for(int turnNo=0;turnNo<=(Board.size*Board.size)/2;turnNo++)
		{
			System.out.println("～ターン"+turnNo+"～");
			
			Board.outPutData();
			System.out.println("Player1の番です");
			player1.selectSpace(sc);
			Board.judgeLine(player1);
			if(turnNo==(Board.size*Board.size)/2)break;

			Board.outPutData();
			System.out.println("Player2の番です");
			player2.selectSpace(sc);
			Board.judgeLine(player2);
		}
		Board.outPutData();
		System.out.println("決着がつきませんでした。まるばつゲームを終了します。");
	}

}
