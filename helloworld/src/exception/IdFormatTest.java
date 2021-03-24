package exception;

public class IdFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IdFormatException {
        if (userID == null) {
            throw new IdFormatException("IDはNullではいけません");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IdFormatException("IDの長さを確認してださい");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IdFormatTest idFormatTest = new IdFormatTest();
        String userID = null;
        try {
            idFormatTest.setUserID(userID);
        } catch (IdFormatException e) {
            System.out.println(e);
        }

        userID = "1234";
        try {
            idFormatTest.setUserID(userID);
        } catch (IdFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
