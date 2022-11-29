
public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		
		string1 = null;
		//System.out.println(string1 + "の文字数：" + string1.length());
	
		/*
		Integer integer1 = 5;                   // オートボクシング
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // 明示的なアンボクシング
		System.out.println(integer1);
		System.out.println(integer2);
		System.out.println(int1);
		System.out.println(int2);
		*/
		
		int[] array1 = new int[3];  // 配列の宣言と生成
		array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 10;  // ３番目と同じ値を２番目の要素に代入
		int int2 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得
		int array2[] = null;  // []は変数名の後ろでも可
		System.out.println(array2.length);
		
		//変数と同じように宣言と同時に初期化
		int[] array3 = new int[] { 10, 20, 50 };
		int[] array4 = { 10, 20, 50 };
	}
}
