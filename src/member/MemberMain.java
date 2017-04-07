package member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberMain {
    public static void main(String[] args){
/*
        Member member1 = new Member("허민", 30, "010-0000-0001", "hedgar0601@gmail.com");
        Member member2 = new Member("진하영", 24, "010-0000-0002", "aaaaaaaa@gmail.com");
        Member member3 = new Member("이기봉", 26, "010-0000-0003", "aaaaaaab@gmail.com");
        Member member4 = new Member("황순성", 27, "010-0000-0004", "aaaaaaac@gmail.com");
        Member member5 = new Member("이가영", 26, "010-0000-0005", "aaaaaaad@gmail.com");
        Member member6 = new Member("류관이", 26, "010-0000-0006", "aaaaaaae@gmail.com");
        Member member7 = new Member("이준석", 26, "010-0000-0007", "aaaaaaaf@gmail.com");
        Member member8 = new Member("김태준", 27, "010-0000-0008", "aaaaaaag@gmail.com");
        Member member9 = new Member("임준성", 20, "010-0000-0009", "aaaaaaah@gmail.com");
        Member member10 = new Member("류성아", 25, "010-0000-0010", "aaaaaaai@gmail.com");
        Member member11 = new Member("이세원", 27, "010-0000-0011", "aaaaaaaj@gmail.com");

        List<Member> memberList = Arrays.asList(
                member1, member2, member3, member4, member5,
                member6, member7, member8, member9, member10, member11);
 */

/*
        Member[] memberArray = new Member[11];

        memberArray[0] = new Member("허민", 30, "010-0000-0001", "hedgar0601@gmail.com");
        memberArray[1] = new Member("진하영", 24, "010-0000-0002", "aaaaaaaa@gmail.com");
        memberArray[2] = new Member("이기봉", 26, "010-0000-0003", "aaaaaaab@gmail.com");
        memberArray[3] = new Member("황순성", 27, "010-0000-0004", "aaaaaaac@gmail.com");
        memberArray[4] = new Member("이가영", 26, "010-0000-0005", "aaaaaaad@gmail.com");
        memberArray[5] = new Member("류관이", 26, "010-0000-0006", "aaaaaaae@gmail.com");
        memberArray[6] = new Member("이준석", 26, "010-0000-0007", "aaaaaaaf@gmail.com");
        memberArray[7] = new Member("김태준", 27, "010-0000-0008", "aaaaaaag@gmail.com");
        memberArray[8] = new Member("임준성", 20, "010-0000-0009", "aaaaaaah@gmail.com");
        memberArray[9] = new Member("류성아", 25, "010-0000-0010", "aaaaaaai@gmail.com");
        memberArray[10] = new Member("이세원", 27, "010-0000-0011", "aaaaaaaj@gmail.com");
 */


        Member[] inMemberArray = new Member[11];

        Scanner scanner = new Scanner(System.in);
        String name =null;
        int age = 0;
        String phoneNumber = null;
        String eMail = null;

        for(Member e: inMemberArray){
            System.out.println("input name: ");
            name = scanner.nextLine();

            System.out.println("input age: ");
            age = scanner.nextInt();

            System.out.println("input phoneNumber: ");
            phoneNumber = scanner.nextLine();

            System.out.println("input eMail: ");
            eMail = scanner.nextLine();

            e.setName(name);
            e.setAge(age);
        }


        //calcAverageAge
        Member am = new Member();
        double average = am.calcAverageAge(inMemberArray);
        System.out.printf("average: %.1f\n", average);

        //howManyMembersWithLastName
        System.out.println("input lastName:");
        String lastName = scanner.nextLine();

        int howManyLastName = am.howManyMembersWithLastName(inMemberArray, lastName);
        System.out.printf("howManyLastName: %d\n", howManyLastName);

        //calcAverageIdChar
        double averageIdchar = am.calcAverageIdChar(inMemberArray);
        System.out.printf("average: %.1f\n", averageIdchar);

    }
}
