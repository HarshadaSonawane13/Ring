import java.util.*;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        int[] processes = new int[n];
        for (int i = 0; i < n; i++) processes[i] = i + 1;

        System.out.print("Enter initiator process: ");
        int initiator = sc.nextInt();

        List<Integer> msg = new ArrayList<>();
        for (int i = initiator - 1; i < n + initiator - 1; i++)
            msg.add(processes[i % n]);

        int leader = Collections.max(msg);
        System.out.println("Leader elected: " + leader);

        sc.close();  // <-- fixes the yellow alert
    }
}
