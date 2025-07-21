
// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// used a hashmap that stores the message as key and timestamp as value, so if next time a same
// valued message comes, it checkes if last printed message was before 10s
// if yes, it updates the value and returns true else returns false.
// if the message is not present it adds to the hashmap and returns true.

class Logger {
    HashMap<String,Integer> messages;
    public Logger() {
        this.messages=new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!messages.containsKey(message)) {
            messages.put(message,timestamp);
            return true;
        }
        if(timestamp>=messages.get(message)+10){
            messages.put(message,timestamp);
            return true;
        }
        return false;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */