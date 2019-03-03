package marubatuGame;

import java.util.Scanner;

public class Player {

	int selectedRow;
	int selectedColumn;
	String mark;
	String name;

	Player(String usedMark,String playername)
	{
		mark=usedMark;
		name=playername;
	}
	
	static void win(Player player)
	{
		System.out.println(player.name+"の勝ちです");
		System.out.println("まるばつゲームを終了します。");
		System.exit(0);
	}
	
	public void selectSpace(Scanner sc)
	{
		while(true)
		{
			selectRow(sc);
			selectColumn(sc);
			if(Board.board[selectedRow][selectedColumn]==null)
			{
				Board.board[selectedRow][selectedColumn]=mark;
				break;
			}else
			{
				System.out.println("選択済みもしくは範囲外です。もう一度選択してください。");
				continue;
			}
		}
	}
	
	void selectRow(Scanner sc)
	{
		while(true)
		{
			System.out.println("行を選択してください");
			selectedRow= sc.nextInt();
			if(selectedRow<0||selectedRow>2)
			{
				System.out.println("選択済みもしくは範囲外です。もう一度選択してください。");
			}
			else
			{
				break;
			}
		}
	}
	
	
	void selectColumn(Scanner sc)
	{
		while(true)
		{
			System.out.println("列を選択してください");
			selectedColumn=sc.nextInt();
			if(selectedColumn<0||selectedColumn>2)
			{
				System.out.println("選択済みもしくは範囲外です。\\nもう一度選択してください。");
			}
			else
			{
				break;
			}
			
				
		}
	}
	
}
