package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ElectronicVotingMachine {

	public static void main(String[] args) {
		try {
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			int c1 = 0;
			int c2 = 0;
			int c3 = 0;
			int c4 = 0;
			int n;
			int rollno;
			int max;

			System.out.println(" {************************************************} ");
			System.out.println("\t ------- Kindly !!!! Enter Starting Roll No Of Your Batch ");
			rollno = Integer.parseInt(b.readLine());

			do {
				System.out.printf("%s%d%s", "\n\t@@@@ Enter your vote Roll number ", rollno, "  @@@@");
				System.out.println("\n\t---- Press 1 for Mayank Sharma");
				System.out.println("\n\t---- Press 2 for Tauseef");
				System.out.println("\n\t---- Press 3 for Arfan");
				System.out.println("\n\t---- Press 4 for Nafees ");
				System.out.println("\n\t---- Enter 0 to stop voting and display the result");
				n = Integer.parseInt(b.readLine());
				System.out.printf("\t%s%d%s", "------ Congrats Roll Number ", rollno,
						" . Your Vote Has Been Succesfully Casted ");
				rollno++;

				if (n == 1) {
					c1++;
				} else if (n == 2) {
					c2++;
				} else if (n == 3) {
					c3++;
				} else if (n == 4) {
					c4++;
				}

			} while (n != 0);
			System.out.println("");
			System.out.println("");
			System.out.println("");

			max = c1;

			if (c2 > max) {
				max = c2;
			} else if (c3 > max) {
				max = c3;
			} else if (c4 > max) {
				max = c4;
			}

			if (max == c1) {
				System.out.printf("%s%d%s%s", " Winner Of The Election Is Mayank Sharma with ", c1, " votes ",
						" Congo Man Party Chahiye ");
			} else if (max == c2) {
				System.out.printf("%s%d%s%s", " Winner Of The Election Is Tauseef with ", c2, " votes ",
						" Congo Man Party Chahiye ");
			} else if (max == c3) {
				System.out.printf("%s%d%s%s", " Winner Of The Election Is Arfan with ", c3, " votes ",
						" Congo Man Party Chahiye ");
			} else if (max == c1) {
				System.out.printf("%s%d%s%s", " Winner Of The Election Is Nafees with ", c4, " votes ",
						" Congo Man Party Chahiye ");
			}

			System.out.println("\n\t ------------ Election Results In Detail ---------");
			System.out.printf("%s%d%s", "\n\t------ Mayank Sharma HAs Got ", c1, " Votes");
			System.out.printf("%s%d%s", "\n\t------ Tauseef HAs Got ", c2, " Votes");
			System.out.printf("%s%d%s", "\n\t------- tArfan HAs Got ", c3, " Votes");
			System.out.printf("%s%d%s", "\n\t------ Nafees HAs Got ", c4, " Votes");
		} catch (Exception e) {
		}

	}

}
