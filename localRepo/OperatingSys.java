import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperatingSys {
  static  class Process {
        int id;
        int arrivalTime;
        int burstTime;
        int completionTime;
        int TAT;
        int WT;
    
        public Process(int id, int arrivalTime, int burstTime) {
            this.id = id;
            this.arrivalTime = arrivalTime;
            this.burstTime = burstTime;
        }
    }
    
    public static void main(String[] args) {
         List<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 0, 5));
        processes.add(new Process(2, 1, 3));
        processes.add(new Process(3, 2, 8));

        // Sort processes by arrival time (for FCFS)
        Collections.sort(processes, Comparator.comparingInt(p -> p.arrivalTime));

        int currentTime = 0;
        for (Process process : processes) {
            if (currentTime < process.arrivalTime) {
                currentTime = process.arrivalTime;
            }
            process.completionTime = currentTime + process.burstTime;
            currentTime = process.completionTime;
            process.TAT=process.completionTime-process.arrivalTime;
            process.WT=process.TAT-process.burstTime;

        }
        System.out.println("ID\tArrival\tBurst\tCT\tTAT\tWT");
        for (Process process : processes) {
            System.out.println(process.id + "\t" + process.arrivalTime + "\t" + 
                               process.burstTime + "\t" + process.completionTime+"\t"+process.TAT+"\t"+process.WT);
    
                      

        }
    }
}
