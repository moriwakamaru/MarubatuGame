package marubatuGame;

import java.util.Scanner;

public class Player {

	static int selectRow=0;
	static int selectColumn=0;
	String mark;

	Player(String usedMark)
	{
		mark=usedMark;
	}
	
	void selectSpace(String board[][],Scanner sc)
	{
		while(true)
		{
			selectRow=selectRow(sc);
			selectColumn=selectColumn(sc);
			if(board[selectRow][selectColumn]==null)
			{
				board[selectRow][selectColumn]=mark;
				break;
			}else
			{
				System.out.println("選択済みもしくは範囲外です。\\nもう一度選択してください。");
				continue;
			}
		}
	}
	
	public static int selectRow(Scanner sc)
	{
		
		System.out.println("行を選択してください");
		return  sc.nextInt();


	}
	public static int selectColumn(Scanner sc)
	{
		
		System.out.println("列を選択してください");
		return sc.nextInt();
	}
}
