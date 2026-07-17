class BrowserHistory {

private List<String> history;
    private int curr;
    private int maxBound;
    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        curr = 0;
        maxBound = 0;
    }
    
    public void visit(String url) {
        curr++;
        if (curr < history.size()) 
            history.set(curr, url);
         else 
            history.add(url);
        
        maxBound = curr;
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(maxBound, curr + steps);
        return history.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */