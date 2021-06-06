import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        Member temp;
        Member firstEmployee = new Member("John", "Johnson", "Manager", "2016-12-31");
        Member secEmployee = new Member("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Member thirdEmployee = new Member("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Member fourthEmployee = new Member("Jake", "Jacobson", "Programmer", "");
        Member fifthEmployee = new Member("Jacquelyn", "Jackson", "DBA", "");
        Member sixEmployee = new Member("Sally", "Webber", "Web Developer", "2015-12-18");
        Member theEmployees[] = new Member[6];
        theEmployees[0] = (firstEmployee);
        theEmployees[1] = (secEmployee);
        theEmployees[2] = (thirdEmployee);
        theEmployees[3] = (fourthEmployee);
        theEmployees[4] = (fifthEmployee);
        theEmployees[5] = (sixEmployee);
        System.out.println("Enter a search string:");
        String search = scanner.nextLine();
        System.out.println("Results:");
        Member searchEmployee[] = new Member[6];
        int spot = 0;
        for (int i = 0; i < theEmployees.length; i++)
        {
            int k = 0;
            int l = 0;
            for (int j = 0; j < search.length(); j++) {
                char theWord = search.charAt(j);
                char theFirst = theEmployees[i].firstName.charAt(j);
                char theLast = theEmployees[i].lastName.charAt(j);
                System.out.println(theWord + " equals " + theLast);
                if (theWord == theFirst) {
                    k++;
                }
                if (theWord == theLast) {
                    l++;
                }
            }
            if (k == search.length() || l == search.length()) {
                searchEmployee[spot] = theEmployees[i];
                spot++;
            }
            System.out.println("time " + i);
        }
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        for (int i = 0; i < searchEmployee.length; i++) {
            if(searchEmployee[i] == null)
            {
                break;
            }
            int hyphenCount = 19;
            int hyphenNo = searchEmployee[i].firstName.length() + searchEmployee[i].lastName.length();
            System.out.print(searchEmployee[i].firstName + " " + searchEmployee[i].lastName);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print("-");
            hyphenCount = 19;
            hyphenNo = searchEmployee[i].thePosition.length();
            System.out.print("|" + searchEmployee[i].thePosition);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print("-");
            hyphenCount = 19;
            hyphenNo = searchEmployee[i].theDate.length();
            System.out.print("|" + searchEmployee[i].theDate);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print("-");
            System.out.println("");
        }
    }
}