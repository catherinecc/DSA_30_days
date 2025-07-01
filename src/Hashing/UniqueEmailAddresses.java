package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {
                "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"
        };
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        int uniqueCount = uniqueEmailAddresses.numUniqueEmails(emails);
        System.out.println("Number of unique emails: " + uniqueCount);
    }

    private int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        int count = 0;
        for (String s : emails) {
            String[] arr = s.split("@");
            String local = arr[0];
            local = local.replaceAll("\\.", "");
            local = local.replaceAll("\\+.*", "");
            String uniqueEmail = local + "@" + arr[1];
            if (!uniqueEmails.contains(uniqueEmail)) {
                System.out.println("Adding unique email: " + uniqueEmail);
                uniqueEmails.add(uniqueEmail);
                count++;
            }
        }
        return count;
    }
}
