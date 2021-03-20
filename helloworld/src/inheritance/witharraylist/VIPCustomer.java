package inheritance.witharraylist;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        // super() <- precompie段階で自動的に呼び出される。上位のクラスをさす。
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    // 上位クラスで定義されたメソッドの中下位クラスと機能が合わないとか追加機能が欲しい場合同じ名前とパーらメータで下位クラスで再定義する。
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public int getAgentId() {
        return agentID;
    }
}
