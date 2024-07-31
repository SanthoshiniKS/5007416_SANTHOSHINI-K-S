package ObserverPatternExample;
public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket st=new StockMarket("aaa","aaaa@gmail.com",100);
        Observer m=new MobileApp(st);
        Observer w=new WebApp(st);

        st.register(m);
        st.register(w);
        st.setPrice(200);
    }
}
