
public class Chapter08_2 {
	public static void main(String[] args) {
		String week = "Sunday";
		switch (week) {
		case "Sunday":
			System.out.println("日曜日");
			break;
		case "Monday":
			System.out.println("月曜日");
			break;
		case "Tuesday":
			System.out.println("火曜日");
			break;
		case "Wednesday":
			System.out.println("水曜日");
			break;
		case "Thursday":
			System.out.println("木曜日");
			break;
		case "Friday":
			System.out.println("金曜日");
			break;
		case "Saturday":
			System.out.println("土曜日");
		default:
			System.out.println("曜日ではありません");
		}
		
		
	}
}
