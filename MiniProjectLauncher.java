/*
	maker : baseCoder
*/

class MiniProject {
	public void guguOutput() {
		for(int num2 = 1; num2<=9; num2++) {
			for(int num1=1; num1<=9; num1++) {
				int sum = num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + sum + "\t");
			}
			System.out.println();
		}
	}

	public void sevenStarsOutput() {
		String sumText = "";
		for(int num1=1; num1<=7; num1++) {
			switch(num1) {
				case 01:
					sumText = "      *";
					break;
				case 02:
					sumText = "     * *";
					break;
				case 03:
					sumText = "    * * *";
					break;
				case 04:
					sumText = "   * * * *";
					break;
				case 05:
					sumText = "  * * * * *";
					break;
				case 06:
					sumText = " * * * * * *";
					break;
				case 07:
					sumText = "* * * * * * *";
					break;
				default:
					sumText = "Err";
					break;
			}
			System.out.println(sumText);
		}
	}

	void evenOddSumNum() {
		int evenSumNum = 0;
		int oddSumNum = 0;
		for(int loopNum=1; loopNum<=100; loopNum++) {
			int checkNum = loopNum % 2;
			if(checkNum == 0) {
				evenSumNum += loopNum;
			} else {
				oddSumNum += loopNum;
			}
		}
		System.out.println("홀수의 합 : " + oddSumNum);
		System.out.println("짝수의 합 : " + evenSumNum);
	}

	void doList() {
		int selectNum = 0;
		for(int loopNum=1; loopNum<=3; loopNum++) {
			System.out.println();
			switch(loopNum) {
				case 01:
					System.out.print("1. 구구단");
					break;
				case 02:
					System.out.print("2. 칠성");
					break;
				case 03:
					System.out.print("3. 1~100 홀수 짝수 합");
					break;
				default:
					System.out.println("Err");
					break;
			}
			System.out.println(" 출력");
				
			switch(loopNum) {	
				case 1:
					guguOutput();
					break;
				case 2:
					sevenStarsOutput();
					break;
				case 3:
					evenOddSumNum();
					break;
				default:
					System.out.println("Err");
					break;
			}
		}
	}
}

class MiniProjectLauncher {
	public static void main(String[] args) {
		MiniProject miniProto = new MiniProject();
		miniProto.doList();
	}
}