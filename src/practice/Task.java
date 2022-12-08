package practice;

public class Task {
	//メンバー変数
	//日付
	private int date;	//ンスタンス変数
	//タスク内容
	private String content;	//インスタンス変数
	//状態（trueで完了）
	private boolean done;	//インスタンス変数
	
	//コンストラクタを作成
	public Task(int date, String content) {
		this.date = date;
		this.content = content;
	}
	
	//doneメソッド
	//状態を官僚にする
	public void  done() {
		System.out.println("タスク「" + content + "」を完了します。");
		done = true;
	}
	
	//printメソッド
	//タスク内容を表示する
	public void print() {
		if (done == false) {
			System.out.println(date + "のタスク「" + content + "」は未完了です。");
		} else {
			System.out.println(date + "のタスク「" + content + "」は完了しています。");
		}
	}
}
