package week3;


import java.util.*;
import edu.duke.*;


public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         records = new ArrayList<LogEntry>();
     }
    
    // read a new file
     public void readFile(String filename) {
         FileResource fr = new FileResource();
         for (String line: fr.lines()) {
             LogEntry le = WebLogParser.parseEntry(line);
             records.add(le);
            }
     }
    
    // print all information in records
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     
     // count the number of unique IPs.
     public int countUniqueIPs() {
         ArrayList<String> uniqueip = new ArrayList<String>();
         for (LogEntry le: records) {
             String ip = le.getIpAddress();
             if (!uniqueip.contains(ip)) uniqueip.add(ip);
         }
         return uniqueip.size();
     }
     
     // return unique Ips that visited that day.
     public ArrayList<String> uniqueIPVisitsOnDay(String someday) {
         ArrayList<String> uniqueip = new ArrayList<String>();
         for (LogEntry le:records) {
             String whole = le.getAccessTime().toString();
             String date = whole.substring(8, 10);
             String month = whole.substring(4, 7);
             if (someday.substring(0,3).equals(month) && someday.substring(4,6).equals(date)) {
                 String ip = le.getIpAddress();
                 System.out.println(ip);
                 if (!uniqueip.contains(ip)) uniqueip.add(ip);
                }
         }
         return uniqueip;
     }
     
     // count the number of unique IPs having status code in range
     public int countUniqueIPsInRange(int low, int high) {
         ArrayList<String> uniqueip = new ArrayList<String>();
         for (LogEntry le:records) {
             int whole = le.getStatusCode();
             if (whole>=low && whole<=high) {
                 String ip = le.getIpAddress();
                 System.out.println(ip);
                 if (!uniqueip.contains(ip)) uniqueip.add(ip);
                }
         }
         return uniqueip.size();
     }
     
     // print status code higher than a number
     public void printAllHigherThanNum(int num) {
         ArrayList<Integer> uniquestatus = new ArrayList<Integer>();
         for (LogEntry le:records) {
             int whole = le.getStatusCode();
             if (whole> num) {
                 if (!uniquestatus.contains(whole)) uniquestatus.add(whole);
                }
         }
         for (int status: uniquestatus) {
             System.out.println(status+"\t");
            }
         
     }
     
     // return number of visits per IP.
     public HashMap<String, Integer> countVisitsPerIP() {
        HashMap<String, Integer> uniqip = new HashMap<String, Integer>();
         for (LogEntry le:records) {
             String ip = le.getIpAddress();
             if (!uniqip.containsKey(ip)) {
                 uniqip.put(ip, 1);
                }
             else uniqip.put(ip, uniqip.get(ip)+1);
         }
         return uniqip;
     }
     
     // return the number of most visits by IP.
     public int mostNumberVisitsByIP(HashMap<String, Integer> uniqip) {
         int max=0;
         int current;
         for (String ip: uniqip.keySet()) {
             current = uniqip.get(ip);
             if (max < current) max = current;
         }
         return max;
     }
     
     // return the IP list with most visit numer above.
     public ArrayList<String> iPsMostVisits(HashMap<String, Integer> uniqip) {
         int max = mostNumberVisitsByIP(uniqip);
         ArrayList<String> show = new ArrayList<String>();
         int current;
         for (String ip: uniqip.keySet()) {
             current = uniqip.get(ip);
             if (max == current) show.add(ip);
         }
         return show;
     }
     
     // return each day and IPs for that day.
     public HashMap<String, ArrayList<String>> iPsForDays() {
         HashMap<String, ArrayList<String>> eachday = new HashMap<String, ArrayList<String>>();
         for (LogEntry le:records) {
             String whole = le.getAccessTime().toString();
             String date = whole.substring(8, 10);
             String month = whole.substring(4, 7);
             String time = month + " " + date;
             String ip = le.getIpAddress();
             if (!eachday.containsKey(time)) {
                 eachday.put(time, new ArrayList<String>());
             }
             eachday.get(time).add(ip);
         }
         return eachday;
     }
     
    // return the day with most IP visits.
    public String dayWithMostIPVisits(HashMap<String, ArrayList<String>> eachday) {
        String mosttime=null;
        int most = 0;
        int current;
        for (String time: eachday.keySet()) {
            current = eachday.get(time).size();
            if (most < current) {
                most = current;
                mosttime = time;
            }
        }
        return mosttime;
    }
    
    // return the IP list with most visits on particular day.
    public ArrayList<String> iPsWithMostVisitsOnDay(HashMap<String, ArrayList<String>> eachday, String day) {
        ArrayList<String> ip = new ArrayList<String>();
        HashMap<String, Integer> eachip = new HashMap<String, Integer>();
        ArrayList<String> mostthatday = new ArrayList<String>();
        int mostnumber = 0;
        int currentnumber;
        for (String time: eachday.keySet()) {
            if (time.equals(day)) {
                ip = eachday.get(time);
            }
        }
        for (int k = 0; k < ip.size(); k++) {
            if (!eachip.containsKey(ip.get(k))) {
                eachip.put(ip.get(k), 1);
            }
            else eachip.put(ip.get(k), eachip.get(ip.get(k))+1);
        }
        mostthatday = iPsMostVisits(eachip);
        return mostthatday;
    }
}
