package marubatuGame;

import java.util.Scanner;

public class Player {

	public int selectRow;
	public int selectColumn;
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
			if(board[this.selectRow][this.selectColumn]==null)
			{
				board[this.selectRow][this.selectColumn]=mark;
				break;
			}else
			{
				System.out.println("選択済みもしくは範囲外です。\\nもう一度選択してください。");
				continue;
			}
		}
	}
	
	void selectRow(Scanner sc)
	{
		
		System.out.println("行を選択してください");
		this.selectRow= sc.nextInt();


	}
	void selectColumn(Scanner sc)
	{
		
		System.out.println("列を選択してください");
		this.selectColumn=sc.nextInt();
	}
	
}
