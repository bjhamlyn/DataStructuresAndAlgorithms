public class EggDrop {

    public static void main(String[] args) {
        
    }
    public int findMaxHeight() {
    int lo = 1, hi = 100, mid;
    while (lo < hi) {
        mid = (lo + hi) / 2;
        if (DidBreak(mid)) {
            hi = mid - 1;
        } else {
            lo = mid + 1;
        }
    }
    // lo (or hi) is now the maximum height
    // where an egg won't break
    return lo;
}

}