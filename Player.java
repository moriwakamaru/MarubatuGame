package marubatuGame;

import java.util.Scanner;

public class Player {

	public int selectedRow;
	public int selectedColumn;
	public String mark;
	public String name;

	Player(String usedMark,String playername)
	{
		mark=usedMark;
		name=playername;
	}
	
	public void selectSpace(String board[][],Scanner sc)
	{
		while(true)
		{
			selectRow(sc);
			selectColumn(sc);
			if(board[selectedRow][selectedColumn]==null)
			{
				board[selectedRow][selectedColumn]=mark;
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
		System.out.println("行を選択してください");
		selectedRow= sc.nextInt();
		if(selectedRow<0||selectedRow>2)
		{
			System.out.println("選択済みもしくは範囲外です。もう一度選択してください。");
			selectRow(sc);
		}
	}
	
	
	void selectColumn(Scanner sc)
	{
		System.out.println("列を選択してください");
		selectedColumn=sc.nextInt();
		if(selectedColumn<0||selectedColumn>2)
		{
			System.out.println("選択済みもしくは範囲外です。\\nもう一度選択してください。");
			selectColumn(sc);
		}
	}
	
}
